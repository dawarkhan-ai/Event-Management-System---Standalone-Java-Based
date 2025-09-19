package gui;

import service.RegistrationService;
import service.UserService;

import javax.swing.*;
import java.awt.*;

public class RegisterToEventFrame extends JFrame {

    private JTextField emailField, eventIdField;
    private UserService userService = new UserService();
    private RegistrationService registrationService = new RegistrationService();

    public RegisterToEventFrame() {
        setTitle("Register User to Event");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        // Components
        panel.add(new JLabel("User Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Event ID:"));
        eventIdField = new JTextField();
        panel.add(eventIdField);

        JButton registerButton = new JButton("Register");
        panel.add(registerButton);

        add(panel);

        // Action Listener
        registerButton.addActionListener(e -> {
            String email = emailField.getText();
            String eventIdStr = eventIdField.getText();

            if (email.isEmpty() || eventIdStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "❌ All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    int eventId = Integer.parseInt(eventIdStr);
                    int userId = userService.getUserIdByEmail(email);

                    if (userId == -1) {
                        JOptionPane.showMessageDialog(this, "❌ User not found! Please register first.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        registrationService.registerUserToEvent(userId, eventId);
                        JOptionPane.showMessageDialog(this, "✅ User registered to event successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        dispose(); // Close window after registration
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "❌ Event ID must be a number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
