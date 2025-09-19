package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Event Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center window

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        JButton createEventButton = new JButton("Create Event");
        JButton viewEventsButton = new JButton("View Events");
        JButton registerUserButton = new JButton("Register User");
        JButton registerToEventButton = new JButton("Register to Event");
        JButton exitButton = new JButton("Exit");

        panel.add(createEventButton);
        panel.add(viewEventsButton);
        panel.add(registerUserButton);
        panel.add(registerToEventButton);
        panel.add(exitButton);

        add(panel);

        // Action Listeners
        createEventButton.addActionListener(e -> {
            new gui.CreateEventFrame().setVisible(true);
        });

        viewEventsButton.addActionListener(e -> {
            new gui.ViewEventsFrame().setVisible(true);
        });


        registerUserButton.addActionListener(e -> {
            new gui.RegisterUserFrame().setVisible(true);
        });


        registerToEventButton.addActionListener(e -> {
            new gui.RegisterToEventFrame().setVisible(true);
        });


        exitButton.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
