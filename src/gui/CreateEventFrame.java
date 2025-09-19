package gui;

import service.EventService;

import javax.swing.*;
import java.awt.*;

public class CreateEventFrame extends JFrame {

    private JTextField nameField, dateField, locationField;
    private JTextArea descriptionArea;
    private EventService eventService = new EventService();

    public CreateEventFrame() {
        setTitle("Create New Event");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

        // Components
        panel.add(new JLabel("Event Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Event Date (yyyy-mm-dd):"));
        dateField = new JTextField();
        panel.add(dateField);

        panel.add(new JLabel("Location:"));
        locationField = new JTextField();
        panel.add(locationField);

        panel.add(new JLabel("Description:"));
        descriptionArea = new JTextArea();
        panel.add(new JScrollPane(descriptionArea));

        JButton createButton = new JButton("Create Event");
        panel.add(createButton);

        add(panel);

        // Action Listener
        createButton.addActionListener(e -> {
            String name = nameField.getText();
            String date = dateField.getText();
            String location = locationField.getText();
            String description = descriptionArea.getText();

            if (name.isEmpty() || date.isEmpty() || location.isEmpty() || description.isEmpty()) {
                JOptionPane.showMessageDialog(this, "❌ All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                eventService.createEvent(name, date, location, description);
                JOptionPane.showMessageDialog(this, "✅ Event created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose(); // Close window after creation
            }
        });
    }
}

