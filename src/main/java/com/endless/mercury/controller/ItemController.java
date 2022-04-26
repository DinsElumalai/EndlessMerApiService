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
import com.endless.mercury.model.Employee;
import com.endless.mercury.model.EmployeeDesignation;
import com.endless.mercury.model.Item;
import com.endless.mercury.repository.ItemRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ItemController {

	@Autowired
    ItemRepository itemRepository;

 // Get All Items
    @GetMapping("/item")
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

 // Create a new Item
    @PostMapping("/item")
    public Item createItem(@Valid @RequestBody Item item) {
        return itemRepository.save(item);
    }

 // Get a Single Item
    @GetMapping("/item/{id}")
    public Item getItemById(@PathVariable(value = "id") Long itemId) {
        return itemRepository.findById(itemId)
                .orElseThrow(() -> new ResourceNotFoundException("Item", "id", itemId));
    }
    
 // Get a Single Item code
    @GetMapping("/itemcode/{id}")
    public Item getItemByItemCode(@PathVariable(value = "id") String itemId) {
        return itemRepository.findByItemOurCode(itemId);
    }
    
 // Get a Single Item by item sub type id
    @GetMapping("/itembyst/{id}")
    public Item getItemByItemSubType(@PathVariable(value = "id") String itemSubTypeId) {
        return itemRepository.findTopByItemSubTypeIdOrderByItemOurTypeCodeDesc(itemSubTypeId);
    }
    //Get last record
    @GetMapping("/itemlast")
    public Item getLastItem()
    {
    	return itemRepository.findTopByOrderByItemIdDesc();
    }
    
  
 // Delete a Item
    @DeleteMapping("/item/{id}")
    public ResponseEntity<?> deleteItem(@PathVariable(value = "id") Long itemId) {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new ResourceNotFoundException("Item", "id", itemId));

        itemRepository.delete(item);

        return ResponseEntity.ok().build();

    }
    
    // Update a Item
    @PutMapping("/item/{id}")
    public Item updateItem(@PathVariable(value = "id") Long itemId,
                                            @Valid @RequestBody Item itemDetails) {

        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new ResourceNotFoundException("Item", "id", itemId));

        item.setActive(itemDetails.getActive());
        item.setBufferQty(itemDetails.getBufferQty());
        item.setComments(itemDetails.getComments());
        item.setHsnSacCode(itemDetails.getHsnSacCode());
        item.setImageName(itemDetails.getImageName());
        item.setInactivatedDate(itemDetails.getInactivatedDate());
        item.setItemDescription(itemDetails.getItemDescription());
        item.setItemName(itemDetails.getItemName());
        item.setItemNameId(itemDetails.getItemNameId());
        item.setItemNumber(itemDetails.getItemNumber());
        item.setItemOurCode(itemDetails.getItemOurCode());
        item.setItemOurTypeCode(itemDetails.getItemOurTypeCode());
        item.setItemSubTypeId(itemDetails.getItemSubTypeId());
        item.setItemTypeId(itemDetails.getItemTypeId());
        item.setCreatedClient(itemDetails.getCreatedClient());
        item.setRegisteredDate(itemDetails.getRegisteredDate());
        item.setReorderQtyLevel(itemDetails.getReorderQtyLevel());
        item.setUnitCategory(itemDetails.getUnitCategory());
        item.setVendorId(itemDetails.getVendorId());
                     

        Item updatedItem = itemRepository.save(item);
        return updatedItem;
    }
}
