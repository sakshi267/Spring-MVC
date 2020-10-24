package com.java.springmvc.customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    public  String coursePrefix;	
	
    @Override
	public void initialize(CourseCode theCourseCode) {
		
	coursePrefix= theCourseCode.value();
	
	}
	
	
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result;
		
		if(theCode!= null) {
			result= theCode.startsWith(coursePrefix);
		
		}
		else
		result=true;
		
		return result;
	}

}

	
	

	
	


