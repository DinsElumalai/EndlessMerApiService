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
import com.endless.mercury.model.PrefixSetup;
import com.endless.mercury.repository.PrefixSetupRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PrefixSetupController 
{
	@Autowired
    PrefixSetupRepository prefixSetupRepository;

 // Get All PrefixSetups
    @GetMapping("/ps")
    public List<PrefixSetup> getAllPrefixSetups() {
        return prefixSetupRepository.findAll();
    }

 // Create a new PrefixSetup
    @PostMapping("/ps")
    public PrefixSetup createPrefixSetup(@Valid @RequestBody PrefixSetup prefixSetup) {
        return prefixSetupRepository.save(prefixSetup);
    }

 // Get a Single PrefixSetup
    @GetMapping("/ps/{id}")
    public PrefixSetup getPrefixSetupById(@PathVariable(value = "id") Long prefixSetupId) {
        return prefixSetupRepository.findById(prefixSetupId)
                .orElseThrow(() -> new ResourceNotFoundException("PrefixSetup", "id", prefixSetupId));
    }

  //Get last record
    @GetMapping("/pslast")
    public PrefixSetup getLastPrefixSetupById()
    {
    	return prefixSetupRepository.findTopByOrderByIdDesc();
    }
    
    
 // Update a PrefixSetup
    @PutMapping("/ps/{id}")
    public PrefixSetup updatePrefixSetup(@PathVariable(value = "id") Long prefixSetupId,
                                            @Valid @RequestBody PrefixSetup prefixSetupDetails) {

        PrefixSetup prefixSetup = prefixSetupRepository.findById(prefixSetupId)
                .orElseThrow(() -> new ResourceNotFoundException("PrefixSetup", "id", prefixSetupId));

        prefixSetup.setCreatedClient(prefixSetupDetails.getCreatedClient());
        prefixSetup.setCreatedUserId(prefixSetupDetails.getCreatedUserId());
        prefixSetup.setEmployeeOurCodePrefix(prefixSetupDetails.getEmployeeOurCodePrefix());
        prefixSetup.setItemOurCodePrefix(prefixSetupDetails.getItemOurCodePrefix());
        prefixSetup.setFinancialYear(prefixSetupDetails.getFinancialYear());
        prefixSetup.setPponOurCodePrefix(prefixSetupDetails.getPponOurCodePrefix());
        prefixSetup.setRcrnOurCodePrefix(prefixSetupDetails.getRcrnOurCodePrefix());
        prefixSetup.setRpanOurCodePrefix(prefixSetupDetails.getRpanOurCodePrefix());
        prefixSetup.setPdrnOurCodePrefix(prefixSetupDetails.getPdrnOurCodePrefix());
        prefixSetup.setUpdatedUserId(prefixSetupDetails.getUpdatedUserId());
        prefixSetup.setVendorOurCodePrefix(prefixSetupDetails.getVendorOurCodePrefix());
               

        PrefixSetup updatedPrefixSetup = prefixSetupRepository.save(prefixSetup);
        return updatedPrefixSetup;
    }

 // Delete a PrefixSetup
    @DeleteMapping("/ps/{id}")
    public ResponseEntity<?> deletePrefixSetup(@PathVariable(value = "id") Long prefixSetupId) {
        PrefixSetup prefixSetup = prefixSetupRepository.findById(prefixSetupId)
                .orElseThrow(() -> new ResourceNotFoundException("PrefixSetup", "id", prefixSetupId));

        prefixSetupRepository.delete(prefixSetup);

        return ResponseEntity.ok().build();
    }

    
}
