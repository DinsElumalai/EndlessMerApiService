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
import com.endless.mercury.model.ItemDocument;
import com.endless.mercury.repository.ItemDocumentRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ItemDocumentController 
{

	@Autowired
    ItemDocumentRepository itemDocumentRepository;

 // Get All ItemDocument
    @GetMapping("/itemDocument")
    public List<ItemDocument> getAllItemDocuments() {
        return itemDocumentRepository.findAll();
    }

 // Create a new ItemDocument
    @PostMapping("/itemDocument")
    public ItemDocument createItemDocument(@Valid @RequestBody ItemDocument itemDocument) {
        return itemDocumentRepository.save(itemDocument);
    }

 // Get a Single ItemDocument
    @GetMapping("/itemDocument/{id}")
    public ItemDocument getItemDocumentById(@PathVariable(value = "id") Long itemDocumentId) {
        return itemDocumentRepository.findById(itemDocumentId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemDocument", "id", itemDocumentId));
    }
    
   
 // Delete a ItemDocument
    @DeleteMapping("/itemDocument/{id}")
    public ResponseEntity<?> deleteItemDocument(@PathVariable(value = "id") Long itemDocumentId) {
        ItemDocument itemDocument = itemDocumentRepository.findById(itemDocumentId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemDocument", "id", itemDocumentId));

        itemDocumentRepository.delete(itemDocument);

        return ResponseEntity.ok().build();

    }
    
    // Update a ItemDocument
    @PutMapping("/itemDocument/{id}")
    public ItemDocument updateItemDocument(@PathVariable(value = "id") Long itemDocumentId,
                                            @Valid @RequestBody ItemDocument itemDocumentDetails) {

        ItemDocument itemDocument = itemDocumentRepository.findById(itemDocumentId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemDocument", "id", itemDocumentId));

        itemDocument.setCreatedBy(itemDocumentDetails.getCreatedBy());
        itemDocument.setCreatedClient(itemDocumentDetails.getCreatedClient());
        itemDocument.setUpdatedBy(itemDocumentDetails.getUpdatedBy()); 
        itemDocument.setAmount(itemDocumentDetails.getAmount());
        itemDocument.setCgst(itemDocumentDetails.getCgst());
        itemDocument.setConsiderOrder(itemDocumentDetails.getConsiderOrder());
        itemDocument.setConsumeItemWeightInGms(itemDocumentDetails.getConsumeItemWeightInGms());
        itemDocument.setConvertedDocument(itemDocumentDetails.getConvertedDocument());
        itemDocument.setConvertedItemDocumentId(itemDocumentDetails.getConvertedItemDocumentId());
        itemDocument.setConvertedQtyInKgs(itemDocumentDetails.getConvertedQtyInKgs());
        itemDocument.setConvertedQtyInNos(itemDocumentDetails.getConvertedQtyInNos());
        itemDocument.setCreatedDate(itemDocumentDetails.getCreatedDate());
        itemDocument.setDeliveryVendorId(itemDocumentDetails.getDeliveryVendorId());
        itemDocument.setDocumentCategory(itemDocumentDetails.getDocumentCategory());
        itemDocument.setDocumentDate(itemDocumentDetails.getDocumentDate());
        itemDocument.setDocumentFor(itemDocumentDetails.getDocumentFor());
        itemDocument.setDocumentOurCode(itemDocumentDetails.getDocumentOurCode());
        itemDocument.setDocumentPurpose(itemDocumentDetails.getDocumentPurpose());
        itemDocument.setDocumentQtyInKgs(itemDocumentDetails.getDocumentQtyInKgs());
        itemDocument.setDocumentType(itemDocumentDetails.getDocumentType());
        itemDocument.setDocumentTime(itemDocumentDetails.getDocumentTime());
        itemDocument.setDocumetQtyInNos(itemDocumentDetails.getDocumetQtyInNos());
        itemDocument.setEntranceRegisterId(itemDocumentDetails.getEntranceRegisterId());
        itemDocument.setFinishedItemWeightInGms(itemDocumentDetails.getFinishedItemWeightInGms());
        itemDocument.setHsnsaCode(itemDocumentDetails.getHsnsaCode());
        itemDocument.setHsnsaDescription(itemDocumentDetails.getHsnsaDescription());
        itemDocument.setHsnsaId(itemDocumentDetails.getHsnsaId());
        itemDocument.setHsnsaRateEffectiveFrom(itemDocumentDetails.getHsnsaRateEffectiveFrom());
        itemDocument.setHsnsaRatePercentage(itemDocumentDetails.getHsnsaRatePercentage());
        itemDocument.setIgst(itemDocumentDetails.getIgst());
        itemDocument.setItemDocumentId(itemDocumentDetails.getItemDocumentId());
        itemDocument.setItemId(itemDocumentDetails.getItemId());
        itemDocument.setItemOrderId(itemDocumentDetails.getItemOrderId());
        itemDocument.setItemOrderScheduleId(itemDocumentDetails.getItemOrderScheduleId());
        itemDocument.setJobworkReductionPercentage(itemDocumentDetails.getJobworkReductionPercentage());
        itemDocument.setMultipleOrder(itemDocumentDetails.getMultipleOrder());
        itemDocument.setNoOfExtracopy(itemDocumentDetails.getNoOfExtracopy());
        itemDocument.setNoOfPackaging(itemDocumentDetails.getNoOfPackaging());
        itemDocument.setOrderItemWeightInGms(itemDocumentDetails.getOrderItemWeightInGms());
        itemDocument.setPackaging(itemDocumentDetails.getPackaging());
        itemDocument.setPrefixSpecial(itemDocumentDetails.getPrefixSpecial());
        itemDocument.setProcessStageNo(itemDocumentDetails.getProcessStageNo());
        itemDocument.setQtyInKgs(itemDocumentDetails.getQtyInKgs());
        itemDocument.setQtyInNos(itemDocumentDetails.getQtyInNos());
        itemDocument.setRemovalDate(itemDocumentDetails.getRemovalDate());
        itemDocument.setRemovalTime(itemDocumentDetails.getRemovalTime());
        itemDocument.setRequisitionNo(itemDocumentDetails.getRequisitionNo());
        itemDocument.setRequistionType(itemDocumentDetails.getRequistionType());
        itemDocument.setReturnable(itemDocumentDetails.getReturnable());
        itemDocument.setSgst(itemDocumentDetails.getSgst());
        itemDocument.setStockCalcMethod(itemDocumentDetails.getStockCalcMethod());
        itemDocument.setStockConsidered(itemDocumentDetails.getStockConsidered());
        itemDocument.setUnitPrizePerUom(itemDocumentDetails.getUnitPrizePerUom());
        itemDocument.setUom(itemDocumentDetails.getUom());
        itemDocument.setUpdatedBy(itemDocumentDetails.getUpdatedBy());
        itemDocument.setVehicleNO(itemDocumentDetails.getVehicleNO());
        itemDocument.setVendorId(itemDocumentDetails.getVendorId());
        itemDocument.setVendorItemName(itemDocumentDetails.getVendorItemName());
        itemDocument.setVendorItemNumber(itemDocumentDetails.getVendorItemNumber());
        itemDocument.setVendorItemWeightInGms(itemDocumentDetails.getVehicleNO());
        
        
        
        ItemDocument updatedItemDocument = itemDocumentRepository.save(itemDocument);
        return updatedItemDocument;
    }

}
