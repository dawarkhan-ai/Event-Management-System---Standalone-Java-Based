package dao;

import model.Registration;
import java.sql.*;
import database.DatabaseConnection;

public class RegistrationDAO {

    public void registerUserToEvent(Registration reg) {
        String sql = "INSERT INTO registrations (user_id, event_id) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, reg.getUserId());
            stmt.setInt(2, reg.getEventId());

            stmt.executeUpdate();
            System.out.println("✅ Registration successful!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
