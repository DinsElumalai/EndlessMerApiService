package com.endless.mercury.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.endless.mercury.exceptions.ResourceNotFoundException;
import com.endless.mercury.model.UserLog;
import com.endless.mercury.repository.UserLogRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserLogController 
{


	@Autowired
    UserLogRepository userLogRepository;

 // Get All Users
    @GetMapping("/usrlog")
    public List<UserLog> getAllUsers() {
        return userLogRepository.findAll();
    }

 // Create a new User
    @PostMapping("/usrlog")
    public UserLog createUserLog(@Valid @RequestBody UserLog userLog) {
        return userLogRepository.save(userLog);
    }

     
    // Get a Single userID
    @GetMapping("/usrlog/{usrId}")
	public ResponseEntity<List<UserLog>> getUserLogByUserId(@PathVariable(value = "usrId") String userId) {
		return new ResponseEntity<List<UserLog>>(userLogRepository.findByUserId(userId), HttpStatus.OK);
	}
    
 // Delete a User
    @DeleteMapping("/usrlog/{id}")
    public ResponseEntity<?> deleteUserLog(@PathVariable(value = "id") Long userLogId) {
        UserLog userLog = userLogRepository.findById(userLogId)
                .orElseThrow(() -> new ResourceNotFoundException("UserLog", "id", userLogId));

        userLogRepository.delete(userLog);

        return ResponseEntity.ok().build();

    }
}
