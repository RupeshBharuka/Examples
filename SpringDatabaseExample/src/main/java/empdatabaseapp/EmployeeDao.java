package empdatabaseapp;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addEmployee(Employee e) {
		String query = "insert into employee values('" + e.getEmpId() + "','" + e.getEmployeeName() + "', '"
				+ e.getDesignation() + "', '" + e.getBasicSalary() + "')";
		
		return jdbcTemplate.update(query);
	}
	
	
	public int updateEmployee(Employee e){
		String query = "update employee set empname='"+e.getEmployeeName()+"', designation='"+e.getDesignation()+"', basicsalary='"+e.getBasicSalary()+"' where empid='"+e.getEmpId()+"'";
		return jdbcTemplate.update(query);		
	}
	
	public int deleteEmployee(Employee e){  
	    String query=" delete from employee where empid='"+e.getEmpId()+"' ";
	    return jdbcTemplate.update(query);  
	}  

}
