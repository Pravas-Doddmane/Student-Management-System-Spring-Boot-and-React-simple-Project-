-- Create database
CREATE DATABASE student_management;

-- Connect to database (run this in PostgreSQL command line)
-- \c student_management;

-- Create students table
CREATE TABLE students (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    course VARCHAR(100) NOT NULL,
    phone_number VARCHAR(20),
    age INT,
    department VARCHAR(100),
    enrollment_year INT,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);

-- Insert sample data
INSERT INTO students (name, email, course, phone_number, age, department, enrollment_year, created_at, updated_at) VALUES
('John Doe', 'john.doe@example.com', 'Computer Science', '+1234567890', 21, 'Engineering', 2023, NOW(), NOW()),
('Jane Smith', 'jane.smith@example.com', 'Business Administration', '+1234567891', 22, 'Business', 2022, NOW(), NOW()),
('Bob Johnson', 'bob.johnson@example.com', 'Mechanical Engineering', '+1234567892', 23, 'Engineering', 2021, NOW(), NOW());