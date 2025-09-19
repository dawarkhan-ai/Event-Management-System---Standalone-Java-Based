package model;

import java.sql.Date;

public class Event {
    private int eventId;
    private String name;
    private Date date;
    private String location;
    private String description;

    public Event(int eventId, String name, Date date, String location, String description) {
        this.eventId = eventId;
        this.name = name;
        this.date = date;
        this.location = location;
        this.description = description;
    }

    public Event(String name, Date date, String location, String description) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.description = description;
    }

    // Getters and Setters
    public int getEventId() { return eventId; }
    public void setEventId(int eventId) { this.eventId = eventId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
