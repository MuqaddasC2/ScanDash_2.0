import logic.DatabaseServices;

public class ScanDashApplication {

    public static void main(String[] args) {
        System.out.println("Starting ScanDash Application...");

        // Initialize database service and test connection
        DatabaseServices databaseService = new DatabaseServices();
        databaseService.testConnection();

        // Additional application logic can go here
        System.out.println("Application started successfully.");
    }
}
