package com.PassFamilyDoddmane.studentManagement.service;

import com.PassFamilyDoddmane.studentManagement.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    Student getStudentById(Long id);

    Page<Student> getAllStudents(Pageable pageable);

    Page<Student> searchStudents(String keyword, Pageable pageable);

    List<Student> getStudentsByCourse(String course);

    List<Student> getStudentsByDepartment(String department);

    Student updateStudent(Long id, Student studentDetails);

    void deleteStudent(Long id);

    boolean emailExists(String email);
}