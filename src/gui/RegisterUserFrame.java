package gui;

import service.UserService;

import javax.swing.*;
import java.awt.*;

public class RegisterUserFrame extends JFrame {

    private JTextField nameField, emailField;
    private UserService userService = new UserService();

    public RegisterUserFrame() {
        setTitle("Register New User");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        // Components
        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        JButton registerButton = new JButton("Register");
        panel.add(registerButton);

        add(panel);

        // Action Listener
        registerButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();

            if (name.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "❌ All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                userService.registerUser(name, email);
                JOptionPane.showMessageDialog(this, "✅ User registered successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose(); // Close window after registration
            }
        });
    }
}

