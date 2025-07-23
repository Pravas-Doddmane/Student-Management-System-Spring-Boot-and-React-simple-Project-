Student Management System
This is a simple Student Management System project built using:
Backend: Java with Spring Boot framework
Frontend: HTML, CSS, JavaScript (React framework)
Database: H2 Console (You can configure another database via application.properties)

🚀 Getting Started
1. Run the Backend:
Navigate to:
backend/studentManagement/src/main/java/com/PassFamilyDoddmane/studentManagement
Run the file:
StudentManagementApplication.java
Once started, the backend will run on:
👉 http://localhost:8080/students

2. Access the Database
H2 Console is available at:
👉 http://localhost:8080/h2-console
Leave the defaults as-is and click Connect.

To view student records, run this SQL query:
SELECT * FROM STUDENT;
You can change the database configuration in
backend/studentManagement/src/main/resources/application.properties

3. Run the Frontend
Navigate to the frontend folder in terminal and run:
npm start
This will launch the React frontend of the application.

✅ Features
Add, and delete student records.
React-based frontend UI.
Spring Boot-powered RESTful APIs.
Lightweight H2 in-memory database.
