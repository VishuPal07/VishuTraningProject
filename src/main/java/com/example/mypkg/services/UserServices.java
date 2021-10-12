package com.example.mypkg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mypkg.models.User;
import com.example.mypkg.repositry.UserRepositry;

@Service
public class UserServices {

	@Autowired
	UserRepositry userRepositry;
	
	public User saveUser(User user) {
		
		return userRepositry.save(user);
	}

	public List<User> getAllUser() {
		return (List<User>)userRepositry.findAll();
	}

	public User getUser(int id) {
		
		return userRepositry.findById(id);
	}

	public User updateUser(User user) {
		
		return userRepositry.save(user); 
	}

	public void deleteUser(int id) {
		userRepositry.deleteById(id);
	}

}
