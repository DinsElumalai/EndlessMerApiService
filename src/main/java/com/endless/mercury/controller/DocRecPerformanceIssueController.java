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
import com.endless.mercury.model.DocRecPerformanceIssue;
import com.endless.mercury.repository.DocRecPerformanceIssueRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DocRecPerformanceIssueController 
{

	@Autowired
	DocRecPerformanceIssueRepository docRecPerformanceIssueRepo;
	
	// Get All 
    @GetMapping("/docrecperf/issue")
    public List<DocRecPerformanceIssue> getAllDocRecPerformanceIssues() {
        return docRecPerformanceIssueRepo.findAll();
    }
    
    // Create a new Record
    @PostMapping("/docrecperf/issue")
    public DocRecPerformanceIssue createDocRecPerformanceIssue(@Valid @RequestBody DocRecPerformanceIssue newRecord) {
        return docRecPerformanceIssueRepo.save(newRecord);
    }
    
    // Get a Single Record
    @GetMapping("/docrecperf/issue/{id}")
    public DocRecPerformanceIssue getDocRecPerformanceIssueById(@PathVariable(value = "id") Long id) {
        return docRecPerformanceIssueRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceIssue", "id", id));
    }
    
        
    //Get last record
    @GetMapping("/docrecperf/issue/last")
    public DocRecPerformanceIssue getLastDocRecPerformanceIssue()
    {
    	return docRecPerformanceIssueRepo.findTopByOrderByIssueIdDesc();
    }
    
    //Get last record
    @GetMapping("/docrecperf/issue/docrec/{id}")
    public DocRecPerformanceIssue getDocRecPerformanceIssueByDocRecPerId(@PathVariable(value = "id") String id)
    {
    	return docRecPerformanceIssueRepo.findByDocRecPerId(id);
    }
    
    
    // Delete a Record
    @DeleteMapping("/docrecperf/issue/{id}")
    public ResponseEntity<?> deleteDocRecPerformanceIssue(@PathVariable(value = "id") Long id) {
    	DocRecPerformanceIssue record = docRecPerformanceIssueRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceIssue", "id", id));

        docRecPerformanceIssueRepo.delete(record);

        return ResponseEntity.ok().build();

    }
    
    // Update a Record
    @PutMapping("/docrecperf/issue/{id}")
    public DocRecPerformanceIssue updateDocRecPerformanceIssue(@PathVariable(value = "id") Long id,
                                            @Valid @RequestBody DocRecPerformanceIssue newDetails) {

    	DocRecPerformanceIssue updatedRecord = docRecPerformanceIssueRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceIssue", "id", id));
 
    	
    	updatedRecord.setActive(newDetails.isActive());
    	updatedRecord.setCreatedClient(newDetails.getCreatedClient());
    	updatedRecord.setDocRecPerId(newDetails.getDocRecPerId());
    	updatedRecord.setInActivatedComments(newDetails.getInActivatedComments());
    	updatedRecord.setInActivedDate(newDetails.getInActivedDate());
    	updatedRecord.setIssueDate(newDetails.getIssueDate());
    	updatedRecord.setIssueNo(newDetails.getIssueNo());
    	updatedRecord.setIssueReason(newDetails.getIssueReason());
    	updatedRecord.setUpdatedBy(newDetails.getUpdatedBy());
    	updatedRecord.setUpdatedDate(newDetails.getUpdatedDate());   	
    	                     

    	DocRecPerformanceIssue updatedDocRecPerformanceIssue = docRecPerformanceIssueRepo.save(updatedRecord);
        return updatedDocRecPerformanceIssue;
    }
}
