package com.endless.mercury.controller;

import java.util.List;
import java.util.Optional;

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

import com.endless.mercury.model.User;
import com.endless.mercury.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController 
{

	@Autowired
    UserRepository userRepository;

 // Get All Users
    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

 // Create a new User
    @PostMapping("/user")
    public User createUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }

 // Get a Single User
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(value = "id") String userId) {
        return ( userRepository.findByUserId(userId));
    }
    
 // Delete a User
    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") String userId) {
        User user = userRepository.findByUserId(userId);

        userRepository.delete(user);

        return ResponseEntity.ok().build();

    }
    
    //Update User
    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") String userId,
         @Valid @RequestBody User userDetails)  {
        User user = userRepository.findByUserId(userId);

        user.setcreatedClient(userDetails.getcreatedClient());
		user.setUpdatedUserId(userDetails.getUpdatedUserId());
		user.setPassword(userDetails.getPassword());
		user.setIsActive(userDetails.getIsActive());
		
        final User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }
}
