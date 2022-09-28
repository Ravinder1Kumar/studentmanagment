package com.demo.models;

public class StudentAddress {
	
	private String studentAddress;

	public StudentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentAddress(String studentAddress) {
		super();
		this.studentAddress = studentAddress;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "StudentAddress [studentAddress=" + studentAddress + "]";
	}
	
	

}
