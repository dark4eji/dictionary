import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Operator {
    private Connection con;

    public Operator(Connection con) {
        this.con = con;
    }

    public void changeWord(String word, String newWord) {
        String sql = "UPDATE words SET en_word = "
                + "'" + newWord + "' "
                + "WHERE en_word = "
                + "'" + word + "'";

        //System.out.println(sql);
        executeUpdate(sql);
    }

    public void changeTranscription(String table, String word, String transcr) {

    }

    public void changeTranslation(String table, String word, String transl) {

    }

    public void changeExample(String table, String word, String example) {

    }

    public void insert(String table, String word, String transcr, String transl, String example) {
        try {
            Statement statement = this.con.createStatement();
        } catch (java.sql.SQLException e) {
            System.out.println(e.toString());
        }
    }

    public void insert(String table, String word, String transcr, String transl) {
            String sql = "INSERT INTO " + table + " (en_word, transcription, translation)"
                    + " VALUES ('"
                    + word
                    + "', '"
                    + transcr
                    + "', '"
                    + transl
                    + "')";
            //System.out.println(sql);
            executeUpdate(sql);
    }

    public void insert(String table, String word, String transcr) {
        try {
            Statement statement = this.con.createStatement();
        } catch (java.sql.SQLException e) {
            System.out.println(e.toString());
        }
    }

    public void insert(String table, String word) {
        try {
            Statement statement = this.con.createStatement();
        } catch (java.sql.SQLException e) {
            System.out.println(e.toString());
        }
    }

    private void executeUpdate(String query) {
        try {
            this.con.createStatement().executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
