package esad.chapter1.task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author: grisha_angelov
 */
public class PostgreConnectionProvider {

    public Connection getConnection(String dbName, String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://myhost/" + dbName,
                username,
                password
        );
        return connection;
    }
}
