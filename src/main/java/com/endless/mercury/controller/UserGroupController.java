package com.endless.mercury.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.endless.mercury.exceptions.ResourceNotFoundException;
import com.endless.mercury.model.UserGroup;
import com.endless.mercury.repository.UserGroupRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserGroupController 
{
	@Autowired
    UserGroupRepository userGroupRepository;

 // Get All Users
    @GetMapping("/userGroup")
    public List<UserGroup> getAllGroups() {
        return userGroupRepository.findAll();
    }
    
 // Get All Groupname
    @GetMapping("/userGroup/gpnames")
    public List<String> getAllRoleGroupNames() {
        return userGroupRepository.findDistinctRoleGroupName();
    }
    
 // Get All Groups by Groupname
    @GetMapping("/userGroup/gp/{gpname}")
    public List<UserGroup> getGroupsByRoleGroupName(@PathVariable(value = "gpname") String userGroupName) {
        return userGroupRepository.findByRoleGroupName(userGroupName);
    }

 // Create a new UserGroup
    @PostMapping("/userGroup")
    public UserGroup createGroup(@Valid @RequestBody UserGroup userGroup) {
        return userGroupRepository.save(userGroup);
    }

 // Get a Single UserGroup
    @GetMapping("/userGroup/{id}")
    public UserGroup getGroupById(@PathVariable(value = "id") Long userGroupId) {
        return userGroupRepository.findById(userGroupId)
                .orElseThrow(() -> new ResourceNotFoundException("UserGroup", "id", userGroupId));
    }
    
        
 // Delete a UserGroup
    @DeleteMapping("/userGroup/{id}")
    public ResponseEntity<?> deleteGroup(@PathVariable(value = "id") Long userGroupId) {
        UserGroup userGroup = userGroupRepository.findById(userGroupId)
                .orElseThrow(() -> new ResourceNotFoundException("UserGroup", "id", userGroupId));

        userGroupRepository.delete(userGroup);

        return ResponseEntity.ok().build();

    }
    
    

}
