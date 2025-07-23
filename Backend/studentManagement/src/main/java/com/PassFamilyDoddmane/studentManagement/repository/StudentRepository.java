package com.PassFamilyDoddmane.studentManagement.repository;

import com.PassFamilyDoddmane.studentManagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {}
