package HospitalDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/hospital_db";  // Database URL (change as per your DB)
        String username = "root";  // Database username
        String password = "MajestyPower22#";  // Database password

        return DriverManager.getConnection(url, username, password);
    }
}