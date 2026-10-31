package universitysystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/university";
        String user = "postgres";
        String password = "your_password";
        return DriverManager.getConnection(url, user, password);
    }
}
