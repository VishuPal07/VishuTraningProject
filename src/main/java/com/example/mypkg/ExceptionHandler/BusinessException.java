package com.example.mypkg.ExceptionHandler;

import org.springframework.stereotype.Component;

@Component
public class BusinessException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String message;
	private String desc;
	
	
	public BusinessException(String message, String desc) {
		super();
		this.message = message;
		this.desc = desc;
	}
	public BusinessException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
