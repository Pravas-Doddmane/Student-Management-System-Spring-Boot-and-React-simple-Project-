package com.PassFamilyDoddmane.studentManagement.repository;

import com.PassFamilyDoddmane.studentManagement.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Find by email
    Student findByEmail(String email);

    // Find by course
    List<Student> findByCourse(String course);

    // Find by department
    List<Student> findByDepartment(String department);

    // Search students by name, email, course, or department
    @Query("SELECT s FROM Student s WHERE " +
            "LOWER(s.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(s.email) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(s.course) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(s.department) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    Page<Student> searchStudents(@Param("keyword") String keyword, Pageable pageable);

    // Check if email exists
    boolean existsByEmail(String email);
}