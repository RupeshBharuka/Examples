package com.agsft;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String designation;
	private double basicSalary;

	public Employee() {
		this.employeeId = 0;
		this.firstName = null;
		this.lastName = null;
		this.designation = null;
		this.basicSalary = 0.0d;
	}

	public Employee(int employeeId, String firstName, String lastName, String designation, double basicSalary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.basicSalary = basicSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

}
