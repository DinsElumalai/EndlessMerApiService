package com.endless.mercury.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.endless.mercury.model.UserGroup;
import com.endless.mercury.model.UserRole;
import com.endless.mercury.repository.UserRoleRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserRoleController 
{

	@Autowired
    UserRoleRepository userRoleRepository;

 // Get All Users
    @GetMapping("/role")
    public List<UserRole> getAllGroupRoles() {
        return userRoleRepository.findAll();
    }
    
 
    //Get RoleNames
    @GetMapping("/role-names")
    public List<String> getRoleNames()
    {
    	return userRoleRepository.findAllRoleName();
    }
    
 // Create a new UserGroup
    @PostMapping("/role")
    public UserRole createRole(@Valid @RequestBody UserRole userRole) {
        return userRoleRepository.save(userRole);
    }
}
