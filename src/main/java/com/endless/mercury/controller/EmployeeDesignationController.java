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
import com.endless.mercury.model.EmployeeDesignation;
import com.endless.mercury.model.PrefixSetup;
import com.endless.mercury.repository.EmployeeDesignationRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmployeeDesignationController 
{
	@Autowired
    EmployeeDesignationRepository employeeDesignationRepository;

 // Get All EmployeeDesignations
    @GetMapping("/empdg")
    public List<EmployeeDesignation> getAllEmployeeDesignations() {
        return employeeDesignationRepository.findAll();
    }

 // Create a new EmployeeDesignation
    @PostMapping("/empdg")
    public EmployeeDesignation createEmployeeDesignation(@Valid @RequestBody EmployeeDesignation employeeDesignation) {
        return employeeDesignationRepository.save(employeeDesignation);
    }

 // Get a Single EmployeeDesignation
    @GetMapping("/empdg/{id}")
    public EmployeeDesignation getEmployeeDesignationById(@PathVariable(value = "id") Long employeeDesignationId) {
        return employeeDesignationRepository.findById(employeeDesignationId)
                .orElseThrow(() -> new ResourceNotFoundException("EmployeeDesignation", "id", employeeDesignationId));
    }
    
 // Delete a EmployeeDesignation
    @DeleteMapping("/empdg/{id}")
    public ResponseEntity<?> deleteEmployeeDesignation(@PathVariable(value = "id") Long employeeDesignationId) {
        EmployeeDesignation employeeDesignation = employeeDesignationRepository.findById(employeeDesignationId)
                .orElseThrow(() -> new ResourceNotFoundException("EmployeeDesignation", "id", employeeDesignationId));

        employeeDesignationRepository.delete(employeeDesignation);

        return ResponseEntity.ok().build();

    }
    
    // Update a Designation
    @PutMapping("/empdg/{id}")
    public EmployeeDesignation updateDesignation(@PathVariable(value = "id") Long employeeDesignationId,
                                            @Valid @RequestBody EmployeeDesignation dd) {

        EmployeeDesignation ds = employeeDesignationRepository.findById(employeeDesignationId)
                .orElseThrow(() -> new ResourceNotFoundException("PrefixSetup", "id", employeeDesignationId));

        ds.setDesignationName(dd.getDesignationName());
        ds.setCreatedClient(dd.getCreatedClient());
        ds.setUpdatedUserId(dd.getUpdatedUserId());
                     

        EmployeeDesignation updatedDesignation = employeeDesignationRepository.save(ds);
        return updatedDesignation;
    }
}
