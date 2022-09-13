package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentService {
	 @Autowired
	    private StudentRepository repository;


	    public Student addStudents(Student Students) {
	        return repository.save(Students);
	    }

	    public List<Student> getAllStudents() {
	        return repository.findAll();
	    }
}
