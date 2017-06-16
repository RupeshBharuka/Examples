package collegeapp;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;
	private Integer age;

	
	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public Integer getAge() {
		return age;
	}

	@Required
	public void setAge(Integer age) {
		this.age = age;
	}

}
