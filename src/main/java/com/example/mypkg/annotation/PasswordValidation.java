package com.example.mypkg.annotation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.stream.*;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.LengthRule;
import org.passay.PasswordData;
import org.passay.PasswordValidator;
import org.passay.RuleResult;
import org.passay.WhitespaceRule;

public class PasswordValidation implements ConstraintValidator<Password, String>{

	@Override
	public boolean isValid(String pwd, ConstraintValidatorContext context) {
		PasswordValidator validator = new PasswordValidator(Arrays.asList(
				new LengthRule(6, 30),
				new CharacterRule(EnglishCharacterData.Digit, 1),
				new CharacterRule(EnglishCharacterData.LowerCase, 1),
				new CharacterRule(EnglishCharacterData.UpperCase, 1),
				new CharacterRule(EnglishCharacterData.Special, 1),
				new WhitespaceRule()
				
				));
		RuleResult result = validator.validate(new PasswordData(pwd));
		if(result.isValid())
		{
			return true;
		}
		List<String> messages = validator.getMessages(result);
		String messageTemplate = messages.stream()
	            .collect(Collectors.joining(","));
		System.out.println(messageTemplate);
		return false;
	}
	
}
