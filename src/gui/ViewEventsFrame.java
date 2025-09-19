package gui;

import model.Event;
import service.EventService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class ViewEventsFrame extends JFrame {

    private EventService eventService = new EventService();
    private JTable eventsTable;

    public ViewEventsFrame() {
        setTitle("View All Events");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Table Model
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Event ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Date");
        tableModel.addColumn("Location");
        tableModel.addColumn("Description");

        // Load Events
        List<Event> events = eventService.getAllEvents();
        for (Event event : events) {
            tableModel.addRow(new Object[]{
                    event.getEventId(),
                    event.getName(),
                    event.getDate(),
                    event.getLocation(),
                    event.getDescription()
            });
        }

        eventsTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(eventsTable);

        add(scrollPane, BorderLayout.CENTER);
    }
}
