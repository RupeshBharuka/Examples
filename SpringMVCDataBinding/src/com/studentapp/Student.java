package com.studentapp;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
//import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	
//	@Size(min = 3, max = 30) //Remaining with properties file
	// message is custom error message to be displayed
	@Size(min = 3, max = 30, message = "Error ! Length of name should be minimum {min} and maximum {max} characters !")
	@NotEmpty(message = "Please fill up all the fields !")
	@Pattern(regexp="[A-Za-z]*", message="Error! Digits or special characters are not allowed in student name")
	private String studentName;
	
	private Long mobileNumber;
	private Date studentDOB;
	private List<String> listOfStudentSkills;
	
	private Address studentAddress;
	

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public List<String> getListOfStudentSkills() {
		return listOfStudentSkills;
	}

	public void setListOfStudentSkills(List<String> listOfStudentSkills) {
		this.listOfStudentSkills = listOfStudentSkills;
	}

}
