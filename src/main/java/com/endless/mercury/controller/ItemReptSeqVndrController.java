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
import com.endless.mercury.model.ItemReptSeqVndr;
import com.endless.mercury.repository.ItemReptSeqVndrRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ItemReptSeqVndrController 
{

	@Autowired
    ItemReptSeqVndrRepository itemReptSeqVndrRepository;

 // Get All ItemReptSeqVndr
    @GetMapping("/itemReptSeqVndr")
    public List<ItemReptSeqVndr> getAllItemReptSeqVndrs() {
        return itemReptSeqVndrRepository.findAll();
    }

 // Create a new ItemReptSeqVndr
    @PostMapping("/itemReptSeqVndr")
    public ItemReptSeqVndr createItemReptSeqVndr(@Valid @RequestBody ItemReptSeqVndr itemReptSeqVndr) {
        return itemReptSeqVndrRepository.save(itemReptSeqVndr);
    }

 // Get a Single ItemReptSeqVndr
    @GetMapping("/itemReptSeqVndr/{id}")
    public ItemReptSeqVndr getItemReptSeqVndrById(@PathVariable(value = "id") Long itemReptSeqVndrId) {
        return itemReptSeqVndrRepository.findById(itemReptSeqVndrId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemReptSeqVndr", "id", itemReptSeqVndrId));
    }
    
   
 // Delete a ItemReptSeqVndr
    @DeleteMapping("/itemReptSeqVndr/{id}")
    public ResponseEntity<?> deleteItemReptSeqVndr(@PathVariable(value = "id") Long itemReptSeqVndrId) {
        ItemReptSeqVndr itemReptSeqVndr = itemReptSeqVndrRepository.findById(itemReptSeqVndrId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemReptSeqVndr", "id", itemReptSeqVndrId));

        itemReptSeqVndrRepository.delete(itemReptSeqVndr);

        return ResponseEntity.ok().build();

    }
    
    // Update a ItemReptSeqVndr
    @PutMapping("/itemReptSeqVndr/{id}")
    public ItemReptSeqVndr updateItemReptSeqVndr(@PathVariable(value = "id") Long itemReptSeqVndrId,
                                            @Valid @RequestBody ItemReptSeqVndr itemReptSeqVndrDetails) {

        ItemReptSeqVndr itemReptSeqVndr = itemReptSeqVndrRepository.findById(itemReptSeqVndrId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemReptSeqVndr", "id", itemReptSeqVndrId));

        itemReptSeqVndr.setCreatedBy(itemReptSeqVndrDetails.getCreatedBy());
        itemReptSeqVndr.setCreatedClient(itemReptSeqVndrDetails.getCreatedClient());
        itemReptSeqVndr.setUpdatedBy(itemReptSeqVndrDetails.getUpdatedBy()); 
        itemReptSeqVndr.setBalanceQty(itemReptSeqVndrDetails.getBalanceQty());
        itemReptSeqVndr.setProcessFor(itemReptSeqVndrDetails.getProcessFor());
        itemReptSeqVndr.setSubItemId(itemReptSeqVndrDetails.getSubItemId());
        itemReptSeqVndr.setSubItemPriority(itemReptSeqVndrDetails.getSubItemPriority());
        itemReptSeqVndr.setSubItemSequenceNo(itemReptSeqVndrDetails.getSubItemSequenceNo());
        itemReptSeqVndr.setConsumptionForQty(itemReptSeqVndrDetails.getConsumptionForQty());
        itemReptSeqVndr.setConsumptionQty(itemReptSeqVndr.getConsumptionQty());
        itemReptSeqVndr.setCreatedBy(itemReptSeqVndr.getCreatedBy());
        itemReptSeqVndr.setCreatedClient(itemReptSeqVndr.getCreatedClient());
        itemReptSeqVndr.setCreatedDate(itemReptSeqVndr.getCreatedDate());
        itemReptSeqVndr.setFinishQty(itemReptSeqVndr.getFinishQty());
        itemReptSeqVndr.setHsnCodeId(itemReptSeqVndr.getHsnCodeId());
        itemReptSeqVndr.setItem(itemReptSeqVndr.getItem());
        itemReptSeqVndr.setItemType(itemReptSeqVndr.getItemType());
        itemReptSeqVndr.setProcessName(itemReptSeqVndr.getProcessName());
        itemReptSeqVndr.setProcessSequenceNo(itemReptSeqVndr.getProcessSequenceNo());
        itemReptSeqVndr.setProcessStageFor(itemReptSeqVndr.getProcessStageFor());
        itemReptSeqVndr.setProcessStageName(itemReptSeqVndr.getProcessStageName());
        itemReptSeqVndr.setProcessStageNo(itemReptSeqVndr.getProcessStageNo());
        itemReptSeqVndr.setReceipeVendor(itemReptSeqVndr.getReceipeVendor());
        itemReptSeqVndr.setRecipeVendorFlowId(itemReptSeqVndr.getRecipeVendorFlowId());
        itemReptSeqVndr.setProcessSharingPrecentage(itemReptSeqVndr.getProcessSharingPrecentage());
        itemReptSeqVndr.setUom(itemReptSeqVndr.getUom());
        itemReptSeqVndr.setUpdatedBy(itemReptSeqVndr.getUpdatedBy());
        itemReptSeqVndr.setProcessVendor(itemReptSeqVndr.getProcessVendor());
        itemReptSeqVndr.setVendorItemName(itemReptSeqVndr.getVendorItemName());
        itemReptSeqVndr.setVendorItemNameId(itemReptSeqVndr.getVendorItemNameId());
        itemReptSeqVndr.setVendorItemNumber(itemReptSeqVndr.getVendorItemNumber());
        itemReptSeqVndr.setVendorPriority(itemReptSeqVndr.getVendorPriority());
                
        
        ItemReptSeqVndr updatedItemReptSeqVndr = itemReptSeqVndrRepository.save(itemReptSeqVndr);
        return updatedItemReptSeqVndr;
    }

}
