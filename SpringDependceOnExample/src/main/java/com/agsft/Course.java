package com.agsft;

public class Course {
	private String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String toString(){
		return "[Course Name : " +courseName +" ]";
	}
	
}
