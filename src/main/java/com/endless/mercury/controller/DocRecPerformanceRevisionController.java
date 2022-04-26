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
import com.endless.mercury.model.DocRecPerformanceRevision;
import com.endless.mercury.repository.DocRecPerformanceRevisionRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DocRecPerformanceRevisionController 
{

	@Autowired
	DocRecPerformanceRevisionRepository docRecPerformanceRevisionRepo;
	
	// Get All 
    @GetMapping("/docrecperf/revision")
    public List<DocRecPerformanceRevision> getAllDocRecPerformanceRevisions() {
        return docRecPerformanceRevisionRepo.findAll();
    }
    
    // Create a new Record
    @PostMapping("/docrecperf/revision")
    public DocRecPerformanceRevision createDocRecPerformanceRevision(@Valid @RequestBody DocRecPerformanceRevision newRecord) {
        return docRecPerformanceRevisionRepo.save(newRecord);
    }
    
    // Get a Single Record
    @GetMapping("/docrecperf/revision/{id}")
    public DocRecPerformanceRevision getDocRecPerformanceRevisionById(@PathVariable(value = "id") Long id) {
        return docRecPerformanceRevisionRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceRevision", "id", id));
    }
    
        
    //Get last record
    @GetMapping("/docrecperf/revision/last")
    public DocRecPerformanceRevision getLastDocRecPerformanceRevision()
    {
    	return docRecPerformanceRevisionRepo.findTopByOrderByRevisionIdDesc();
    }
    
    //Get record by doc rec per id
    @GetMapping("/docrecperf/revision/docrec/{id}")
    public DocRecPerformanceRevision getDocRecPerformanceRevisionByDocRecPerId(@PathVariable(value = "id") String id)
    {
    	return docRecPerformanceRevisionRepo.findByDocRecPerId(id);
    }
    
    
    // Delete a Record
    @DeleteMapping("/docrecperf/revision/{id}")
    public ResponseEntity<?> deleteDocRecPerformanceRevision(@PathVariable(value = "id") Long id) {
    	DocRecPerformanceRevision record = docRecPerformanceRevisionRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceRevision", "id", id));

        docRecPerformanceRevisionRepo.delete(record);

        return ResponseEntity.ok().build();

    }
    
    // Update a Record
    @PutMapping("/docrecperf/revision/{id}")
    public DocRecPerformanceRevision updateDocRecPerformanceRevision(@PathVariable(value = "id") Long id,
                                            @Valid @RequestBody DocRecPerformanceRevision newDetails) {

    	DocRecPerformanceRevision updatedRecord = docRecPerformanceRevisionRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceRevision", "id", id));
 
    	
    	updatedRecord.setCreatedClient(newDetails.getCreatedClient());
    	updatedRecord.setDocRecPerId(newDetails.getDocRecPerId());
    	updatedRecord.setUpdatedBy(newDetails.getUpdatedBy());
    	updatedRecord.setUpdatedDate(newDetails.getUpdatedDate()); 
    	updatedRecord.setRevisionDate(newDetails.getRevisionDate());
    	updatedRecord.setRevisionNo(newDetails.getRevisionNo());
    	updatedRecord.setRevisionReason(newDetails.getRevisionReason());

    	DocRecPerformanceRevision updatedDocRecPerformanceRevision = docRecPerformanceRevisionRepo.save(updatedRecord);
        return updatedDocRecPerformanceRevision;
    }
}
