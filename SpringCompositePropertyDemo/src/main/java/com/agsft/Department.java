package com.agsft;

public class Department {
	private Employee employee;
	private String deptName;

	public Department(){
		employee = new Employee();
		
	}
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
