# 🎓 Student Management System

A simple Student Management System project built using:

- **Backend**: Java with Spring Boot framework  
- **Frontend**: HTML, CSS, JavaScript (React framework)  
- **Database**: H2 Console (configurable to other databases via `application.properties`)

---

## 🚀 Getting Started

### ▶️ Run the Backend

1. Open your IDE or terminal.
2. Navigate to:backend/studentManagement/src/main/java/com/PassFamilyDoddmane/studentManagement
3. Run the main application file: StudentManagementApplication.java
4. The backend server will be available at:
👉 `http://localhost:8080/students`
---


### 🗃️ Access the Database (H2 Console)

- H2 Console URL:  
  👉 `http://localhost:8080/h2-console`

- **Steps:**
  - Keep the default JDBC settings.
  - Click **Connect**.

- **To view student records**, run this SQL query:

```sql
SELECT * FROM STUDENT;```sql





🔧 You can change the database settings in:
backend/studentManagement/src/main/resources/application.properties


💻 Run the Frontend
Open a terminal.
cd frontend
npm install
npm start
The app will launch in your default browser, usually at:
👉 http://localhost:3000

✅ Features
➕ Add student records
❌ Delete student records
⚛️ React-based frontend UI
🌐 Spring Boot-powered RESTful APIs
🛢️ Lightweight H2 in-memory database







