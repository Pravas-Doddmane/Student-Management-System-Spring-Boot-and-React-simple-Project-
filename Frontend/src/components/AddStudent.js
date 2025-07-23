import React, { useState } from 'react';
import { addStudent } from '../services/studentService';

function AddStudent({ onStudentAdded }) {
  // Initialize form state
  const [student, setStudent] = useState({
    name: '',
    email: '',
    course: ''
  });

  // Handle input changes
  const handleChange = (e) => {
    setStudent({
      ...student,
      [e.target.name]: e.target.value
    });
  };

  // Handle form submission
  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      await addStudent(student); // Send student to backend
      setStudent({ name: '', email: '', course: '' }); // Reset form

      if (typeof onStudentAdded === 'function') {
        onStudentAdded(); // Notify parent to refresh list
      }

      alert('✅ Student added successfully!');
    } catch (error) {
      console.error('❌ Failed to add student:', error);
      alert('❌ Failed to add student.');
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <h3>Add Student</h3>
      <input
        type="text"
        name="name"
        value={student.name}
        onChange={handleChange}
        placeholder="Name"
        required
      /><br /><br />

      <input
        type="email"
        name="email"
        value={student.email}
        onChange={handleChange}
        placeholder="Email"
        required
      /><br /><br />

      <input
        type="text"
        name="course"
        value={student.course}
        onChange={handleChange}
        placeholder="Course"
        required
      /><br /><br />

      <button type="submit">Add</button>
    </form>
  );
}

export default AddStudent;
