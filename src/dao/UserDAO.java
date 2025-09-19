package dao;

import model.User;
import java.sql.*;
import database.DatabaseConnection;

public class UserDAO {

    public void addUser(User user) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());

            stmt.executeUpdate();
            System.out.println("✅ User added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getUserIdByEmail(String email) {
        String sql = "SELECT user_id FROM users WHERE email = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("user_id");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
