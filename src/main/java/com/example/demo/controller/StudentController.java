package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
    private StudentService service;

    @GetMapping("/Devices")
    public List<Student> getStudents(){
        return service.getAllStudents();
    }

    @PostMapping("/Devices")
    public Student saveStudents(@RequestBody Student Students) {
        return service.addStudents(Students);
    }
}
