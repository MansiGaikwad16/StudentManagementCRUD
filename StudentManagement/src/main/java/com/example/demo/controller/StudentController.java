package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.service.Studentservice;

@RestController
public class StudentController {
	
	@Autowired
Studentservice studentservice;
	
	@PostMapping("/api/createStudent")
	Student createSutdent(Student student) {
		
		
		
		
		return studentservice.create(student);
		
	}
	
}
