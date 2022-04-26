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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.endless.mercury.exceptions.ResourceNotFoundException;
import com.endless.mercury.model.UserAccessedPage;
import com.endless.mercury.repository.UserAccessedPageRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserAccessedPageController 
{

	@Autowired
    UserAccessedPageRepository userAccessedPageRepository;

 // Get All UserAccessedPages
    @GetMapping("/usrap")
    public List<UserAccessedPage> getAllUserAccessedPages() {
        return userAccessedPageRepository.findAll();
    }

 // Create a new UserAccessedPage
    @PostMapping("/usrap")
    public UserAccessedPage createUserAccessedPage(@Valid @RequestBody UserAccessedPage userAccessedPage) {
        return userAccessedPageRepository.save(userAccessedPage);
    }

 // Get a Single UserAccessedPage
    @GetMapping("/usrap/{id}")
    public UserAccessedPage getUserAccessedPageById(@PathVariable(value = "id") Long userAccessedPageId) {
        return userAccessedPageRepository.findById(userAccessedPageId)
                .orElseThrow(() -> new ResourceNotFoundException("UserAccessedPage", "id", userAccessedPageId));
    }
    
 // Delete a UserAccessedPage
    @DeleteMapping("/usrap/{id}")
    public ResponseEntity<?> deleteUserAccessedPage(@PathVariable(value = "id") Long userAccessedPageId) {
        UserAccessedPage userAccessedPage = userAccessedPageRepository.findById(userAccessedPageId)
                .orElseThrow(() -> new ResourceNotFoundException("UserAccessedPage", "id", userAccessedPageId));

        userAccessedPageRepository.delete(userAccessedPage);

        return ResponseEntity.ok().build();

    }
}
