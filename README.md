# 🎯 Event Management System (Java + MySQL)

A modular **GUI-based Event Management System** built using **Java Swing and MySQL**. 
This application allows event creation, user registration, and user enrollment into events 
using an interactive Graphical User Interface.

---

## 📚 Features

- 📝 Create Event (via GUI Form)
- 📅 View All Events (in Table View)
- 👤 Register New User
- 🔗 Register User to Event
- 🖥️ Full GUI experience using Java Swing
- 📦 Modular Design using DAO and Service Layers
- 💬 User-friendly Dialog Messages

---

## 🧰 Tech Stack

- **Language**: Java (Core + Swing + JDBC)
- **Database**: MySQL
- **GUI Toolkit**: Java Swing
- **IDE**: IntelliJ IDEA / Eclipse / VS Code
- **Tools**: MySQL Workbench / phpMyAdmin / DBeaver

---

## 🏗️ Project Directory Structure

```
EventManagementSystem/
├── src/
│   ├── main/
│   │   └── MainFrame.java
│   ├── gui/
│   │   ├── CreateEventFrame.java
│   │   ├── ViewEventsFrame.java
│   │   ├── RegisterUserFrame.java
│   │   └── RegisterToEventFrame.java
│   ├── dao/
│   ├── service/
│   ├── model/
│   └── database/
├── EventManagementSystem.sql
├── README.md
├── Thesis.pdf
```

---

## 🛠️ How to Run

1. **Database Setup:**
   - Import and execute `EventManagementSystem.sql` in MySQL Workbench or phpMyAdmin.
   - Make sure the `EventManagementSystem` schema and all required tables are created.

2. **Java Setup:**
   - Configure database credentials in `DatabaseConnection.java`.
   - Compile all Java files:

```bash
cd src/

javac -encoding UTF-8 -cp ".;../lib/mysql-connector-java-8.x.x.jar" main/MainFrame.java gui/*.java dao/*.java service/*.java model/*.java database/*.java


```

3. **Run the Application:**
```bash
java -cp ".;../lib/mysql-connector-java-8.x.x.jar" main.MainFrame

```

---

## 📋 Database Tables

- **users** (`id`, `name`, `email`)
- **events** (`id`, `name`, `date`, `location`, `description`)
- **registrations** (`id`, `user_id`, `event_id`)

---



## 🚀 Future Scope

- Implement authentication system (Admin/User login).
- Enhance GUI aesthetics with advanced layouts and themes.
- Integrate email notification system.
- Expand to a Web Application using Spring Boot or Node.js.

---

## 👤 Author

**MD Dawar Khan**  
B.Tech CSE AIML Specializtion, Shri Shankaracharya Technical Campus, Bhilai  
Sem 4 2025 Mini Project - April 2025

---

## 📄 License

This project is created for educational and learning purposes only.