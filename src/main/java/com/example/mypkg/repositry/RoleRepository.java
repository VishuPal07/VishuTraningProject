package com.example.mypkg.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mypkg.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer>{
	Role findById(int id);
}
