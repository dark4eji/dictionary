public class Inpoint {
    public static void main(String[] args) {
        Connector connector = new Connector("jdbc:mysql://localhost/sq?serverTimezone=Europe/Moscow&useSSL=false",
                "root",
                "Kakashisensei1");
    }
}
