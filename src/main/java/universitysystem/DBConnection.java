package universitysystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/university";
        String user = "postgres";
        String password = "Sky@87651";
        return DriverManager.getConnection(url, user, password);
    }
}
