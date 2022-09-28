package com.demo.models;

public class Student {
	
	//properties //fields //variables
	private int studentId;
	private String studentName;
	private String studentClass;
	private String studentRollNo;
	//properties //fields //variables   ---- end
	
	
	// constructors of Student Class
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentClass, String studentRollNo) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentRollNo = studentRollNo;
	}
	
	// getter setters
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", studentRollNo=" + studentRollNo + "]";
	}
	
}
