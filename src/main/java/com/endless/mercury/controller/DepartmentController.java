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
import com.endless.mercury.model.Department;
import com.endless.mercury.repository.DepartmentRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DepartmentController 
{

	@Autowired
	DepartmentRepository departmentRepo;
	
	// Get All 
    @GetMapping("/department")
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }
    
    // Create a new Record
    @PostMapping("/department")
    public Department createDepartment(@Valid @RequestBody Department newRecord) {
        return departmentRepo.save(newRecord);
    }
    
    // Get a Single Record
    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable(value = "id") Long id) {
        return departmentRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department", "id", id));
    }
    
        
    //Get last record
    @GetMapping("/department/last")
    public Department getLastDepartment()
    {
    	return departmentRepo.findTopByOrderByDepartmentIdDesc();
    }
    
       
    // Delete a Record
    @DeleteMapping("/department/{id}")
    public ResponseEntity<?> deleteDepartment(@PathVariable(value = "id") Long id) {
    	Department record = departmentRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department", "id", id));

        departmentRepo.delete(record);

        return ResponseEntity.ok().build();

    }
    
    // Update a Record
    @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable(value = "id") Long id,
                                            @Valid @RequestBody Department newDetails) {

    	Department updatedRecord = departmentRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department", "id", id));
 
    	
    	updatedRecord.setCreatedClient(newDetails.getCreatedClient());
    	updatedRecord.setUpdatedBy(newDetails.getUpdatedBy());
    	updatedRecord.setUpdatedDate(newDetails.getUpdatedDate()); 
    	updatedRecord.setDepartmentName(newDetails.getDepartmentName());
    	updatedRecord.setDepartmentNameId(newDetails.getDepartmentNameId());

    	Department updatedDepartment = departmentRepo.save(updatedRecord);
        return updatedDepartment;
    }
}
