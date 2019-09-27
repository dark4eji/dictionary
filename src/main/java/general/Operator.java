package general;

import java.sql.*;

public class Operator {
    private Connection con;

    public Operator(Connection con) {
        this.con = con;
    }

    public void getENWord(String table, String enWord) {

        String sql = "SELECT * FROM words WHERE translation LIKE '%" + enWord + "%'";
        printWords(sql);

    }

    public void getRUWord(String ruWord) {
        String sql = "SELECT * FROM words WHERE translation LIKE '%" + ruWord + "%'";
        //System.out.println(sql);
        printWords(sql);
    }

    public void getAllWords(String table) {
        String sql = "SELECT * FROM " + table;
        printWords(sql);
    }

    public void changeWord(String table, String word, String newWord) {
        String sql = "UPDATE " + table + " SET en_word = "
                + "'" + newWord + "' "
                + "WHERE en_word = "
                + "'" + word + "'";

        executeUpdate(sql);
    }

    public void changeTranscription(String table, String word, String transcr) {
        String sql = "UPDATE " + table + " SET transcription = "
                + "'" + transcr + "' "
                + "WHERE en_word = "
                + "'" + word + "'";

        executeUpdate(sql);
    }

    public void changeTranslation(String table, String word, String transl) {
        String sql = "UPDATE " + table + " SET translation = "
                + "'" + transl + "' "
                + "WHERE en_word = "
                + "'" + word + "'";

        executeUpdate(sql);
    }

    public void changeExample(String table, String word, String example) {
        String sql = "UPDATE " + table + " SET example = "
                + "'" + example + "' "
                + "WHERE en_word = "
                + "'" + word + "'";

        executeUpdate(sql);
    }

    public void addWord(String table, String word, String transcr, String transl, String example) {
        try {
            Statement statement = this.con.createStatement();
        } catch (java.sql.SQLException e) {
            System.out.println(e.toString());
        }
    }

    public void addWord(String table, String word, String transcr, String transl) {
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

    public void addWord(String table, String word, String transcr) {
        try {
            Statement statement = this.con.createStatement();
        } catch (java.sql.SQLException e) {
            System.out.println(e.toString());
        }
    }

    public void addWord(String table, String word) {
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

    private void printWords(String sql) {
        try {
            ResultSet rs = this.con.createStatement().executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            while (rs.next()) {
                for (int i = 2; i < columnsNumber; i++)
                    System.out.print(rs.getString(i) + " ");
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
