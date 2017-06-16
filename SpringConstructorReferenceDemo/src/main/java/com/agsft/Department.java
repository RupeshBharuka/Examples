package com.agsft;

public class Department {
	
	private String departmentName;
	private Employee employee;
	
	public Department(String depName, Employee empRef){
		this.departmentName = depName;
		this.employee = empRef;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getEmployeeName(){
		return (employee.getEmpName());
	}
	
}
