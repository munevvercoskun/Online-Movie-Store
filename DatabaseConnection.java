import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DatabaseConnection {
 public Connection connection = null;
 public boolean createConnection() {
 try {
    Class.forName("oracle.jdbc.driver.OracleDriver");
 } catch (ClassNotFoundException e) {
    return false;
 }
 try {
     connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "nabil", "Nabdude24");
     System.out.println("Connected!");
     return true;
 } catch (SQLException e) {
 e.printStackTrace();
    return false;
 }
 }
 public ResultSet executeQuery(String query) {
 try {
     Statement statement = connection.createStatement();
     ResultSet resultSet = statement.executeQuery(query);
     return resultSet;
 }
 catch (SQLException e) {
     e.printStackTrace();
     return null;
 }
 }
}