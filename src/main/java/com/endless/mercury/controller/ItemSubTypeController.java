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
import com.endless.mercury.repository.ItemSubTypeRepository;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ItemSubTypeController {

	@Autowired
    ItemSubTypeRepository itemSubTypeRepository;

 // Get All ItemTypes
    @GetMapping("/itemsubtype")
    public List<ItemSubType> getAllItemTypes() {
        return itemSubTypeRepository.findAll();
    }

 // Create a new ItemType
    @PostMapping("/itemsubtype")
    public ItemSubType createItemType(@Valid @RequestBody ItemSubType itemSubType) {
        return itemSubTypeRepository.save(itemSubType);
    }
    
  //Get last record
    @GetMapping("/itemsubtypelast")
    public ItemSubType getLastSubTypeItem()
    {
    	return itemSubTypeRepository.findTopByOrderByItemSubTypeIdDesc();
    }

  //Get last record based on itemsubtype
    @GetMapping("/itemstbytyid/{id}")
    public List<ItemSubType> getSubTypeLastItem(@PathVariable(value = "id") String itemSubTypeId)
    {
    	return itemSubTypeRepository.findByItemTypeId(itemSubTypeId);
    }
 // Get a Single ItemType
    @GetMapping("/itemsubtype/{id}")
    public ItemSubType getItemTypeById(@PathVariable(value = "id") Long itemSubTypeId) {
        return itemSubTypeRepository.findById(itemSubTypeId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemSubType", "id", itemSubTypeId));
    }
    
 // Delete a ItemType
    @DeleteMapping("/itemsubtype/{id}")
    public ResponseEntity<?> deleteItemType(@PathVariable(value = "id") Long itemSubTypeId) {
        ItemSubType itemSubType = itemSubTypeRepository.findById(itemSubTypeId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemSubType", "id", itemSubTypeId));

        itemSubTypeRepository.delete(itemSubType);

        return ResponseEntity.ok().build();

    }
    
 // Update a ItemSubType
    @PutMapping("/itemsubtype/{id}")
    public ItemSubType updateItemSubType(@PathVariable(value = "id") Long itemSubTypeId,
                                            @Valid @RequestBody ItemSubType itemSubTypeDetails) {

        ItemSubType itemSubType = itemSubTypeRepository.findById(itemSubTypeId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemSubType", "id", itemSubTypeId));

        itemSubType.setItemPrefix(itemSubTypeDetails.getItemPrefix());
        itemSubType.setItemSubTypeDesc(itemSubTypeDetails.getItemSubTypeDesc());
        itemSubType.setItemSubTypeName(itemSubTypeDetails.getItemSubTypeName());
        itemSubType.setItemTypeId(itemSubTypeDetails.getItemTypeId());
        itemSubType.setCreatedClient(itemSubTypeDetails.getCreatedClient());
        itemSubType.setUpdatedBy(itemSubTypeDetails.getUpdatedBy());
                            

        ItemSubType updatedItemSubType = itemSubTypeRepository.save(itemSubType);
        return updatedItemSubType;
    }
}
