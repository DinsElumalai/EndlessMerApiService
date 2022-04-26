package com.endless.mercury.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.endless.mercury.exceptions.ResourceNotFoundException;
import com.endless.mercury.model.ItemType;
import com.endless.mercury.model.SoftwareSetup;
import com.endless.mercury.repository.SoftwareSetupRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SoftwareSetupController 
{
	@Autowired
    SoftwareSetupRepository softwareSetupRepository;

 // Get All SoftwareSetups
    @GetMapping("/ss")
    public List<SoftwareSetup> getAllSoftwareSetups() {
        return softwareSetupRepository.findAll();
    }

 // Create a new SoftwareSetup
    @PostMapping("/ss")
    public SoftwareSetup createSoftwareSetup(@Valid @RequestBody SoftwareSetup softwareSetup) {
        return softwareSetupRepository.save(softwareSetup);
    }

 // Get a Single SoftwareSetup
    @GetMapping("/ss/{id}")
    public SoftwareSetup getSoftwareSetupById(@PathVariable(value = "id") Long softwareSetupId) {
        return softwareSetupRepository.findById(softwareSetupId)
                .orElseThrow(() -> new ResourceNotFoundException("SoftwareSetup", "id", softwareSetupId));
    }
    
 // Get a Single SoftwareSetup by constant name
    @GetMapping("/ss/con/{id}")
    public SoftwareSetup getSoftwareSetupByConstantName(@PathVariable(value = "id") String softwareSetupId) {
        return  softwareSetupRepository.findByConstantName(softwareSetupId);
    }

 // Update a SoftwareSetup
    @PutMapping("/ss/{id}")
    public SoftwareSetup updateSoftwareSetup(@PathVariable(value = "id") Long softwareSetupId,
                                            @Valid @RequestBody SoftwareSetup softwareSetupDetails) {

        SoftwareSetup softwareSetup = softwareSetupRepository.findById(softwareSetupId)
                .orElseThrow(() -> new ResourceNotFoundException("SoftwareSetup", "id", softwareSetupId));

        softwareSetup.setConstantName(softwareSetupDetails.getConstantName());
        softwareSetup.setConstantValue(softwareSetupDetails.getConstantValue());
        softwareSetup.setUpdatedUserId(softwareSetupDetails.getUpdatedUserId());

        SoftwareSetup updatedSoftwareSetup = softwareSetupRepository.save(softwareSetup);
        return updatedSoftwareSetup;
    }

 // Delete a SoftwareSetup
    @DeleteMapping("/ss/{id}")
    public ResponseEntity<?> deleteSoftwareSetup(@PathVariable(value = "id") Long softwareSetupId) {
        SoftwareSetup softwareSetup = softwareSetupRepository.findById(softwareSetupId)
                .orElseThrow(() -> new ResourceNotFoundException("SoftwareSetup", "id", softwareSetupId));

        softwareSetupRepository.delete(softwareSetup);

        return ResponseEntity.ok().build();
    }
    
 
}
