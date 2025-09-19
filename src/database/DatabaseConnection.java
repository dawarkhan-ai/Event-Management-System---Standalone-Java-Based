package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/eventdb";
    private static final String USER = ""; // apna DB username
    private static final String PASSWORD = ""; // apna DB password

    public static Connection getConnection() {
        try {

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Database connected successfully!");
            return conn;
        } catch (SQLException e) {
            System.out.println("❌ Failed to connect to database.");
            e.printStackTrace();
            return null;
        }
    }
}
