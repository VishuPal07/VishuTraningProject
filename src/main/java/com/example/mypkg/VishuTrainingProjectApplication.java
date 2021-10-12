package com.example.mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.mypkg.AOP.Student;
import com.example.mypkg.repositry.UserRepositry;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class VishuTrainingProjectApplication {

	
	
	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(VishuTrainingProjectApplication.class, args);
		UserRepositry ur = context.getBean(UserRepositry.class);
	
//		SpringApplication.run(VishuTrainingProjectApplication.class, args);
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(VishuTrainingProjectApplication.class);
//		RoleService us = ctx.getBean(RoleService.class);
//		System.out.println("user service"+us.getList());
		Student s = (Student)context.getBean(Student.class);
		s.study();
		
		s.studyA(5);
		s.doexc();
		
		
	}

}
