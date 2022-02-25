import java.sql.*;

public class Testbase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/new_db","root","root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from new_table");
        while (resultSet.next())
            System.out.println(
                    resultSet.getInt(1) +" "+
                    resultSet.getString(2)+" "+
                    resultSet.getString(3)+" "+
                    resultSet.getString(4));
    }
}
