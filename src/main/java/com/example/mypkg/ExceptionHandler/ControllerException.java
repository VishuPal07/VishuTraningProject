package com.example.mypkg.ExceptionHandler;

import org.springframework.stereotype.Component;

@Component
public class ControllerException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String message;
	private String desc;
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
	
	public ControllerException(String message, String desc) {
		super();
		this.message = message;
		this.desc = desc;
	}
	public ControllerException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
