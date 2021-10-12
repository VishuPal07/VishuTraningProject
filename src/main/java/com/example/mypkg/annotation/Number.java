package com.example.mypkg.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NumberValidation.class)
public @interface Number {
	String message() default "Enter Valid Phone Number";
	Class<?>[] groups() default {};
	public abstract Class<? extends Payload>[] payload() default {};
}
