package com.agsft;

public class Student {
	private int studId;
	private String name;
	private Course course;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public String toString(){
		return "[Student Id : " +studId +", Student Name : " +name +", " +course +" ]";
	}
	
}
