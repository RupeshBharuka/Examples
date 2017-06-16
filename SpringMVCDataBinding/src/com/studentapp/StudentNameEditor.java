package com.studentapp;

import java.beans.PropertyEditorSupport;

/*
 * Example of user defined property editor class
 * 
 * PropertyEditorSupport is a support class to help build 
 * property editors
 *  
*/

public class StudentNameEditor extends PropertyEditorSupport{
	
	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		if(studentName.contains("Mr.") || studentName.contains("Ms."))
			setValue(studentName); //sets the object to be edited
		else
			setValue("Mr. " +studentName); // if nothing is specified default Mr. is attached with the name
	}
}
