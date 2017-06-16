package app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.agsft.Address;
import com.agsft.Company;
import com.agsft.Employee;

@Component("EmployeeConfig")
public class EmployeeConfig {

	@Bean(name = "employee")
	public Employee getEmployee() {
		return new Employee();
	}

	@Bean(name = "company")
	public Company getCompany() {
		return new Company("Agile Soft");
	}

	@Bean(name = "address")
	public Address getAddress() {
		return new Address("Pune");
	}

}
