package com.example.mypkg.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation implements ConstraintValidator<Email, String>{
	private String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			 + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		Pattern p = Pattern.compile(regex);
		if(email.length() == 0) {
			System.out.println("Email is Empty");
			return false;
		}
		Matcher m = p.matcher(email);
		if(m.matches() == false) {
			System.out.println("Invalid Email");
			return false;
		}
			
//		System.out.println(m.matches());
		return true;
	}

}
