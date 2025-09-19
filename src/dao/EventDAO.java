package dao;

import model.Event;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import database.DatabaseConnection;

public class EventDAO {

    public void addEvent(Event event) {
        String sql = "INSERT INTO events (name, date, location, description) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, event.getName());
            stmt.setDate(2, event.getDate());
            stmt.setString(3, event.getLocation());
            stmt.setString(4, event.getDescription());

            stmt.executeUpdate();
            System.out.println("✅ Event added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Event> getAllEvents() {
        List<Event> events = new ArrayList<>();
        String sql = "SELECT * FROM events";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Event event = new Event(
                        rs.getInt("event_id"),
                        rs.getString("name"),
                        rs.getDate("date"),
                        rs.getString("location"),
                        rs.getString("description")
                );
                events.add(event);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return events;
    }
}
