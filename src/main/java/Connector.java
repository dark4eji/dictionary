import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private String url;
    private String name;
    private String password;
    private Connection con;

    public Connector(String url, String name, String password) {
        this.url = url;
        this.name = name;
        this.password = password;
        connectToDB();
    }

    private void connectToDB() {
        try {
            this.con = DriverManager.getConnection(this.url, this.name,this.password);
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public void getName() {
        try {
            DatabaseMetaData dbm = con.getMetaData();
            System.out.println(dbm.getDatabaseProductName());
        } catch (java.sql.SQLException e) {
            System.out.println(e.toString());
        }
    }

    public void close() {
        try {
            this.con.close();
        } catch (java.sql.SQLException e) {
            System.out.println(e.toString());
        }
    }

    public Connection getConnector() {
        return this.con;
    }
}
