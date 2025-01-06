package HospitalNeeds;

import java.util.Scanner;

import HospitalNeeds.HospitalPatient.Patient;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Hospital Management System ===");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter Gender (Male/Female): ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();

                    Patient.addPatient(name, age, gender, contact, address);
                    break;

                case 2:
                    Patient.viewPatients();
                    break;

                case 3:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}