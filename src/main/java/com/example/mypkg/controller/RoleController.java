package com.example.mypkg.controller;

import java.util.List;
import java.util.Locale;

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

import com.example.mypkg.ExceptionHandler.BusinessException;
import com.example.mypkg.ExceptionHandler.ControllerException;
import com.example.mypkg.ExceptionHandler.ResponseHandler;
import com.example.mypkg.models.Role;
import com.example.mypkg.services.RoleService;

@RestController
@RequestMapping("/api")
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@PostMapping("/save/role")
	public ResponseEntity<?> saveRole(@RequestBody Role role)
	{
		Role roles = roleService.saveRole(role);
		return ResponseHandler.response(HttpStatus.OK,true,"This is role", roles);
	}
	
	@GetMapping("/getAll/role")
	public ResponseEntity<?> getAllRole()
	{
		List<Role> roles = roleService.getAllRole();
		return ResponseHandler.response(HttpStatus.OK,true,"Get Success",roles);
	}
	
	@GetMapping("/get/role/{id}")
	public ResponseEntity<?> getRole(@PathVariable int id)
	{
		try {
		Role roles = roleService.getRole(id);
		return ResponseHandler.response(HttpStatus.OK,true,"Get Success",roles);
		}catch(BusinessException e)
		{
//			ControllerException ce=new ControllerException(e.getMessage(),e.getDesc());
			return ResponseHandler.response(HttpStatus.NOT_FOUND,false,"this is error");
		}
	}
	
	@PutMapping("/update/role")
	public ResponseEntity<?> updateRole(@RequestBody Role role)
	{
		Role roles = roleService.updateRole(role);
		return ResponseHandler.response(HttpStatus.OK,true,"Role Save Successful",roles);
	}
	
	@DeleteMapping("delete/role/{id}")
	public ResponseEntity<?> deleteRole(@PathVariable int id)
	{
		roleService.deleteRole(id);
		return ResponseHandler.response(HttpStatus.OK, true, "Role deleted Successfully");
	}
}
