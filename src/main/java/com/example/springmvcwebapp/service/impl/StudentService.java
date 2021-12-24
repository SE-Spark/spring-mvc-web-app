package com.example.springmvcwebapp.service.impl;

import com.example.springmvcwebapp.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student SaveStudent(Student st);
    Student GetStudentById(Long id);
    Student updateStudent(Student st);
    void deleteStudentById(Long id);
}
