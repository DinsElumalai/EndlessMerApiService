package com.endless.mercury.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "mry_txn_item_document")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class ItemDocument implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemDocumentId;
	private String createdClient;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String updatedBy;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	private String documentFor;
	private String documentCategory;
	private String documentPurpose;
	private String documentType;
    private String returnable;
    private String considerOrder;
    private String multipleOrder;
    private String requistionType;
    private String requisitionNo;
    private String stockConsidered;
    private String vendorId;
    private String deliveryVendorId;
    private String prefixSpecial;
    private String noOfExtracopy;
    private String documentOurCode;
    private LocalDate documentDate;
    private LocalDate documentTime;
    private LocalDate removalDate;
    private LocalDate removalTime;
    private String entranceRegisterId;
    private String vehicleNO;
    private String convertedDocument;
    private String convertedItemDocumentId;
    private String stockCalcMethod;
    private String itemId;
    private String itemOrderId;
    private String processStageNo;
    private String vendorItemNumber;
    private String vendorItemName;
    private String uom;
    private String unitPrizePerUom;
    private String itemOrderScheduleId;
    private String jobworkReductionPercentage;
    private String qtyInNos;
    private String qtyInKgs;
    private String documetQtyInNos;
    private String documentQtyInKgs;
    private String amount;
    private String sgst;
    private String cgst;
    private String igst;
    private String packaging;
    private String noOfPackaging;
    private String convertedQtyInNos;
    private String convertedQtyInKgs;
    private String hsnsaCode;
    private String hsnsaDescription;
    private String hsnsaRatePercentage;
    private String hsnsaId;
    private LocalDate hsnsaRateEffectiveFrom;
    private String orderItemWeightInGms;
    private String vendorItemWeightInGms;
    private String finishedItemWeightInGms;
    private String consumeItemWeightInGms;
    
    public ItemDocument() {}

	public ItemDocument(long itemDocumentId, String createdClient, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate, String documentFor, String documentCategory,
			String documentPurpose, String documentType, String returnable, String considerOrder, String multipleOrder,
			String requistionType, String requisitionNo, String stockConsidered, String vendorId,
			String deliveryVendorId, String prefixSpecial, String noOfExtracopy, String documentOurCode,
			LocalDate documentDate, LocalDate documentTime, LocalDate removalDate, LocalDate removalTime,
			String entranceRegisterId, String vehicleNO, String convertedDocument, String convertedItemDocumentId,
			String stockCalcMethod, String itemId, String itemOrderId, String processStageNo, String vendorItemNumber,
			String vendorItemName, String uom, String unitPrizePerUom, String itemOrderScheduleId,
			String jobworkReductionPercentage, String qtyInNos, String qtyInKgs, String documetQtyInNos,
			String documentQtyInKgs, String amount, String sgst, String cgst, String igst, String packaging,
			String noOfPackaging, String convertedQtyInNos, String convertedQtyInKgs, String hsnsaCode,
			String hsnsaDescription, String hsnsaRatePercentage, String hsnsaId, LocalDate hsnsaRateEffectiveFrom,
			String orderItemWeightInGms, String vendorItemWeightInGms, String finishedItemWeightInGms,
			String consumeItemWeightInGms) {
		super();
		this.itemDocumentId = itemDocumentId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.documentFor = documentFor;
		this.documentCategory = documentCategory;
		this.documentPurpose = documentPurpose;
		this.documentType = documentType;
		this.returnable = returnable;
		this.considerOrder = considerOrder;
		this.multipleOrder = multipleOrder;
		this.requistionType = requistionType;
		this.requisitionNo = requisitionNo;
		this.stockConsidered = stockConsidered;
		this.vendorId = vendorId;
		this.deliveryVendorId = deliveryVendorId;
		this.prefixSpecial = prefixSpecial;
		this.noOfExtracopy = noOfExtracopy;
		this.documentOurCode = documentOurCode;
		this.documentDate = documentDate;
		this.documentTime = documentTime;
		this.removalDate = removalDate;
		this.removalTime = removalTime;
		this.entranceRegisterId = entranceRegisterId;
		this.vehicleNO = vehicleNO;
		this.convertedDocument = convertedDocument;
		this.convertedItemDocumentId = convertedItemDocumentId;
		this.stockCalcMethod = stockCalcMethod;
		this.itemId = itemId;
		this.itemOrderId = itemOrderId;
		this.processStageNo = processStageNo;
		this.vendorItemNumber = vendorItemNumber;
		this.vendorItemName = vendorItemName;
		this.uom = uom;
		this.unitPrizePerUom = unitPrizePerUom;
		this.itemOrderScheduleId = itemOrderScheduleId;
		this.jobworkReductionPercentage = jobworkReductionPercentage;
		this.qtyInNos = qtyInNos;
		this.qtyInKgs = qtyInKgs;
		this.documetQtyInNos = documetQtyInNos;
		this.documentQtyInKgs = documentQtyInKgs;
		this.amount = amount;
		this.sgst = sgst;
		this.cgst = cgst;
		this.igst = igst;
		this.packaging = packaging;
		this.noOfPackaging = noOfPackaging;
		this.convertedQtyInNos = convertedQtyInNos;
		this.convertedQtyInKgs = convertedQtyInKgs;
		this.hsnsaCode = hsnsaCode;
		this.hsnsaDescription = hsnsaDescription;
		this.hsnsaRatePercentage = hsnsaRatePercentage;
		this.hsnsaId = hsnsaId;
		this.hsnsaRateEffectiveFrom = hsnsaRateEffectiveFrom;
		this.orderItemWeightInGms = orderItemWeightInGms;
		this.vendorItemWeightInGms = vendorItemWeightInGms;
		this.finishedItemWeightInGms = finishedItemWeightInGms;
		this.consumeItemWeightInGms = consumeItemWeightInGms;
	}

	@Override
	public String toString() {
		return "ItemDocument [itemDocumentId=" + itemDocumentId + ", createdClient=" + createdClient + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + ", documentFor=" + documentFor + ", documentCategory=" + documentCategory
				+ ", documentPurpose=" + documentPurpose + ", documentType=" + documentType + ", returnable="
				+ returnable + ", considerOrder=" + considerOrder + ", multipleOrder=" + multipleOrder
				+ ", requistionType=" + requistionType + ", requisitionNo=" + requisitionNo + ", stockConsidered="
				+ stockConsidered + ", vendorId=" + vendorId + ", deliveryVendorId=" + deliveryVendorId
				+ ", prefixSpecial=" + prefixSpecial + ", noOfExtracopy=" + noOfExtracopy + ", documentOurCode="
				+ documentOurCode + ", documentDate=" + documentDate + ", documentTime=" + documentTime
				+ ", removalDate=" + removalDate + ", removalTime=" + removalTime + ", entranceRegisterId="
				+ entranceRegisterId + ", vehicleNO=" + vehicleNO + ", convertedDocument=" + convertedDocument
				+ ", convertedItemDocumentId=" + convertedItemDocumentId + ", stockCalcMethod=" + stockCalcMethod
				+ ", itemId=" + itemId + ", itemOrderId=" + itemOrderId + ", processStageNo=" + processStageNo
				+ ", vendorItemNumber=" + vendorItemNumber + ", vendorItemName=" + vendorItemName + ", uom=" + uom
				+ ", unitPrizePerUom=" + unitPrizePerUom + ", itemOrderScheduleId=" + itemOrderScheduleId
				+ ", jobworkReductionPercentage=" + jobworkReductionPercentage + ", qtyInNos=" + qtyInNos
				+ ", qtyInKgs=" + qtyInKgs + ", documetQtyInNos=" + documetQtyInNos + ", documentQtyInKgs="
				+ documentQtyInKgs + ", amount=" + amount + ", sgst=" + sgst + ", cgst=" + cgst + ", igst=" + igst
				+ ", packaging=" + packaging + ", noOfPackaging=" + noOfPackaging + ", convertedQtyInNos="
				+ convertedQtyInNos + ", convertedQtyInKgs=" + convertedQtyInKgs + ", hsnsaCode=" + hsnsaCode
				+ ", hsnsaDescription=" + hsnsaDescription + ", hsnsaRatePercentage=" + hsnsaRatePercentage
				+ ", hsnsaId=" + hsnsaId + ", hsnsaRateEffectiveFrom=" + hsnsaRateEffectiveFrom
				+ ", orderItemWeightInGms=" + orderItemWeightInGms + ", vendorItemWeightInGms=" + vendorItemWeightInGms
				+ ", finishedItemWeightInGms=" + finishedItemWeightInGms + ", consumeItemWeightInGms="
				+ consumeItemWeightInGms + "]";
	}

	public long getItemDocumentId() {
		return itemDocumentId;
	}

	public void setItemDocumentId(long itemDocumentId) {
		this.itemDocumentId = itemDocumentId;
	}

	public String getCreatedClient() {
		return createdClient;
	}

	public void setCreatedClient(String createdClient) {
		this.createdClient = createdClient;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getDocumentFor() {
		return documentFor;
	}

	public void setDocumentFor(String documentFor) {
		this.documentFor = documentFor;
	}

	public String getDocumentCategory() {
		return documentCategory;
	}

	public void setDocumentCategory(String documentCategory) {
		this.documentCategory = documentCategory;
	}

	public String getDocumentPurpose() {
		return documentPurpose;
	}

	public void setDocumentPurpose(String documentPurpose) {
		this.documentPurpose = documentPurpose;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getReturnable() {
		return returnable;
	}

	public void setReturnable(String returnable) {
		this.returnable = returnable;
	}

	public String getConsiderOrder() {
		return considerOrder;
	}

	public void setConsiderOrder(String considerOrder) {
		this.considerOrder = considerOrder;
	}

	public String getMultipleOrder() {
		return multipleOrder;
	}

	public void setMultipleOrder(String multipleOrder) {
		this.multipleOrder = multipleOrder;
	}

	public String getRequistionType() {
		return requistionType;
	}

	public void setRequistionType(String requistionType) {
		this.requistionType = requistionType;
	}

	public String getRequisitionNo() {
		return requisitionNo;
	}

	public void setRequisitionNo(String requisitionNo) {
		this.requisitionNo = requisitionNo;
	}

	public String getStockConsidered() {
		return stockConsidered;
	}

	public void setStockConsidered(String stockConsidered) {
		this.stockConsidered = stockConsidered;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getDeliveryVendorId() {
		return deliveryVendorId;
	}

	public void setDeliveryVendorId(String deliveryVendorId) {
		this.deliveryVendorId = deliveryVendorId;
	}

	public String getPrefixSpecial() {
		return prefixSpecial;
	}

	public void setPrefixSpecial(String prefixSpecial) {
		this.prefixSpecial = prefixSpecial;
	}

	public String getNoOfExtracopy() {
		return noOfExtracopy;
	}

	public void setNoOfExtracopy(String noOfExtracopy) {
		this.noOfExtracopy = noOfExtracopy;
	}

	public String getDocumentOurCode() {
		return documentOurCode;
	}

	public void setDocumentOurCode(String documentOurCode) {
		this.documentOurCode = documentOurCode;
	}

	public LocalDate getDocumentDate() {
		return documentDate;
	}

	public void setDocumentDate(LocalDate documentDate) {
		this.documentDate = documentDate;
	}

	public LocalDate getDocumentTime() {
		return documentTime;
	}

	public void setDocumentTime(LocalDate documentTime) {
		this.documentTime = documentTime;
	}

	public LocalDate getRemovalDate() {
		return removalDate;
	}

	public void setRemovalDate(LocalDate removalDate) {
		this.removalDate = removalDate;
	}

	public LocalDate getRemovalTime() {
		return removalTime;
	}

	public void setRemovalTime(LocalDate removalTime) {
		this.removalTime = removalTime;
	}

	public String getEntranceRegisterId() {
		return entranceRegisterId;
	}

	public void setEntranceRegisterId(String entranceRegisterId) {
		this.entranceRegisterId = entranceRegisterId;
	}

	public String getVehicleNO() {
		return vehicleNO;
	}

	public void setVehicleNO(String vehicleNO) {
		this.vehicleNO = vehicleNO;
	}

	public String getConvertedDocument() {
		return convertedDocument;
	}

	public void setConvertedDocument(String convertedDocument) {
		this.convertedDocument = convertedDocument;
	}

	public String getConvertedItemDocumentId() {
		return convertedItemDocumentId;
	}

	public void setConvertedItemDocumentId(String convertedItemDocumentId) {
		this.convertedItemDocumentId = convertedItemDocumentId;
	}

	public String getStockCalcMethod() {
		return stockCalcMethod;
	}

	public void setStockCalcMethod(String stockCalcMethod) {
		this.stockCalcMethod = stockCalcMethod;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemOrderId() {
		return itemOrderId;
	}

	public void setItemOrderId(String itemOrderId) {
		this.itemOrderId = itemOrderId;
	}

	public String getProcessStageNo() {
		return processStageNo;
	}

	public void setProcessStageNo(String processStageNo) {
		this.processStageNo = processStageNo;
	}

	public String getVendorItemNumber() {
		return vendorItemNumber;
	}

	public void setVendorItemNumber(String vendorItemNumber) {
		this.vendorItemNumber = vendorItemNumber;
	}

	public String getVendorItemName() {
		return vendorItemName;
	}

	public void setVendorItemName(String vendorItemName) {
		this.vendorItemName = vendorItemName;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getUnitPrizePerUom() {
		return unitPrizePerUom;
	}

	public void setUnitPrizePerUom(String unitPrizePerUom) {
		this.unitPrizePerUom = unitPrizePerUom;
	}

	public String getItemOrderScheduleId() {
		return itemOrderScheduleId;
	}

	public void setItemOrderScheduleId(String itemOrderScheduleId) {
		this.itemOrderScheduleId = itemOrderScheduleId;
	}

	public String getJobworkReductionPercentage() {
		return jobworkReductionPercentage;
	}

	public void setJobworkReductionPercentage(String jobworkReductionPercentage) {
		this.jobworkReductionPercentage = jobworkReductionPercentage;
	}

	public String getQtyInNos() {
		return qtyInNos;
	}

	public void setQtyInNos(String qtyInNos) {
		this.qtyInNos = qtyInNos;
	}

	public String getQtyInKgs() {
		return qtyInKgs;
	}

	public void setQtyInKgs(String qtyInKgs) {
		this.qtyInKgs = qtyInKgs;
	}

	public String getDocumetQtyInNos() {
		return documetQtyInNos;
	}

	public void setDocumetQtyInNos(String documetQtyInNos) {
		this.documetQtyInNos = documetQtyInNos;
	}

	public String getDocumentQtyInKgs() {
		return documentQtyInKgs;
	}

	public void setDocumentQtyInKgs(String documentQtyInKgs) {
		this.documentQtyInKgs = documentQtyInKgs;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getSgst() {
		return sgst;
	}

	public void setSgst(String sgst) {
		this.sgst = sgst;
	}

	public String getCgst() {
		return cgst;
	}

	public void setCgst(String cgst) {
		this.cgst = cgst;
	}

	public String getIgst() {
		return igst;
	}

	public void setIgst(String igst) {
		this.igst = igst;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getNoOfPackaging() {
		return noOfPackaging;
	}

	public void setNoOfPackaging(String noOfPackaging) {
		this.noOfPackaging = noOfPackaging;
	}

	public String getConvertedQtyInNos() {
		return convertedQtyInNos;
	}

	public void setConvertedQtyInNos(String convertedQtyInNos) {
		this.convertedQtyInNos = convertedQtyInNos;
	}

	public String getConvertedQtyInKgs() {
		return convertedQtyInKgs;
	}

	public void setConvertedQtyInKgs(String convertedQtyInKgs) {
		this.convertedQtyInKgs = convertedQtyInKgs;
	}

	public String getHsnsaCode() {
		return hsnsaCode;
	}

	public void setHsnsaCode(String hsnsaCode) {
		this.hsnsaCode = hsnsaCode;
	}

	public String getHsnsaDescription() {
		return hsnsaDescription;
	}

	public void setHsnsaDescription(String hsnsaDescription) {
		this.hsnsaDescription = hsnsaDescription;
	}

	public String getHsnsaRatePercentage() {
		return hsnsaRatePercentage;
	}

	public void setHsnsaRatePercentage(String hsnsaRatePercentage) {
		this.hsnsaRatePercentage = hsnsaRatePercentage;
	}

	public String getHsnsaId() {
		return hsnsaId;
	}

	public void setHsnsaId(String hsnsaId) {
		this.hsnsaId = hsnsaId;
	}

	public LocalDate getHsnsaRateEffectiveFrom() {
		return hsnsaRateEffectiveFrom;
	}

	public void setHsnsaRateEffectiveFrom(LocalDate hsnsaRateEffectiveFrom) {
		this.hsnsaRateEffectiveFrom = hsnsaRateEffectiveFrom;
	}

	public String getOrderItemWeightInGms() {
		return orderItemWeightInGms;
	}

	public void setOrderItemWeightInGms(String orderItemWeightInGms) {
		this.orderItemWeightInGms = orderItemWeightInGms;
	}

	public String getVendorItemWeightInGms() {
		return vendorItemWeightInGms;
	}

	public void setVendorItemWeightInGms(String vendorItemWeightInGms) {
		this.vendorItemWeightInGms = vendorItemWeightInGms;
	}

	public String getFinishedItemWeightInGms() {
		return finishedItemWeightInGms;
	}

	public void setFinishedItemWeightInGms(String finishedItemWeightInGms) {
		this.finishedItemWeightInGms = finishedItemWeightInGms;
	}

	public String getConsumeItemWeightInGms() {
		return consumeItemWeightInGms;
	}

	public void setConsumeItemWeightInGms(String consumeItemWeightInGms) {
		this.consumeItemWeightInGms = consumeItemWeightInGms;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    






	
	


}
