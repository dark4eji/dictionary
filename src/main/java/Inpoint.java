public class Inpoint {
    public static void main(String[] args) {
        Connector connector = new Connector("jdbc:mysql://localhost:3306/dictionary?serverTimezone=Europe/Moscow&useSSL=false",
                "root",
                "1234");
        Operator operator = new Operator(connector.getConnector());
        operator.changeWord("dog", "male");
        connector.close();
    }
}
