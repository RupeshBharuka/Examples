package springinitanddestroycallbacks;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Calculation {
	private int number1;
	private int number2;
	private int result;
		
	
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	
	
	/*
	 * 
	 * @PostConstruct annotation, 
	 * 		defines a method that will be called after a bean has been fully initialized  
	*/
	@PostConstruct
	public void performInitOperation(){
		// doing some operation just to make sure 
		// it is happening after construction of object
		
		this.result = this.number1 + this.number2;
		
		System.out.println("Inside init operation method");
	}

	
	/*
	 * 
	 * @PreDestroy annotation, 
	 * 		defines a method that will be called just before a bean is destroyed  
	*/
	@PreDestroy
	public void performCleanUpOperation(){
		
		System.out.println("Inside clean up operation method");
		
		this.number1 = 0; 
		this.number2 = 0;
		this.result  = 0;
	}
	
	public String toString(){
		return "Number1 : " +this.number1 +"\n"
			   +"Number2 : " +this.number2 +"\n"
			   +"Result : " +this.result;
	}
	
}
