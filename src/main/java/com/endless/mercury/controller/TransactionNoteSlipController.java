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
import com.endless.mercury.model.TransactionNoteSlip;
import com.endless.mercury.repository.TransactionNoteSlipRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TransactionNoteSlipController 
{

	@Autowired
    TransactionNoteSlipRepository transactionNoteSlipRepository;

 // Get All TransactionNoteSlips
    @GetMapping("/tns")
    public List<TransactionNoteSlip> getAllTransactionNoteSlips() {
        return transactionNoteSlipRepository.findAll();
    }

 // Get All TransactionNoteSlips by Req Cat Code
    @GetMapping("/tns/listbyreqcode/{reqCode}")
    public List<TransactionNoteSlip> getAllTransactionNoteSlipsByReqCode(@PathVariable(value = "reqCode") String reqCode) {
        return transactionNoteSlipRepository.findByRequisitionCategory(reqCode);
    }

 // Create a new TransactionNoteSlip
    @PostMapping("/tns")
    public TransactionNoteSlip createTransactionNoteSlip(@Valid @RequestBody TransactionNoteSlip transactionNoteSlip) {
        return transactionNoteSlipRepository.save(transactionNoteSlip);
    }

 // Get a Single TransactionNoteSlip
    @GetMapping("/tns/{id}")
    public TransactionNoteSlip getTransactionNoteSlipById(@PathVariable(value = "id") Long transactionNoteSlipId) {
        return transactionNoteSlipRepository.findById(transactionNoteSlipId)
                .orElseThrow(() -> new ResourceNotFoundException("TransactionNoteSlip", "id", transactionNoteSlipId));
    }
    
 // Get a Single TransactionNoteSlip our code
    @GetMapping("/tnscode/{id}")
    public TransactionNoteSlip getTransactionNoteSlipByEymployeeOurCode(@PathVariable(value = "id") String transactionNoteSlipId) {
        return transactionNoteSlipRepository.findByRequisitionCategoryOurCode(transactionNoteSlipId);
    }
    
 // Get a Last TransactionNoteSlip 
    @GetMapping("/tnslast/{reqCode}")
    public TransactionNoteSlip getLastTransactionNoteSlip(@PathVariable(value = "reqCode") String requisitionCategoryOurCOde) {
        return transactionNoteSlipRepository.findFirstByRequisitionCategoryOrderByNoteSlipIdDesc(requisitionCategoryOurCOde );
    }
    
    // Get a Last PDRN TransactionNoteSlip 
    @GetMapping("/tnslastpdrn/{partItemId}/{partStage}/{issueTo}/{reqCode}")
    public TransactionNoteSlip getLastPdrnTransactionNoteSlip(@PathVariable(value = "partItemId") String partItemId, @PathVariable(value = "partStage") String partStage, @PathVariable(value = "issueTo") String issueTo,@PathVariable(value = "reqCode") String requisitionCategoryOurCOde) {
        return transactionNoteSlipRepository.findFirstByPartItemIdAndPartStageAndIssueToVendorIdAndRequisitionCategoryOrderByNoteSlipIdDesc(partItemId, partStage, issueTo, requisitionCategoryOurCOde );
    }
 // Get a Last TransactionNoteSlip 
    @GetMapping("/tnslastpvr/{partItemId}/{vendorId}/{reqCode}")
    public TransactionNoteSlip getLastTransactionNoteSlipBypvr(@PathVariable(value = "partItemId") String partItemId,@PathVariable(value = "vendorId") String issueTo,@PathVariable(value = "reqCode") String requisitionCategoryOurCOde) {
        return transactionNoteSlipRepository.findFirstByPartItemIdAndIssueToVendorIdAndRequisitionCategoryOrderByNoteSlipIdDesc(partItemId,issueTo,requisitionCategoryOurCOde );
    }
    
 // Get a Last TransactionNoteSlip 
    @GetMapping("/tnslastrpvr/{returnpartItemId}/{issueToVendorId}/{reqCode}")
    public TransactionNoteSlip getLastTransactionNoteSlipByrpvr(@PathVariable(value = "returnpartItemId") String partItemId,@PathVariable(value = "issueToVendorId") String issueTo,@PathVariable(value = "reqCode") String requisitionCategoryOurCOde) {
        return transactionNoteSlipRepository.findFirstByReturnPartItemIdAndIssueToVendorIdAndRequisitionCategoryOrderByNoteSlipIdDesc(partItemId,issueTo,requisitionCategoryOurCOde );
    }
    
 // Get a Last TransactionNoteSlip 
    @GetMapping("/tnslastrcptfrompdrn/{partItemId}/{receiptFrom}/{reqCode}")
    public TransactionNoteSlip getLastTransactionNoteSlipByReceiptFromPDRN(@PathVariable(value = "partItemId") String partItemId,@PathVariable(value = "receiptFrom") String receiptFrom,@PathVariable(value = "reqCode") String requisitionCategoryOurCOde) {
        return transactionNoteSlipRepository.findFirstByPartItemIdAndIssueToVendorIdAndRequisitionCategoryOrderByNoteSlipIdDesc(partItemId,receiptFrom,requisitionCategoryOurCOde );
    }
    
    
 // Get a Last TransactionNoteSlip 
    @GetMapping("/tnslastbystage/{partItemId}/{partStage}/{reqCode}")
    public TransactionNoteSlip getLastTransactionNoteSlipByStage(@PathVariable(value = "partItemId") String partItemId,@PathVariable(value = "partStage") String partStage,@PathVariable(value = "reqCode") String requisitionCategoryOurCOde) {
        return transactionNoteSlipRepository.findFirstByPartItemIdAndPartStageAndRequisitionCategoryOrderByNoteSlipIdDesc(partItemId,partStage,requisitionCategoryOurCOde );
    }
   
 // Delete a TransactionNoteSlip
    @DeleteMapping("/tns/{id}")
    public ResponseEntity<?> deleteTransactionNoteSlip(@PathVariable(value = "id") Long transactionNoteSlipId) {
        TransactionNoteSlip transactionNoteSlip = transactionNoteSlipRepository.findById(transactionNoteSlipId)
                .orElseThrow(() -> new ResourceNotFoundException("TransactionNoteSlip", "id", transactionNoteSlipId));

        transactionNoteSlipRepository.delete(transactionNoteSlip);

        return ResponseEntity.ok().build();

}
     // Update a TransactionNoteSlip
    @PutMapping("/tns/{id}")
    public TransactionNoteSlip updateTransactionNoteSlip(@PathVariable(value = "id") Long empId,
                                            @Valid @RequestBody TransactionNoteSlip transactionNoteSlipDetails) {

        TransactionNoteSlip transactionNoteSlip = transactionNoteSlipRepository.findById(empId)
                .orElseThrow(() -> new ResourceNotFoundException("TransactionNoteSlip", "id", empId));

        transactionNoteSlip.setRequisitionCategoryOurCode( transactionNoteSlipDetails.getRequisitionCategoryOurCode());
        transactionNoteSlip.setAdjustNos(transactionNoteSlipDetails.getAdjustNos());
        transactionNoteSlip.setAdjustWt( transactionNoteSlipDetails.getAdjustWt()   );
        transactionNoteSlip.setBatchNo(  transactionNoteSlipDetails.getBatchNo()   );
        transactionNoteSlip.setBinLocation( transactionNoteSlipDetails.getBinLocation()   );
        transactionNoteSlip.setNoteSlipDate(transactionNoteSlipDetails.getNoteSlipDate()   );
        transactionNoteSlip.setDirectTakenNos(   transactionNoteSlipDetails.getDirectTakenNos()   );
        transactionNoteSlip.setDirectTakenWt(    transactionNoteSlipDetails.getDirectTakenWt()   );
        transactionNoteSlip.setFromShopfloor(   transactionNoteSlipDetails.isFromShopfloor()   );
        transactionNoteSlip.setInchargeEmployeeId(    transactionNoteSlipDetails.getInchargeEmployeeId()   );
        transactionNoteSlip.setIssueCategory(    transactionNoteSlipDetails.getIssueCategory()   );
        transactionNoteSlip.setIssueToVendorId(    transactionNoteSlipDetails.getIssueToVendorId()   );
        transactionNoteSlip.setMachineItemId(    transactionNoteSlipDetails.getMachineItemId()   );
        transactionNoteSlip.setMismatchNos(    transactionNoteSlipDetails.getMismatchNos()   );
        transactionNoteSlip.setMismatchWt(    transactionNoteSlipDetails.getMismatchWt()   );
        transactionNoteSlip.setOkayNos(    transactionNoteSlipDetails.getOkayNos()   );
        transactionNoteSlip.setOkayWt(    transactionNoteSlipDetails.getOkayWt()   );
        transactionNoteSlip.setOpeningNos(    transactionNoteSlipDetails.getOpeningNos()   );
        transactionNoteSlip.setOpeningWt(    transactionNoteSlipDetails.getOpeningWt()   );
        transactionNoteSlip.setOperatorEmployeeId(  transactionNoteSlipDetails.getOperatorEmployeeId()   );
        transactionNoteSlip.setPartItemId(    transactionNoteSlipDetails.getPartItemId()   );
        transactionNoteSlip.setPartStage(    transactionNoteSlipDetails.getPartStage()   );
        transactionNoteSlip.setPartStageNumber(    transactionNoteSlipDetails.getPartStageNumber()   );
        transactionNoteSlip.setPendingTakenNos(   transactionNoteSlipDetails.getPendingTakenNos()   );
        transactionNoteSlip.setPendingTakenWt(    transactionNoteSlipDetails.getPendingTakenWt()   );
        transactionNoteSlip.setCreatedClient(transactionNoteSlipDetails.getCreatedClient()   );
        transactionNoteSlip.setProductionCategory(    transactionNoteSlipDetails.getProductionCategory()   );
        transactionNoteSlip.setRawMaterialItemId(    transactionNoteSlipDetails.getRawMaterialItemId()   );
        transactionNoteSlip.setReceiptDate(    transactionNoteSlipDetails.getReceiptDate()   );
        transactionNoteSlip.setReceiptFromVendorId(    transactionNoteSlipDetails.getReceiptFromVendorId()   );
        transactionNoteSlip.setRcrnRefNoteSlipId(  transactionNoteSlipDetails.getRcrnRefNoteSlipId()   );
        transactionNoteSlip.setPponRefNoteSlipId(   transactionNoteSlipDetails.getPponRefNoteSlipId()  );
        transactionNoteSlip.setRpanRefNoteSlipId(    transactionNoteSlipDetails.getRpanRefNoteSlipId()   );
        transactionNoteSlip.setPdrnRefNoteSlipId( transactionNoteSlipDetails.getPdrnRefNoteSlipId()   );
        transactionNoteSlip.setRejectedNos(    transactionNoteSlipDetails.getRejectedNos()   );
        transactionNoteSlip.setRejectedReason(    transactionNoteSlipDetails.getRejectedReason()   );
        transactionNoteSlip.setRejectedWt(    transactionNoteSlipDetails.getRejectedWt()   );
        transactionNoteSlip.setRemarks(    transactionNoteSlipDetails.getRemarks()   );
        transactionNoteSlip.setRequisitionCategory(   transactionNoteSlipDetails.getRequisitionCategory()   );
        transactionNoteSlip.setRequisitionCategoryOurCode(    transactionNoteSlipDetails.getRequisitionCategoryOurCode()   );
        transactionNoteSlip.setRequisitionGroupCategory(   transactionNoteSlipDetails.getRequisitionGroupCategory()   );
        transactionNoteSlip.setRequisitionGroupNo(    transactionNoteSlipDetails.getRequisitionGroupNo()   );
        transactionNoteSlip.setReturnPartItemId(   transactionNoteSlipDetails.getReturnPartItemId()  );
        transactionNoteSlip.setReturnPartStage(   transactionNoteSlipDetails.getReturnPartStage()   );
        transactionNoteSlip.setReturnPartStageNo(    transactionNoteSlipDetails.getReturnPartStageNo()   );
        transactionNoteSlip.setRpSfp(    transactionNoteSlipDetails.isRpSfp()   );
        transactionNoteSlip.setNoteSlipShift(   transactionNoteSlipDetails.getNoteSlipShift()   );
        transactionNoteSlip.setStockNos(    transactionNoteSlipDetails.getStockNos()   );
        transactionNoteSlip.setStockWt(    transactionNoteSlipDetails.getStockWt()   );
        transactionNoteSlip.setTakenNos(    transactionNoteSlipDetails.getTakenNos()   );
        transactionNoteSlip.setTakenWt(    transactionNoteSlipDetails.getTakenWt()   );
        transactionNoteSlip.setToStock(    transactionNoteSlipDetails.isToStock()   );
        transactionNoteSlip.setTransactionCategory(   transactionNoteSlipDetails.getTransactionCategory()   );
        transactionNoteSlip.setUnitWtGms(   transactionNoteSlipDetails.getUnitWtGms()   );
        transactionNoteSlip.setVerified(    transactionNoteSlipDetails.isVerified()   );
        transactionNoteSlip.setWtMcAverage2Gms(  transactionNoteSlipDetails.getWtMcAverage2Gms()   );
        transactionNoteSlip.setWtMcAverage1Gms(    transactionNoteSlipDetails.getWtMcAverage1Gms()   );
        
        
        TransactionNoteSlip updatedTransactionNoteSlip = transactionNoteSlipRepository.save(transactionNoteSlip);
        return updatedTransactionNoteSlip;
    }
}
