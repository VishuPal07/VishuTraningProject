package com.example.mypkg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mypkg.ExceptionHandler.ResponseHandler;
import com.example.mypkg.models.User;
import com.example.mypkg.services.UserServices;

@RestController 
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserServices userServices;
	
	@PostMapping("/save/user")
	public ResponseEntity<?> saveUser(@RequestBody User user)
	{
		User users = userServices.saveUser(user);
		return ResponseHandler.response(HttpStatus.ACCEPTED, true, "User Save Successfully",users);
	}
	
	@GetMapping("/getAll/user")
	public ResponseEntity<?> getAllUser()
	{
		List<User> user= userServices.getAllUser();
		return ResponseHandler.response(HttpStatus.OK,true,"Users",user);
	}
	
	@GetMapping("/get/user/{id}")
	public ResponseEntity<?> getUser(@PathVariable int id)
	{
		User user= userServices.getUser(id);
		return ResponseHandler.response(HttpStatus.OK, true, "User by id", user);
	}
	
	@PutMapping("/update/user")
	public ResponseEntity<?> updateUser(@RequestBody User user)
	{
		User users= userServices.updateUser(user);
		return ResponseHandler.response(HttpStatus.OK, true, "User Updated !!", users);
	}
	
	@DeleteMapping("/delete/user/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable int id)
	{
		userServices.deleteUser(id);
		return ResponseHandler.response(HttpStatus.OK, true, "User Deleted !!");
		
	}
	
}
