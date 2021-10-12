package com.example.mypkg.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mypkg.models.User;

@Repository
public interface UserRepositry extends JpaRepository<User, Integer>{
	User findById(int id);
}
