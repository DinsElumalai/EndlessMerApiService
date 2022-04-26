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
import com.endless.mercury.model.ItemSubType;
import com.endless.mercury.model.ItemType;
import com.endless.mercury.repository.ItemTypeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ItemTypeController {

	@Autowired
    ItemTypeRepository itemTypeRepository;

 // Get All ItemTypes
    @GetMapping("/itemType")
    public List<ItemType> getAllItemTypes() {
        return itemTypeRepository.findAll();
    }

 // Create a new ItemType
    @PostMapping("/itemType")
    public ItemType createItemType(@Valid @RequestBody ItemType itemType) {
        return itemTypeRepository.save(itemType);
    }
    
  //Get last record
    @GetMapping("/itemtypelast")
    public ItemType getLastTypeItem()
    {
    	return itemTypeRepository.findTopByOrderByItemTypeIdDesc();
    }

 // Get a Single ItemType
    @GetMapping("/itemType/{id}")
    public ItemType getItemTypeById(@PathVariable(value = "id") Long itemTypeId) {
        return itemTypeRepository.findById(itemTypeId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemType", "id", itemTypeId));
    }
    
 // Delete a ItemType
    @DeleteMapping("/itemType/{id}")
    public ResponseEntity<?> deleteItemType(@PathVariable(value = "id") Long itemTypeId) {
        ItemType itemType = itemTypeRepository.findById(itemTypeId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemType", "id", itemTypeId));

        itemTypeRepository.delete(itemType);

        return ResponseEntity.ok().build();

    }
    
 // Update a ItemType
    @PutMapping("/itemType/{id}")
    public ItemType updateItemType(@PathVariable(value = "id") Long itemTypeId,
                                            @Valid @RequestBody ItemType itemTypeDetails) {

        ItemType itemType = itemTypeRepository.findById(itemTypeId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemType", "id", itemTypeId));

        itemType.setDescription(itemTypeDetails.getDescription());
        itemType.setItemTypeName(itemTypeDetails.getItemTypeName());;
        itemType.setCreatedClient(itemTypeDetails.getCreatedClient());
        itemType.setUpdatedBy(itemTypeDetails.getUpdatedBy());
                 

        ItemType updatedItemType = itemTypeRepository.save(itemType);
        return updatedItemType;
    }
}
