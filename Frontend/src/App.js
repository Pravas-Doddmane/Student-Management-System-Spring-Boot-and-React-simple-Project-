import React, { useState } from 'react';
import './App.css';
import AddStudent from './components/AddStudent';
import StudentList from './components/StudentList';

function App() {
  const [refresh, setRefresh] = useState(false);

  const handleStudentAdded = () => {
    setRefresh(!refresh);
  };

  return (
    <div className="App">
      <h1>📚 Student Management System</h1>
      <AddStudent onStudentAdded={handleStudentAdded} /> {/* ✅ Pass it here */}
      <StudentList key={refresh} />
    </div>
  );
}

export default App;
