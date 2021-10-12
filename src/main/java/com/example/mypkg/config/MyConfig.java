package com.example.mypkg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.mypkg.services.RoleService;

@Configuration

public class MyConfig {
	@Bean
	public RoleService getRoleService()
	{
		return new RoleService();
	}
	
	
	

}
