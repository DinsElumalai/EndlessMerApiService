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
import com.endless.mercury.model.DocRecPerformanceResponsibility;
import com.endless.mercury.repository.DocRecPerformanceResponsibilityRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DocRecPerformanceResponsibilityController 
{

	@Autowired
	DocRecPerformanceResponsibilityRepository docRecPerformanceResponsibilityRepo;
	
	// Get All 
    @GetMapping("/docrecperf/responsibility")
    public List<DocRecPerformanceResponsibility> getAllDocRecPerformanceResponsibilitys() {
        return docRecPerformanceResponsibilityRepo.findAll();
    }
    
    // Create a new Record
    @PostMapping("/docrecperf/responsibility")
    public DocRecPerformanceResponsibility createDocRecPerformanceResponsibility(@Valid @RequestBody DocRecPerformanceResponsibility newRecord) {
        return docRecPerformanceResponsibilityRepo.save(newRecord);
    }
    
    // Get a Single Record
    @GetMapping("/docrecperf/responsibility/{id}")
    public DocRecPerformanceResponsibility getDocRecPerformanceResponsibilityById(@PathVariable(value = "id") Long id) {
        return docRecPerformanceResponsibilityRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceResponsibility", "id", id));
    }
    
        
    //Get last record
    @GetMapping("/docrecperf/responsibility/last")
    public DocRecPerformanceResponsibility getLastDocRecPerformanceResponsibility()
    {
    	return docRecPerformanceResponsibilityRepo.findTopByOrderByResponsibilityIdDesc();
    }
    
    //Get last record
    @GetMapping("/docrecperf/responsibility/docrec/{id}")
    public DocRecPerformanceResponsibility getDocRecPerformanceResponsibilityByDocRecPerId(@PathVariable(value = "id") String id)
    {
    	return docRecPerformanceResponsibilityRepo.findByDocRecPerId(id);
    }
    
    
    // Delete a Record
    @DeleteMapping("/docrecperf/responsibility/{id}")
    public ResponseEntity<?> deleteDocRecPerformanceResponsibility(@PathVariable(value = "id") Long id) {
    	DocRecPerformanceResponsibility record = docRecPerformanceResponsibilityRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceResponsibility", "id", id));

        docRecPerformanceResponsibilityRepo.delete(record);

        return ResponseEntity.ok().build();

    }
    
    // Update a Record
    @PutMapping("/docrecperf/responsibility/{id}")
    public DocRecPerformanceResponsibility updateDocRecPerformanceResponsibility(@PathVariable(value = "id") Long id,
                                            @Valid @RequestBody DocRecPerformanceResponsibility newDetails) {

    	DocRecPerformanceResponsibility updatedRecord = docRecPerformanceResponsibilityRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceResponsibility", "id", id));
 
    	
    	updatedRecord.setCreatedClient(newDetails.getCreatedClient());
    	updatedRecord.setDocRecPerId(newDetails.getDocRecPerId());
    	updatedRecord.setUpdatedBy(newDetails.getUpdatedBy());
    	updatedRecord.setUpdatedDate(newDetails.getUpdatedDate());  
    	updatedRecord.setResponsibilityApproverEmployeeId(newDetails.getResponsibilityApproverEmployeeId());
    	updatedRecord.setResponsibilityEmployeeId(newDetails.getResponsibilityEmployeeId());
    	updatedRecord.setResponsibilityFromDate(newDetails.getResponsibilityFromDate());
    	                     

    	DocRecPerformanceResponsibility updatedDocRecPerformanceResponsibility = docRecPerformanceResponsibilityRepo.save(updatedRecord);
        return updatedDocRecPerformanceResponsibility;
    }
}
