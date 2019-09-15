import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private String url;
    private String name;
    private String password;

    public Connector(String url, String name, String password) {
        this.url = url;
        this.name = name;
        this.password = password;
        connectToDB();
    }

    private void connectToDB() {
        try {
            Connection connection = DriverManager.getConnection(this.url, this.name,this.password);
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
