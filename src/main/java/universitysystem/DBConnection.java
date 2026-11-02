package universitysystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/University Management System";
        String user = "postgres";
        String password = System.getenv("Sky@87653");
        return DriverManager.getConnection(url, user, password);

    }
}
