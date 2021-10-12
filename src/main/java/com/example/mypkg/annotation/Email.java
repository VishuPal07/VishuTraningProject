package com.example.mypkg.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy =EmailValidation.class)
public @interface Email {
	String message() default "Enter Valid E-mail";
	Class<?>[] groups() default {};
	public abstract Class<? extends Payload>[] payload() default {};
}
