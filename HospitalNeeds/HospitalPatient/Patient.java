package HospitalNeeds.HospitalPatient;
import HospitalDB.DatabaseConnection;
import java.sql.*;

public class Patient {
    
    // Method to add a new patient
    public static void addPatient(String name, int age, String gender, String contact, String address) {
        String sql = "INSERT INTO Patients (Name, Age, Gender, Contact, Address) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, gender);
            stmt.setString(4, contact);
            stmt.setString(5, address);
            stmt.executeUpdate();
            System.out.println("Patient added successfully.");
        } catch (SQLException e) {
            System.err.println("Error adding patient: " + e.getMessage());
        }
    }

    // Method to view all patients from the database
    public static void viewPatients() {
        String sql = "SELECT * FROM Patients";  // Query to fetch all patient records
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                System.out.println("Patient ID: " + rs.getInt("PatientID"));
                System.out.println("Name: " + rs.getString("Name"));
                System.out.println("Age: " + rs.getInt("Age"));
                System.out.println("Gender: " + rs.getString("Gender"));
                System.out.println("Contact: " + rs.getString("Contact"));
                System.out.println("Address: " + rs.getString("Address"));
                System.out.println("---------------------------");
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving patient data: " + e.getMessage());
        }
    }
}