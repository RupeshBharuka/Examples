package empdatabaseapp;

public class Employee {
	private int empId;
	private String employeeName;
	private String designation;
	private double basicSalary;

	public Employee() {
		this.empId = 0;
		this.employeeName = "";
		this.designation = "";
		this.basicSalary = 0.0d;
	}

	public Employee(int empId, String employeeName, String designation, double basicSalary) {
		this.empId = empId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.basicSalary = basicSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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
