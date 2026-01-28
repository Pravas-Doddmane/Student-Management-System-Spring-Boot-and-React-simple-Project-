package com.PassFamilyDoddmane.studentManagement.service.impl;

import com.PassFamilyDoddmane.studentManagement.model.Student;
import com.PassFamilyDoddmane.studentManagement.exception.StudentNotFoundException;
import com.PassFamilyDoddmane.studentManagement.repository.StudentRepository;
import com.PassFamilyDoddmane.studentManagement.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    @Transactional
    public Student createStudent(Student student) {
        // Check if email already exists
        if (emailExists(student.getEmail())) {
            throw new IllegalArgumentException("Email already exists: " + student.getEmail());
        }
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student not found with id: " + id));
    }

    @Override
    public Page<Student> getAllStudents(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @Override
    public Page<Student> searchStudents(String keyword, Pageable pageable) {
        return studentRepository.searchStudents(keyword, pageable);
    }

    @Override
    public List<Student> getStudentsByCourse(String course) {
        return studentRepository.findByCourse(course);
    }

    @Override
    public List<Student> getStudentsByDepartment(String department) {
        return studentRepository.findByDepartment(department);
    }

    @Override
    @Transactional
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = getStudentById(id);

        // Check if email is being changed and if it already exists
        if (!student.getEmail().equals(studentDetails.getEmail()) &&
                emailExists(studentDetails.getEmail())) {
            throw new IllegalArgumentException("Email already exists: " + studentDetails.getEmail());
        }

        // Update fields
        student.setName(studentDetails.getName());
        student.setEmail(studentDetails.getEmail());
        student.setCourse(studentDetails.getCourse());
        student.setPhoneNumber(studentDetails.getPhoneNumber());
        student.setAge(studentDetails.getAge());
        student.setDepartment(studentDetails.getDepartment());
        student.setEnrollmentYear(studentDetails.getEnrollmentYear());

        return studentRepository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        studentRepository.delete(student);
    }

    @Override
    public boolean emailExists(String email) {
        return studentRepository.existsByEmail(email);
    }
}