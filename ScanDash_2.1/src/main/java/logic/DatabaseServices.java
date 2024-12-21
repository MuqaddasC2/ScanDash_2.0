package logic;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseServices {

    private final DatabaseConnection databaseConnection;

    public DatabaseServices() {
        this.databaseConnection = new DatabaseConnection();
    }

    public void testConnection() {
        try (Connection connection = databaseConnection.getConnection()) {
            if (connection != null) {
                System.out.println("Connected to the database successfully!");
            }
        } catch (SQLException e) {
            System.err.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
