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
import com.endless.mercury.model.ItemOrderSchedule;
import com.endless.mercury.repository.ItemOrderScheduleRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ItemOrderScheduleController 
{
	@Autowired
    ItemOrderScheduleRepository itemOrderScheduleRepository;

 // Get All ItemOrderSchedules
    @GetMapping("/itemOrderSchedule")
    public List<ItemOrderSchedule> getAllItemOrderSchedules() {
        return itemOrderScheduleRepository.findAll();
    }

 // Create a new ItemOrderSchedule
    @PostMapping("/itemOrderSchedule")
    public ItemOrderSchedule createItemOrderSchedule(@Valid @RequestBody ItemOrderSchedule itemOrderSchedule) {
        return itemOrderScheduleRepository.save(itemOrderSchedule);
    }

 // Get a Single ItemOrderSchedule
    @GetMapping("/itemOrderSchedule/{id}")
    public ItemOrderSchedule getItemOrderScheduleById(@PathVariable(value = "id") Long itemOrderScheduleId) {
        return itemOrderScheduleRepository.findById(itemOrderScheduleId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemOrderSchedule", "id", itemOrderScheduleId));
    }
    
   
 // Delete a ItemOrderSchedule
    @DeleteMapping("/itemOrderSchedule/{id}")
    public ResponseEntity<?> deleteItemOrderSchedule(@PathVariable(value = "id") Long itemOrderScheduleId) {
        ItemOrderSchedule itemOrderSchedule = itemOrderScheduleRepository.findById(itemOrderScheduleId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemOrderSchedule", "id", itemOrderScheduleId));

        itemOrderScheduleRepository.delete(itemOrderSchedule);

        return ResponseEntity.ok().build();

    }
    
    // Update a ItemOrderSchedule
    @PutMapping("/itemOrderSchedule/{id}")
    public ItemOrderSchedule updateItemOrderSchedule(@PathVariable(value = "id") Long itemOrderScheduleId,
                                            @Valid @RequestBody ItemOrderSchedule itemOrderScheduleDetails) {

        ItemOrderSchedule itemOrderSchedule = itemOrderScheduleRepository.findById(itemOrderScheduleId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemOrderSchedule", "id", itemOrderScheduleId));

        itemOrderSchedule.setCreatedBy(itemOrderScheduleDetails.getCreatedBy());
        itemOrderSchedule.setCreatedClient(itemOrderScheduleDetails.getCreatedClient());
        itemOrderSchedule.setUpdatedBy(itemOrderScheduleDetails.getUpdatedBy());    
        itemOrderSchedule.setItemId(itemOrderScheduleDetails.getItemId());
        itemOrderSchedule.setItemOrderId(itemOrderScheduleDetails.getItemOrderId());
        itemOrderSchedule.setOrderScheduleOurCode(itemOrderScheduleDetails.getOrderScheduleOurCode());
        itemOrderSchedule.setScheduleKgs(itemOrderScheduleDetails.getScheduleKgs());
        itemOrderSchedule.setScheduleNos(itemOrderScheduleDetails.getScheduleNos());
        itemOrderSchedule.setScheduleValidDate(itemOrderScheduleDetails.getScheduleValidDate());
        itemOrderSchedule.setScheduleFor(itemOrderScheduleDetails.getScheduleFor());
        itemOrderSchedule.setScheduleType(itemOrderScheduleDetails.getScheduleType());
        itemOrderSchedule.setScheduleVendor(itemOrderScheduleDetails.getScheduleVendor());
        itemOrderSchedule.setVendorScheduleReference(itemOrderScheduleDetails.getVendorScheduleReference());
        
        ItemOrderSchedule updatedItemOrderSchedule = itemOrderScheduleRepository.save(itemOrderSchedule);
        return updatedItemOrderSchedule;
    }

}
