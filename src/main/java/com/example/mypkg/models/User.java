package com.example.mypkg.models;



import java.util.ArrayList;

import javax.persistence.*;

import java.util.List;
import com.example.mypkg.annotation.*;
import com.example.mypkg.annotation.Number;


@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue
	private int id;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "role_id")
//	private Role role;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "user_id")
//	private List<Role> role = new ArrayList<>();
//	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Users_Roles", joinColumns = @JoinColumn(name = "user_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> role = new ArrayList<>();
	
	private String name;
	
	@Email()
	private String email;
	
	private String add;
	
	@Password
	private String pwd;
	
	@Number
	private String num;
	
	public User() {
		super();
	}


	public String getPwd() {
		return pwd;
	}





	public User(int id, List<Role> role, String name, String email, String add, String pwd, String num) {
		super();
		this.id = id;
		this.role = role;
		this.name = name;
		this.email = email;
		this.add = add;
		this.pwd = pwd;
		this.num = num;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public List<Role> getRole() {
		return role;
	}


	public void setRole(List<Role> role) {
		this.role = role;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	
}
