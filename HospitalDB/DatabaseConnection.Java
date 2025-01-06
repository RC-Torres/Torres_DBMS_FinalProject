package HospitalDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public static Connection getConnection() throws SQLException {
    String url = "jdbc:mysql://localhost:3306/hospital_db"; 
    String username = "root";  
    String password = "MajestyPower22#"; 

    return DriverManager.getConnection(url, username, password);
}
