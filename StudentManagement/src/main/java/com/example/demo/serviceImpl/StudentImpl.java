package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repo.StudentRepo;
import com.example.demo.service.Studentservice;

@Service
public class StudentImpl implements Studentservice{

	@Autowired
	
	StudentRepo studentRepo;
	@Override
	public Student create(Student student) {
		
		return studentRepo.save(student);
	}
	

}
