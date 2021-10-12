package com.example.mypkg.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SuppressWarnings("deprecation")
@Configuration
public class Internationalization extends WebMvcConfigurerAdapter{

	@Bean  
	public  LocaleResolver localeResolver()  
	{  
	SessionLocaleResolver localeResolver = new SessionLocaleResolver();  
	localeResolver.setDefaultLocale(Locale.US);  
	return localeResolver;  
	}  
	@Bean  
	public ResourceBundleMessageSource bundleMessageSource()  
	{  
	ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();  
	messageSource.setBasename("src/main/resources/messages");  
	return messageSource;  
	}  
	 
	 
}
