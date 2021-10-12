package com.example.mypkg.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NumberValidation implements ConstraintValidator<Number, String>{

	@Override
	public boolean isValid(String num, ConstraintValidatorContext context) {
		if(num.length() > 10) {
			System.out.println("Number is Invalid ");
			return false;
		}
		else 
			return true;
		
		
	}

}
