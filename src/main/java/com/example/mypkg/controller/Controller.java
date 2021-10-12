package com.example.mypkg.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
	
	Logger logger = LoggerFactory.getLogger(Controller.class);
	
	@Autowired   
	private MessageSource messageSource; 
	
	@RequestMapping("/hello")
	public String get()
	{
//		logger.error("error happend");
//		logger.warn("warn happend");
//		logger.info("info happend");
//		logger.debug("debug happend");
//		String s="kk";
//		if(s.length()==2)
//			throw new RuntimeException("Exception");
		return "hello";
	}
	
	@GetMapping("/world")
	public String getr(@RequestHeader(name="Accept-Language", required=false) Locale locale)
	{
		return messageSource.getMessage("good.morning.message", null, locale);  
	}
	
	
}
