package com.example.mypkg.services;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.mypkg.ExceptionHandler.BusinessException;
import com.example.mypkg.models.Role;
import com.example.mypkg.repositry.RoleRepository;

@Service
public class RoleService {

	@Autowired
	RoleRepository roleRepository;
	private MessageSource messageSource;
	public Role saveRole(Role role) {
		
		return roleRepository.save(role);
	}

	public List<Role> getAllRole() {
		return (List<Role>)roleRepository.findAll();
	}

	
	public Role getRole(int id){
		if(id==4) {
			 throw new BusinessException("601","This is an invalid id !!");
		}
		return roleRepository.findById(id);
	}

//	public Role getRole(int id) {
//		return roleRepository.getById(id);
//	}
	
	public Role updateRole(Role role) {
		return roleRepository.save(role);
	}

	public void deleteRole(int id) {
		roleRepository.deleteById(id);
	}

}
