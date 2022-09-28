package com.demo.service.impl;

import java.util.*;

import com.demo.models.Student;
import com.demo.service.StudentService;

public class StudentServiceImpl implements StudentService {

	List<Student> students = new ArrayList<Student>();
	
	@Override
	public String insertStudent(Student student) {
		 this.students.add(student);
		return "Student Inserted SuccessFully !!";
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return students;
	}

}
