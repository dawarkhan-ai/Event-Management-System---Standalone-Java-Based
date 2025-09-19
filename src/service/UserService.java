package service;

import dao.UserDAO;
import model.User;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public void registerUser(String name, String email) {
        if (email.contains("@")) {
            User user = new User(name, email);
            userDAO.addUser(user);
        } else {
            System.out.println("❌ Invalid email address.");
        }
    }

    public int getUserIdByEmail(String email) {
        return userDAO.getUserIdByEmail(email);
    }
}
