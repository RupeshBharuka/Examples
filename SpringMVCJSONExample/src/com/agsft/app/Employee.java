package com.agsft.app;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/*
 * If we are setting values for specific properties then other properties will have null value
 * and we have requirement as dont send the properties which has null values then use @JsonInclude annotation
 * */
@JsonInclude(JsonInclude.Include.NON_NULL)
/*
 * 
 * Specifying the customized order in which data to be displayed to the client
 * rather than displaying in the default order decided by the Json
 * 
 */
@JsonPropertyOrder({"empName", "empId"})
public class Employee {
	
	/*
	 * If you want to display some other name of field by sending response as Json 
	 * to client then @JsonProperty annotation can be used
	 * 	Eg. Here, Employee_Id and Employee_Name will be displayed to client in response instead of empId and empName 
	*/
	@JsonProperty("Employee_Id")
	private int empId;
	
	@JsonProperty("Employee_Name")
	private String empName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
