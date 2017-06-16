package com.agile.app.Model;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private double basicSal;

	public Employee(){
		
	}
	
	public Employee(int empId, String firstName, String lastName, double basicSal) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.basicSal = basicSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", basicSal="
				+ basicSal + "]";
	}
	
}
