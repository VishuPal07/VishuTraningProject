package com.example.mypkg.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Role {

	@Id
	@GeneratedValue
	private int id;
	
	private String title;
	
	private String desc;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "role")
	private List<User> user = new ArrayList<>();
	
	public Role() {
		super();
	}

	

	public Role(int id, String title, String desc, List<User> user) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.user = user;
	}



	public List<User> getUser() {
		return user;
	}



	public void setUser(List<User> user) {
		this.user = user;
	}



	public int getId() {
		return id;
	}

//	public Role(int id, String title, String desc) {
//	super();
//	this.id = id;
//	this.title = title;
//	this.desc = desc;
//}



	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
