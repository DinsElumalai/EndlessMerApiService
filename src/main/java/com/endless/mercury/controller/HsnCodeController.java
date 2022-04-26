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
import com.endless.mercury.model.HsnCode;
import com.endless.mercury.repository.HsnCodeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class HsnCodeController 
{

	@Autowired
    HsnCodeRepository hsnCodeRepository;

 // Get All HsnCodes
    @GetMapping("/hsnCode")
    public List<HsnCode> getAllHsnCodes() {
        return hsnCodeRepository.findAll();
    }

 // Create a new HsnCode
    @PostMapping("/hsnCode")
    public HsnCode createHsnCode(@Valid @RequestBody HsnCode hsnCode) {
        return hsnCodeRepository.save(hsnCode);
    }

 // Get a Single HsnCode
    @GetMapping("/hsnCode/{id}")
    public HsnCode getHsnCodeById(@PathVariable(value = "id") Long hsnCodeId) {
        return hsnCodeRepository.findById(hsnCodeId)
                .orElseThrow(() -> new ResourceNotFoundException("HsnCode", "id", hsnCodeId));
    }
    
 // Get a Single HsnCode code
    @GetMapping("/hsnCodecode/{id}")
    public HsnCode getHsnCodeByHsnCodeCode(@PathVariable(value = "id") String hsnCodeId) {
        return hsnCodeRepository.findByHsnCode(hsnCodeId);
    }
      
  
 // Delete a HsnCode
    @DeleteMapping("/hsnCode/{id}")
    public ResponseEntity<?> deleteHsnCode(@PathVariable(value = "id") Long hsnCodeId) {
        HsnCode hsnCode = hsnCodeRepository.findById(hsnCodeId)
                .orElseThrow(() -> new ResourceNotFoundException("HsnCode", "id", hsnCodeId));

        hsnCodeRepository.delete(hsnCode);

        return ResponseEntity.ok().build();

    }
    
    // Update a HsnCode
    @PutMapping("/hsnCode/{id}")
    public HsnCode updateHsnCode(@PathVariable(value = "id") Long hsnCodeId,
                                            @Valid @RequestBody HsnCode hsnCodeDetails) {

        HsnCode hsnCode = hsnCodeRepository.findById(hsnCodeId)
                .orElseThrow(() -> new ResourceNotFoundException("HsnCode", "id", hsnCodeId));

        hsnCode.setCreatedBy(hsnCodeDetails.getCreatedBy());
        hsnCode.setCreatedClient(hsnCodeDetails.getCreatedClient());
        hsnCode.setHsnDescription(hsnCodeDetails.getHsnDescription());
        hsnCode.setHsnCode(hsnCodeDetails.getHsnCode());
        hsnCode.setHsnRate(hsnCodeDetails.getHsnRate());
        hsnCode.setHsnRateFrom(hsnCodeDetails.getHsnRateFrom());
        hsnCode.setUpdatedBy(hsnCodeDetails.getUpdatedBy());                     

        HsnCode updatedHsnCode = hsnCodeRepository.save(hsnCode);
        return updatedHsnCode;
    }
}
