package com.example.springmvcwebapp.repository;

import com.example.springmvcwebapp.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
