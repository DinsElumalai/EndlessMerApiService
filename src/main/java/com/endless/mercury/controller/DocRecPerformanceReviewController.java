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
import com.endless.mercury.model.DocRecPerformanceReview;
import com.endless.mercury.repository.DocRecPerformanceReviewRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DocRecPerformanceReviewController 
{
	@Autowired
	DocRecPerformanceReviewRepository docRecPerformanceReviewRepo;
	
	// Get All 
    @GetMapping("/docrecperf/review")
    public List<DocRecPerformanceReview> getAllDocRecPerformanceReviews() {
        return docRecPerformanceReviewRepo.findAll();
    }
    
    // Create a new Record
    @PostMapping("/docrecperf/review")
    public DocRecPerformanceReview createDocRecPerformanceReview(@Valid @RequestBody DocRecPerformanceReview newRecord) {
        return docRecPerformanceReviewRepo.save(newRecord);
    }
    
    // Get a Single Record
    @GetMapping("/docrecperf/review/{id}")
    public DocRecPerformanceReview getDocRecPerformanceReviewById(@PathVariable(value = "id") Long id) {
        return docRecPerformanceReviewRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceReview", "id", id));
    }
    
        
    //Get last record
    @GetMapping("/docrecperf/review/last")
    public DocRecPerformanceReview getLastDocRecPerformanceReview()
    {
    	return docRecPerformanceReviewRepo.findTopByOrderByReviewIdDesc();
    }
    
    //Get record by doc rec per id
    @GetMapping("/docrecperf/review/docrec/{id}")
    public DocRecPerformanceReview getDocRecPerformanceReviewByDocRecPerId(@PathVariable(value = "id") String id)
    {
    	return docRecPerformanceReviewRepo.findByDocRecPerId(id);
    }
    
    
    // Delete a Record
    @DeleteMapping("/docrecperf/review/{id}")
    public ResponseEntity<?> deleteDocRecPerformanceReview(@PathVariable(value = "id") Long id) {
    	DocRecPerformanceReview record = docRecPerformanceReviewRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceReview", "id", id));

        docRecPerformanceReviewRepo.delete(record);

        return ResponseEntity.ok().build();

    }
    
    // Update a Record
    @PutMapping("/docrecperf/review/{id}")
    public DocRecPerformanceReview updateDocRecPerformanceReview(@PathVariable(value = "id") Long id,
                                            @Valid @RequestBody DocRecPerformanceReview newDetails) {

    	DocRecPerformanceReview updatedRecord = docRecPerformanceReviewRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceReview", "id", id));
 
    	
    	updatedRecord.setCreatedClient(newDetails.getCreatedClient());
    	updatedRecord.setDocRecPerId(newDetails.getDocRecPerId());
    	updatedRecord.setUpdatedBy(newDetails.getUpdatedBy());
    	updatedRecord.setUpdatedDate(newDetails.getUpdatedDate()); 
    	updatedRecord.setEmployeeId(newDetails.getEmployeeId());
    	updatedRecord.setReviewComments(newDetails.getReviewComments());
    	updatedRecord.setReviewDate(newDetails.getReviewDate());

    	DocRecPerformanceReview updatedDocRecPerformanceReview = docRecPerformanceReviewRepo.save(updatedRecord);
        return updatedDocRecPerformanceReview;
    }
}
