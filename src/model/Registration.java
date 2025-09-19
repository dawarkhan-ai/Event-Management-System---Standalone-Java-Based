package model;

public class Registration {
    private int regId;
    private int userId;
    private int eventId;

    public Registration(int regId, int userId, int eventId) {
        this.regId = regId;
        this.userId = userId;
        this.eventId = eventId;
    }

    public Registration(int userId, int eventId) {
        this.userId = userId;
        this.eventId = eventId;
    }

    // Getters and Setters
    public int getRegId() { return regId; }
    public void setRegId(int regId) { this.regId = regId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public int getEventId() { return eventId; }
    public void setEventId(int eventId) { this.eventId = eventId; }
}
