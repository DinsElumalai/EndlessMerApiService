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
import com.endless.mercury.model.PrefixSetupSpl;
import com.endless.mercury.repository.PrefixSetupSplRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PrefixSetupSplController 
{
	@Autowired
    PrefixSetupSplRepository prefixSetupSplRepository;

 // Get All PrefixSetupSpl
    @GetMapping("/prefixSetupSpl")
    public List<PrefixSetupSpl> getAllPrefixSetupSpls() {
        return prefixSetupSplRepository.findAll();
    }

 // Create a new PrefixSetupSpl
    @PostMapping("/prefixSetupSpl")
    public PrefixSetupSpl createPrefixSetupSpl(@Valid @RequestBody PrefixSetupSpl prefixSetupSpl) {
        return prefixSetupSplRepository.save(prefixSetupSpl);
    }

 // Get a Single PrefixSetupSpl
    @GetMapping("/prefixSetupSpl/{id}")
    public PrefixSetupSpl getPrefixSetupSplById(@PathVariable(value = "id") Long prefixSetupSplId) {
        return prefixSetupSplRepository.findById(prefixSetupSplId)
                .orElseThrow(() -> new ResourceNotFoundException("PrefixSetupSpl", "id", prefixSetupSplId));
    }
    
 // Get a Single PrefixSetupSpl code
    @GetMapping("/prefixSetupSplcode/{id}")
    public PrefixSetupSpl getPrefixSetupSplByPrefixSetupSplCode(@PathVariable(value = "id") String id) {
        return prefixSetupSplRepository.findByVendorId(id);
    }
      
  
 // Delete a PrefixSetupSpl
    @DeleteMapping("/prefixSetupSpl/{id}")
    public ResponseEntity<?> deletePrefixSetupSpl(@PathVariable(value = "id") Long prefixSetupSplId) {
        PrefixSetupSpl prefixSetupSpl = prefixSetupSplRepository.findById(prefixSetupSplId)
                .orElseThrow(() -> new ResourceNotFoundException("PrefixSetupSpl", "id", prefixSetupSplId));

        prefixSetupSplRepository.delete(prefixSetupSpl);

        return ResponseEntity.ok().build();

    }
    
    // Update a PrefixSetupSpl
    @PutMapping("/prefixSetupSpl/{id}")
    public PrefixSetupSpl updatePrefixSetupSpl(@PathVariable(value = "id") Long prefixSetupSplId,
                                            @Valid @RequestBody PrefixSetupSpl prefixSetupSplDetails) {

        PrefixSetupSpl prefixSetupSpl = prefixSetupSplRepository.findById(prefixSetupSplId)
                .orElseThrow(() -> new ResourceNotFoundException("PrefixSetupSpl", "id", prefixSetupSplId));

        prefixSetupSpl.setCreatedBy(prefixSetupSplDetails.getCreatedBy());
        prefixSetupSpl.setCreatedClient(prefixSetupSplDetails.getCreatedClient());
        prefixSetupSpl.setUpdatedBy(prefixSetupSplDetails.getUpdatedBy()); 
        prefixSetupSpl.setFinancialYear(prefixSetupSplDetails.getFinancialYear());
        prefixSetupSpl.setOsdcOurCodePrefix(prefixSetupSplDetails.getOsdcOurCodePrefix());
        prefixSetupSpl.setOsdiOurCodePrefix(prefixSetupSplDetails.getOsdiOurCodePrefix());
        prefixSetupSpl.setOspiOurCodePrefix(prefixSetupSplDetails.getOspiOurCodePrefix());
        prefixSetupSpl.setVendorId(prefixSetupSplDetails.getVendorId());

        PrefixSetupSpl updatedPrefixSetupSpl = prefixSetupSplRepository.save(prefixSetupSpl);
        return updatedPrefixSetupSpl;
    }

}
