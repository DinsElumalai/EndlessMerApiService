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
import com.endless.mercury.model.Process;
import com.endless.mercury.repository.ProcessRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ProcessController
{
	@Autowired
    ProcessRepository processRepository;

 // Get All Process
    @GetMapping("/process")
    public List<Process> getAllProcesss() {
        return processRepository.findAll();
    }

 // Create a new Process
    @PostMapping("/process")
    public Process createProcess(@Valid @RequestBody Process process) {
        return processRepository.save(process);
    }

 // Get a Single Process
    @GetMapping("/process/{id}")
    public Process getProcessById(@PathVariable(value = "id") Long processId) {
        return processRepository.findById(processId)
                .orElseThrow(() -> new ResourceNotFoundException("Process", "id", processId));
    }
    
 // Get a Single Process code
    @GetMapping("/processcode/{id}")
    public Process getProcessByProcessCode(@PathVariable(value = "id") String processId) {
        return processRepository.findByProcessNameId(processId);
    }
      
  
 // Delete a Process
    @DeleteMapping("/process/{id}")
    public ResponseEntity<?> deleteProcess(@PathVariable(value = "id") Long processId) {
        Process process = processRepository.findById(processId)
                .orElseThrow(() -> new ResourceNotFoundException("Process", "id", processId));

        processRepository.delete(process);

        return ResponseEntity.ok().build();

    }
    
    // Update a Process
    @PutMapping("/process/{id}")
    public Process updateProcess(@PathVariable(value = "id") Long processId,
                                            @Valid @RequestBody Process processDetails) {

        Process process = processRepository.findById(processId)
                .orElseThrow(() -> new ResourceNotFoundException("Process", "id", processId));

        process.setCreatedBy(processDetails.getCreatedBy());
        process.setCreatedClient(processDetails.getCreatedClient());
        process.setUpdatedBy(processDetails.getUpdatedBy()); 
        process.setActive(processDetails.isActive());
        process.setInactiveDate(processDetails.getInactiveDate());
        process.setInactiveComments(processDetails.getInactiveComments());
        process.setProcessDescription(processDetails.getProcessDescription());
        process.setProcessName(processDetails.getProcessName());
        process.setProcessNameId(processDetails.getProcessNameId());

        Process updatedProcess = processRepository.save(process);
        return updatedProcess;
    }
}
