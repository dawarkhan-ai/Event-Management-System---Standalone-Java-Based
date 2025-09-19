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

✅ Step 1. Clone the Project

✅ Step 2 : Setup JDK and IntelliJ in PC

✅ Step 4: Setup the MySQL Database Management System

✅ Step 5: Build the MySQL Database 

Goto System Terminal:
   - ensure MySql DBMS setup is done or not  by 
            `mysql --version`
         
   - opens terminal and login your mysql account by
      	   `mysql -u root -p`
	
opens project folder from file manager and then open .sql file and copy all codes as it is and paste it in your windows command promt or other terminal.

✅ Step 6: Update DB Connection Details in Code

this is current code in your src/Database/Database.java
    
    private static final String USER = ""; // apna DB username  
    private static final String PASSWORD = ""; // apna DB password
    


✅ Step 7:  Run the Project
Option A : Run from .bat file (easy)
	Open the main java project folder in file manager and double clicks on the run_project file. It is a .bat file which indirectly works on windows terminal and automatically compile and run java file.

Option B : Open Project in IntelliJ (Advanced)
1.	Open IntelliJ IDEA.
2.	Go to File → Open → Select the extracted folder (YourJavaProject).
3.	Wait for indexing to complete. 

then go to IntelliJ terminal -
     Run from Terminal 
1.	Navigate to src/
cd src/
2.	Compile:
 javac -encoding UTF-8 -cp ".;../lib/mysql-connector-java-8.x.x.jar" main/MainFrame.java gui/*.java dao/*.java service/*.java model/*.java database/*.java
3.	Run:
           	java -cp ".;../lib/mysql-connector-java-8.x.x.jar" main.MainFrame

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
