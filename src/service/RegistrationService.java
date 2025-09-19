package service;

import dao.RegistrationDAO;
import model.Registration;

public class RegistrationService {
    private RegistrationDAO registrationDAO = new RegistrationDAO();

    public void registerUserToEvent(int userId, int eventId) {
        if (userId <= 0 || eventId <= 0) {
            System.out.println("❌ Invalid user or event ID.");
            return;
        }
        Registration registration = new Registration(userId, eventId);
        registrationDAO.registerUserToEvent(registration);
    }
}

