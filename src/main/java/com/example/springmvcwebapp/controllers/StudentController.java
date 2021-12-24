package com.example.springmvcwebapp.controllers;

import com.example.springmvcwebapp.models.Student;
import com.example.springmvcwebapp.service.impl.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    private StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public  String listStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return  "students";
    }
    @GetMapping("/students/new")
    public  String createStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";
    }
    @PostMapping("/students")
    public String SaveStudent(@ModelAttribute("student") Student st){
        studentService.SaveStudent(st);
        return "redirect:/students";
    }
    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable Long id,Model model){
        model.addAttribute("student",studentService.GetStudentById(id));
        return "edit_sudent";
    }
    @PostMapping("/students/{id}")
    public String updateStudents(
            @PathVariable Long id,
            @ModelAttribute("student")Student st,
            Model model
    ){
        Student student = studentService.GetStudentById(id);
        student.setFirstname(st.getFirstname());
        student.setLastname(st.getLastname());
        student.setCity(st.getCity());
        student.setCountry(st.getCountry());
        studentService.updateStudent(student);
        return "redirect:/students";
    }
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
