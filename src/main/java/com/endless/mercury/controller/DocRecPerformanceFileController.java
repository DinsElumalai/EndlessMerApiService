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
import com.endless.mercury.model.DocRecPerformanceFile;
import com.endless.mercury.repository.DocRecPerformanceFileRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DocRecPerformanceFileController
{

	@Autowired
	DocRecPerformanceFileRepository docRecPerformanceFileRepo;
	
	// Get All 
    @GetMapping("/docrecperf/file")
    public List<DocRecPerformanceFile> getAllDocRecPerformanceFiles() {
        return docRecPerformanceFileRepo.findAll();
    }
    
    // Create a new Record
    @PostMapping("/docrecperf/file")
    public DocRecPerformanceFile createDocRecPerformanceFile(@Valid @RequestBody DocRecPerformanceFile newRecord) {
        return docRecPerformanceFileRepo.save(newRecord);
    }
    
    // Get a Single Record
    @GetMapping("/docrecperf/file/{id}")
    public DocRecPerformanceFile getDocRecPerformanceFileById(@PathVariable(value = "id") Long id) {
        return docRecPerformanceFileRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceFile", "id", id));
    }
    
        
    //Get last record
    @GetMapping("/docrecperf/file/last")
    public DocRecPerformanceFile getLastDocRecPerformanceFile()
    {
    	return docRecPerformanceFileRepo.findTopByOrderByFileIdDesc();
    }
    
    //Get last record
    @GetMapping("/docrecperf/file/docrec/{id}")
    public DocRecPerformanceFile getDocRecPerformanceFileByDocRecPerId(@PathVariable(value = "id") String id)
    {
    	return docRecPerformanceFileRepo.findByDocRecPerId(id);
    }
    
    
    // Delete a Record
    @DeleteMapping("/docrecperf/file/{id}")
    public ResponseEntity<?> deleteDocRecPerformanceFile(@PathVariable(value = "id") Long id) {
    	DocRecPerformanceFile record = docRecPerformanceFileRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceFile", "id", id));

        docRecPerformanceFileRepo.delete(record);

        return ResponseEntity.ok().build();

    }
    
    // Update a Record
    @PutMapping("/docrecperf/file/{id}")
    public DocRecPerformanceFile updateDocRecPerformanceFile(@PathVariable(value = "id") Long id,
                                            @Valid @RequestBody DocRecPerformanceFile newDetails) {

    	DocRecPerformanceFile updatedRecord = docRecPerformanceFileRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceFile", "id", id));
 
    	
    	updatedRecord.setComments(newDetails.getComments()); 	
    	updatedRecord.setCreatedClient(newDetails.getCreatedClient());
    	updatedRecord.setDocRecPerId(newDetails.getDocRecPerId());
    	updatedRecord.setFilePath(newDetails.getFilePath());
    	updatedRecord.setFileType(newDetails.getFileType());
    	updatedRecord.setUpdatedBy(newDetails.getUpdatedBy());
    	updatedRecord.setUpdatedDate(newDetails.getUpdatedDate());
    	                     

    	DocRecPerformanceFile updatedDocRecPerformanceFile = docRecPerformanceFileRepo.save(updatedRecord);
        return updatedDocRecPerformanceFile;
    }
}

