package com.demo.service;

import com.demo.models.Student;
import java.util.*;

public interface StudentService {
	public String insertStudent(Student student);
	public List<Student> getAllStudents();
	public Student getStudentById(int id);
}
