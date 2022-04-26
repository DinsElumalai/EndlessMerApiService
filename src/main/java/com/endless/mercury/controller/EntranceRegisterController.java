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
import com.endless.mercury.model.EntranceRegister;
import com.endless.mercury.repository.EntranceRegisterRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EntranceRegisterController 
{

	@Autowired
	EntranceRegisterRepository entranceRegRepo;
	
	// Get All entranceRegister
    @GetMapping("/entrancereg")
    public List<EntranceRegister> getAllEntranceRegisters() {
        return entranceRegRepo.findAll();
    }
    
    // Create a new Record
    @PostMapping("/entrancereg")
    public EntranceRegister createEntranceRegister(@Valid @RequestBody EntranceRegister entranceRegister) {
        return entranceRegRepo.save(entranceRegister);
    }
    
    // Get a Single Record
    @GetMapping("/entrancereg/{id}")
    public EntranceRegister getEntranceRegisterById(@PathVariable(value = "id") Long entranceRegisterId) {
        return entranceRegRepo.findById(entranceRegisterId)
                .orElseThrow(() -> new ResourceNotFoundException("EntranceRegister", "id", entranceRegisterId));
    }
    
    // Get a Single Record by Our code
    @GetMapping("/entrancereg/code/{id}")
    public EntranceRegister getEntranceRegisterByOurCode(@PathVariable(value = "id") String id) {
        return entranceRegRepo.findByEntranceRegisterOurCode(id);
    }
    
    //Get last record
    @GetMapping("/entrancereg/last")
    public EntranceRegister getLastEntranceRegister()
    {
    	return entranceRegRepo.findTopByOrderByEntranceRegId();
    }
    
    //Get last record by code
    @GetMapping("/entrancereg/lastcode")
    public EntranceRegister getLastEntranceRegisterByCode()
    {
    	return entranceRegRepo.findTopByOrderByEntranceRegisterOurCode();
    }
    
    // Delete a Record
    @DeleteMapping("/entrancereg/{id}")
    public ResponseEntity<?> deleteEntranceRegister(@PathVariable(value = "id") Long id) {
    	EntranceRegister entranceRegister = entranceRegRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("EntranceRegister", "id", id));

        entranceRegRepo.delete(entranceRegister);

        return ResponseEntity.ok().build();

    }
    
    // Update a Record
    @PutMapping("/entrancereg/{id}")
    public EntranceRegister updateEntranceRegister(@PathVariable(value = "id") Long id,
                                            @Valid @RequestBody EntranceRegister entranceRegisterDetails) {

    	EntranceRegister entranceRegister = entranceRegRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("EntranceRegister", "id", id));
 
    	
    	entranceRegister.setAddress1(entranceRegisterDetails.getAddress1());
    	entranceRegister.setAddress2(entranceRegisterDetails.getAddress2());
    	entranceRegister.setComments(entranceRegisterDetails.getComments());
    	entranceRegister.setContactNo1(entranceRegisterDetails.getContactNo1());
    	entranceRegister.setContactNo2(entranceRegisterDetails.getContactNo2());
    	entranceRegister.setCreatedBy(entranceRegisterDetails.getCreatedBy());
    	entranceRegister.setCreatedClient(entranceRegisterDetails.getCreatedClient());
    	entranceRegister.setDriverName(entranceRegisterDetails.getDriverName());
    	entranceRegister.setEmployeeId(entranceRegisterDetails.getEmployeeId());
    	entranceRegister.setEntryCategory(entranceRegisterDetails.getEntryCategory());
    	entranceRegister.setEntryTime(entranceRegisterDetails.getEntryTime());
    	entranceRegister.setExitCategory(entranceRegisterDetails.getExitCategory());
    	entranceRegister.setExitCreatedBy(entranceRegisterDetails.getExitCreatedBy());
    	entranceRegister.setEntryCreatedBy(entranceRegisterDetails.getEntryCreatedBy());
    	entranceRegister.setEntryCreatedDate(entranceRegisterDetails.getEntryCreatedDate());
    	entranceRegister.setExitCreatedDate(entranceRegisterDetails.getExitCreatedDate());
    	entranceRegister.setExitTime(entranceRegisterDetails.getExitTime());
    	entranceRegister.setGloves(entranceRegisterDetails.getGloves());
    	entranceRegister.setPersonName(entranceRegisterDetails.getPersonName());
    	entranceRegister.setPurpose(entranceRegisterDetails.getPurpose());
    	entranceRegister.setRegisterDate(entranceRegisterDetails.getRegisterDate());
    	entranceRegister.setRegisterType(entranceRegisterDetails.getRegisterType());
    	entranceRegister.setRoundedEntryTime(entranceRegisterDetails.getRoundedEntryTime());
    	entranceRegister.setRoundedExitTime(entranceRegisterDetails.getRoundedExitTime());
    	entranceRegister.setSnacks(entranceRegisterDetails.getSnacks());
    	entranceRegister.setUpdatedBy(entranceRegisterDetails.getUpdatedBy());
    	entranceRegister.setUpdatedDate(entranceRegisterDetails.getUpdatedDate());
    	entranceRegister.setVehicleNo(entranceRegisterDetails.getVehicleNo());
    	entranceRegister.setVendorId(entranceRegisterDetails.getVendorId());
    	entranceRegister.setVendorName(entranceRegisterDetails.getVendorName());
    	entranceRegister.setVerified(entranceRegisterDetails.isVerified());
    	entranceRegister.setVerifiedBy(entranceRegisterDetails.getVerifiedBy());
    	entranceRegister.setRdurationHrs(entranceRegisterDetails.getRdurationHrs());
    	entranceRegister.setRdurationMins(entranceRegisterDetails.getRdurationMins());

    	EntranceRegister updatedEntranceRegister = entranceRegRepo.save(entranceRegister);
        return updatedEntranceRegister;
    }
    
}
