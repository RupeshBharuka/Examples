package com.junit.testing.example;

/*
 * asssertEquals is a static method which we can use in 2 different ways
 * 	1)By static import - we dont have to write class name each time
 *  2)By calling method with class name
*/
//import static org.junit.Assert.assertEquals;
import org.junit.Test;
import junit.framework.Assert;

public class MyFirstTest {

	@Test
	public void testAddition(){
		int result = 2+2;
		Assert.assertEquals("2+2 = 4",4,result);
	}
	
	@Test
	public void testSubtraction(){
		int result = 2-2;
		Assert.assertEquals("2-2 = 0",1,result); //assertion fail scenario
	}
	

	@Test
	public void testDivision(){
		int result = 4/2;
		Assert.assertEquals("4/2 = 2",2,result); //assertion fail scenario
	}
	

	@Test
	public void checkIntValue(){
		//Integer class present in java.lang package
		//No need to import because "java.lang" is the only package which is by default available  
		Integer value = new Integer(4); 
		Assert.assertEquals("value = 4", 4, value.intValue());
	
		Integer value2 = new Integer("50");
		Assert.assertEquals("value = 50", 50, value2.intValue());
	
		Integer value3 = 60; //Auto-boxing
		Assert.assertEquals("Auto-boxing = 60", 60, value3.intValue());
	
	}
	
	@Test
	public void testMinValue(){
		
		Assert.assertEquals("Min value = ",-2147483648,Integer.MIN_VALUE); //assertion fail scenario
	}
	
	
	@Test
	public void testInstances(){
		Integer value1 = new Integer(4);
		Integer value2 = new Integer(4);
		
		Assert.assertTrue(value1 == value2); //assertion fail scenario
		Assert.assertTrue(value1 != value2); //assertion pass scenario
	}
	
}
