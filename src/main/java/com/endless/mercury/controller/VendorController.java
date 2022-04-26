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
import com.endless.mercury.model.Item;
import com.endless.mercury.model.Vendor;
import com.endless.mercury.repository.VendorRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class VendorController 
{

	@Autowired
    VendorRepository vendorRepository;

 // Get All Vendors
    @GetMapping("/vendor")
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

 // Create a new Vendor
    @PostMapping("/vendor")
    public Vendor createVendor(@Valid @RequestBody Vendor vendor) {
        return vendorRepository.save(vendor);
    }

 // Get a Single Vendor
    @GetMapping("/vendor/{id}")
    public Vendor getVendorById(@PathVariable(value = "id") Long vendorId) {
        return vendorRepository.findById(vendorId)
                .orElseThrow(() -> new ResourceNotFoundException("Vendor", "id", vendorId));
    }
    
 // Get a Single Vendor code
    @GetMapping("/vendorcode/{id}")
    public Vendor getVendorByVendorCode(@PathVariable(value = "id") String vendorId) {
        return vendorRepository.findByVendorOurCode(vendorId);
    }
    
    
  //Get last record
    @GetMapping("/vendorlast")
    public Vendor getLastVendor()
    {
    	return vendorRepository.findTopByOrderByVendorOurCodeDesc();
    }
 // Delete a Vendor
    @DeleteMapping("/vendor/{id}")
    public ResponseEntity<?> deleteVendor(@PathVariable(value = "id") Long vendorId) {
        Vendor vendor = vendorRepository.findById(vendorId)
                .orElseThrow(() -> new ResourceNotFoundException("Vendor", "id", vendorId));

        vendorRepository.delete(vendor);

        return ResponseEntity.ok().build();

    }
    
 // Update a Item
    @PutMapping("/vendor/{id}")
    public Vendor updatevendor(@PathVariable(value = "id") Long vendorId,
                                            @Valid @RequestBody Vendor vendorDetails) {

    	Vendor vendor = vendorRepository.findById(vendorId)
                .orElseThrow(() -> new ResourceNotFoundException("Vendor", "id", vendorId));

    	vendor.setActive(vendorDetails.isActive());
    	vendor.setAddress1(vendorDetails.getAddress1());
    	vendor.setAddress2(vendorDetails.getAddress2());
    	vendor.setAddress3(vendorDetails.getAddress3());
    	vendor.setCity(vendorDetails.getCity());
    	vendor.setComments(vendorDetails.getComments());
    	vendor.setCountry(vendorDetails.getCountry());
    	vendor.setGstin(vendorDetails.getGstin());
    	vendor.setInActivatedDate(vendorDetails.getInActivatedDate());
    	vendor.setJobWork(vendorDetails.isJobWork());
    	vendor.setManPower(vendorDetails.isManPower());
    	vendor.setPincode(vendorDetails.getPincode());
    	vendor.setCreatedClient(vendorDetails.getCreatedClient());
    	vendor.setPriority(vendorDetails.getPriority());
    	vendor.setPurchase(vendorDetails.isPurchase());
    	vendor.setRegisteredate(vendorDetails.getRegisteredate());
    	vendor.setSales(vendorDetails.isSales());
    	vendor.setState(vendorDetails.getState());
    	vendor.setTransporter(vendorDetails.isTransporter());
    	vendor.setUpdatedUserId(vendorDetails.getUpdatedUserId());
    	vendor.setVendorGivenCode(vendorDetails.getVendorGivenCode());
    	vendor.setVendorId(vendorDetails.getVendorId());
    	vendor.setVendorName(vendorDetails.getVendorName());
    	vendor.setVendorNameAc(vendorDetails.getVendorNameAc());
    	vendor.setVendorNameId(vendorDetails.getVendorNameId());
    	vendor.setVendorOurCode(vendorDetails.getVendorOurCode());
    	vendor.setVendorOurTypeCode(vendorDetails.getVendorOurTypeCode());
    	vendor.setVendorSubType(vendorDetails.getVendorSubType());
    	vendor.setVendorType(vendorDetails.getVendorType());             

    	Vendor updatedvendor = vendorRepository.save(vendor);
        return updatedvendor;
    }
}
