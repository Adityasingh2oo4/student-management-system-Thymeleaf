package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    // List students
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "students";
    }

    // Show add student form
    @GetMapping("/students/add")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    // Save student
    @PostMapping("/students/save")
    public String saveStudent(Student student) {
        service.saveStudent(student);
        return "redirect:/students";
    }
}
