import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCheck {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://oracle.sathvikks.com:3306/training_sathvik";
            con = DriverManager.getConnection(url, "sathvik", "Sathvikks71!");
            System.out.println("Connection is Successful");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
