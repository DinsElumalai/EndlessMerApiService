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
import com.endless.mercury.model.DocRecPerformance;
import com.endless.mercury.repository.DocRecPerformanceRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DocRecPerformanceController
{

	@Autowired
	DocRecPerformanceRepository docRecPerformanceRepo;
	
	// Get All entranceRegister
    @GetMapping("/docrecperf")
    public List<DocRecPerformance> getAllDocRecPerformances() {
        return docRecPerformanceRepo.findAll();
    }
    
    // Create a new Record
    @PostMapping("/docrecperf")
    public DocRecPerformance createDocRecPerformance(@Valid @RequestBody DocRecPerformance newRecord) {
        return docRecPerformanceRepo.save(newRecord);
    }
    
    // Get a Single Record
    @GetMapping("/docrecperf/{id}")
    public DocRecPerformance getDocRecPerformanceById(@PathVariable(value = "id") Long id) {
        return docRecPerformanceRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformance", "id", id));
    }
    
        
    //Get last record
    @GetMapping("/docrecperf/last")
    public DocRecPerformance getLastDocRecPerformance()
    {
    	return docRecPerformanceRepo.findTopByOrderByDocRecPerformanceIdDesc();
    }
    
    
    // Delete a Record
    @DeleteMapping("/docrecperf/{id}")
    public ResponseEntity<?> deleteDocRecPerformance(@PathVariable(value = "id") Long id) {
    	DocRecPerformance record = docRecPerformanceRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformance", "id", id));

        docRecPerformanceRepo.delete(record);

        return ResponseEntity.ok().build();

    }
    
    // Update a Record
    @PutMapping("/docrecperf/{id}")
    public DocRecPerformance updateDocRecPerformance(@PathVariable(value = "id") Long id,
                                            @Valid @RequestBody DocRecPerformance newDetails) {

    	DocRecPerformance updatedRecord = docRecPerformanceRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformance", "id", id));
 
    	
    	updatedRecord.setActive(newDetails.isActive());
    	updatedRecord.setCreatedBy(newDetails.getCreatedBy());
    	updatedRecord.setCreatedClient(newDetails.getCreatedClient());
    	updatedRecord.setCreatedDate(newDetails.getCreatedDate());
    	updatedRecord.setFileLocation(newDetails.getFileLocation());;
    	updatedRecord.setImplementedBy(newDetails.getImplementedBy());
    	updatedRecord.setImplementedOn(newDetails.getImplementedOn());
    	updatedRecord.setInActivatedComments(newDetails.getInActivatedComments());
    	updatedRecord.setInActivatedDate(newDetails.getInActivatedDate());
    	updatedRecord.setKpiRequired(newDetails.isKpiRequired());
    	updatedRecord.setKpiValueMustBe(newDetails.getKpiValueMustBe());
    	updatedRecord.setRetainedLocation(newDetails.getRetainedLocation());
    	updatedRecord.setRetensionMonth(newDetails.getRetensionMonth());
    	updatedRecord.setType(newDetails.getType());
    	updatedRecord.setTypeDepartmentName(newDetails.getTypeDepartmentName());
    	updatedRecord.setTypeNo(newDetails.getTypeNo());
    	updatedRecord.setTypePurpose(newDetails.getTypePurpose());
    	updatedRecord.setUpdatedBy(newDetails.getUpdatedBy());
    	updatedRecord.setUpdatedDate(newDetails.getUpdatedDate());    	
    	                     

    	DocRecPerformance updatedDocRecPerformance = docRecPerformanceRepo.save(updatedRecord);
        return updatedDocRecPerformance;
    }
}
