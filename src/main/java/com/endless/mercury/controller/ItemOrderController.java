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
import com.endless.mercury.model.ItemOrder;
import com.endless.mercury.repository.ItemOrderRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ItemOrderController {

	@Autowired
    ItemOrderRepository itemOrderRepository;

 // Get All ItemOrders
    @GetMapping("/itemOrder")
    public List<ItemOrder> getAllItemOrders() {
        return itemOrderRepository.findAll();
    }

 // Create a new ItemOrder
    @PostMapping("/itemOrder")
    public ItemOrder createItemOrder(@Valid @RequestBody ItemOrder itemOrder) {
        return itemOrderRepository.save(itemOrder);
    }

 // Get a Single ItemOrder
    @GetMapping("/itemOrder/{id}")
    public ItemOrder getItemOrderById(@PathVariable(value = "id") Long itemOrderId) {
        return itemOrderRepository.findById(itemOrderId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemOrder", "id", itemOrderId));
    }
    
    // Get a Item orders by vendor id
    @GetMapping("/itemOrder/ordertovndrId/{id}")
    public List<ItemOrder> getItemOrderByOrderToVendorId(@PathVariable(value = "id") String id) {
        return itemOrderRepository.findByOrderToVendorId(id);
    }
    
    // Get a Item orders by item id
    @GetMapping("/itemOrder/itemId/{id}")
    public List<ItemOrder> getItemOrderByItemId(@PathVariable(value = "id") String id) {
        return itemOrderRepository.findByItemId(id);
    }
     
 // Delete a ItemOrder
    @DeleteMapping("/itemOrder/{id}")
    public ResponseEntity<?> deleteItemOrder(@PathVariable(value = "id") Long itemOrderId) {
        ItemOrder itemOrder = itemOrderRepository.findById(itemOrderId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemOrder", "id", itemOrderId));

        itemOrderRepository.delete(itemOrder);

        return ResponseEntity.ok().build();

    }
    
    // Update a ItemOrder
    @PutMapping("/itemOrder/{id}")
    public ItemOrder updateItemOrder(@PathVariable(value = "id") Long itemOrderId,
                                            @Valid @RequestBody ItemOrder itemOrderDetails) {

        ItemOrder itemOrder = itemOrderRepository.findById(itemOrderId)
                .orElseThrow(() -> new ResourceNotFoundException("ItemOrder", "id", itemOrderId));

        itemOrder.setComments(itemOrderDetails.getComments());
        itemOrder.setConsumeItemWtGms(itemOrderDetails.getConsumeItemWtGms());
        itemOrder.setContactMail(itemOrderDetails.getContactMail());
        itemOrder.setContactNo(itemOrderDetails.getContactNo());
        itemOrder.setContactPerson(itemOrderDetails.getContactPerson());
        itemOrder.setCreatedBy(itemOrderDetails.getCreatedBy());
        itemOrder.setCreatedClient(itemOrderDetails.getCreatedClient());
        itemOrder.setDeliveryTerms(itemOrderDetails.getDeliveryTerms());
        itemOrder.setDeliveryToVendorId(itemOrderDetails.getDeliveryToVendorId());
        itemOrder.setDiscountPrecentage(itemOrderDetails.getDiscountPrecentage());
        itemOrder.setFinishedItemWtGms(itemOrderDetails.getFinishedItemWtGms());
        itemOrder.setFreightCalcType(itemOrderDetails.getFreightCalcType());
        itemOrder.setFreightRate(itemOrderDetails.getFreightRate());
        itemOrder.setFreightRateType(itemOrderDetails.getFreightRateType());
        itemOrder.setHsnsaCode(itemOrderDetails.getHsnsaCode());
        itemOrder.setHsnsaCodeId(itemOrderDetails.getHsnsaCodeId());
        itemOrder.setHsnsaDescription(itemOrderDetails.getHsnsaDescription());
        itemOrder.setHsnsaRateEffectiveFrom(itemOrderDetails.getHsnsaRateEffectiveFrom());
        itemOrder.setHsnsaRatePercentage(itemOrderDetails.getHsnsaRatePercentage());
        itemOrder.setItemId(itemOrderDetails.getItemId());
        itemOrder.setItemTypeId(itemOrderDetails.getItemTypeId());
        itemOrder.setJobworkRedPercentage(itemOrderDetails.getJobworkRedPercentage());
        itemOrder.setModeOfDispatch(itemOrderDetails.getModeOfDispatch());
        itemOrder.setMultipleHsnRate(itemOrderDetails.getMultipleHsnRate());
        itemOrder.setOrderDate(itemOrderDetails.getOrderDate());
        itemOrder.setOrderEffectiveFromDate(itemOrderDetails.getOrderEffectiveFromDate());
        itemOrder.setOrderFor(itemOrderDetails.getOrderFor());
        itemOrder.setOrderItemApprovalStatus(itemOrderDetails.getOrderItemApprovalStatus());
        itemOrder.setOrderItemStatus(itemOrderDetails.getOrderItemStatus());
        itemOrder.setOrderItemWtGms(itemOrderDetails.getOrderItemWtGms());
        itemOrder.setOrderKgs(itemOrderDetails.getOrderKgs());
        itemOrder.setOrderLineNo(itemOrderDetails.getOrderLineNo());
        itemOrder.setOrderNo(itemOrderDetails.getOrderNo());
        itemOrder.setOrderNos(itemOrderDetails.getOrderNos());
        itemOrder.setOrderOurCode(itemOrderDetails.getOrderOurCode());
        itemOrder.setOrderRptIssueDate(itemOrderDetails.getOrderRptIssueDate());
        itemOrder.setOrderToVendorId(itemOrderDetails.getOrderToVendorId());
        itemOrder.setOrderType(itemOrderDetails.getOrderType());
        itemOrder.setPackagingCalcType(itemOrderDetails.getPackagingCalcType());
        itemOrder.setPackagingRate(itemOrderDetails.getPackagingRate());
        itemOrder.setPackagingRateType(itemOrderDetails.getPackagingRateType());
        itemOrder.setPaymentTerms(itemOrderDetails.getPaymentTerms());
        itemOrder.setPfCalcType(itemOrderDetails.getPfCalcType());
        itemOrder.setPfRate(itemOrderDetails.getPfRate());
        itemOrder.setPfRateType(itemOrderDetails.getPfRateType());
        itemOrder.setPrecisionKgsDigit(itemOrderDetails.getPrecisionKgsDigit());
        itemOrder.setPrecisionNosDigit(itemOrderDetails.getPrecisionNosDigit());
        itemOrder.setProcessStageNo(itemOrderDetails.getProcessStageNo());
        itemOrder.setRecipeVendorFlowId(itemOrderDetails.getRecipeVendorFlowId());
        itemOrder.setScheduleVariationPercentage(itemOrderDetails.getScheduleVariationPercentage());
        itemOrder.setSpecialInstruction(itemOrderDetails.getSpecialInstruction());
        itemOrder.setTcsPercentage(itemOrderDetails.getTcsPercentage());
        itemOrder.setUnitPriceUom(itemOrderDetails.getUnitPriceUom());
        itemOrder.setUom(itemOrderDetails.getUom());
        itemOrder.setUpdatedBy(itemOrderDetails.getUpdatedBy());
        itemOrder.setVendorItemName(itemOrderDetails.getVendorItemName());
        itemOrder.setVendorItemNameId(itemOrderDetails.getVendorItemNameId());
        itemOrder.setVendorItemNumber(itemOrderDetails.getVendorItemNumber());
        itemOrder.setVendorItemWtGms(itemOrderDetails.getVendorItemWtGms());
           

        ItemOrder updatedItemOrder = itemOrderRepository.save(itemOrder);
        return updatedItemOrder;
    }
}
