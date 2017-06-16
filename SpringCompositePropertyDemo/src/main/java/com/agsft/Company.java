package com.agsft;

public class Company {
	private Department department;
	
	public Company(){
		department =  new Department();
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
