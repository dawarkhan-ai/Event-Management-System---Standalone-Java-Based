package service;

import dao.EventDAO;
import model.Event;

import java.sql.Date;
import java.util.List;

public class EventService {
    private EventDAO eventDAO = new EventDAO();

    public void createEvent(String name, String dateStr, String location, String description) {
        try {
            Date date = Date.valueOf(dateStr);
            Event event = new Event(name, date, location, description);
            eventDAO.addEvent(event);
        } catch (Exception e) {
            System.out.println("❌ Invalid event data: " + e.getMessage());
        }
    }

    public List<Event> getAllEvents() {
        return eventDAO.getAllEvents();
    }
}
