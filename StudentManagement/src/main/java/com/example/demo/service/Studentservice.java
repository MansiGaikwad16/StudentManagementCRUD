package com.example.demo.service;

import com.example.demo.Entity.Student;

public interface Studentservice {
	//we perform insert ,update,delete operation using id so in this we define id here
	
	Student create(Student student);
	
	//Student in this is datatype 

}
