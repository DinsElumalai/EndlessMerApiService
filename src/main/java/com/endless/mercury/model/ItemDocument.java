package com.endless.mercury.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
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
	@Column(length=100)
	private long itemDocumentId;
	@Column(length=100)
	private String createdClient;
	@Column(length=100)
	private String createdBy;
	@Column(length=100)
	@CreationTimestamp
	private LocalDateTime createdDate;
	@Column(length=100)
	private String updatedBy;
	@Column(length=100)
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	@Column(length=100)
	private String	documentFor;
	@Column(length=100)
	private String	documentCategory;
	@Column(length=100)
	private String	documentPurpose;
	@Column(length=100)
	private String	documentType;
	@Column(length=100)
	private String	returnable;
	@Column(length=100)
	private String	conssiderOrder;
	@Column(length=100)
	private String	multipleOrder;
	@Column(length=100)
	private String	requistionType;
	@Column(length=100)
	private String	requisitionNo;
	@Column(length=100)
	private String	stockConsidered;
	@Column(length=100)
	private String	vendorFromTo;
	@Column(length=100)
	private String	deliveryFromTo;
	@Column(length=100)
	private String	prefixSpecial;
	@Column(length=100)
	private String	noofExtraCopy;
	@Column(length=100)
	private String	documentOurCode;
	@Column(length=100)
	private String	documentDate;
	@Column(length=100)
	private String	documentTime;
	@Column(length=100)
	private String	removalDate;
	@Column(length=100)
	private String	removalTime;
	@Column(length=100)
	private String	entranceRegisterId;
	@Column(length=100)
	private String	vehicleNo;
	@Column(length=100)
	private String	convertedDocument;
	@Column(length=100)
	private String	convertedItemDocumentId;
	@Column(length=100)
	private String	stockCalcMethod;
	@Column(length=100)
	private String	itemOrderId;
	@Column(length=100)
	private String	itemId;
	@Column(length=100)
	private String	processStageNo;
	@Column(length=100)
	private String	vendorItemNumber;
	@Column(length=100)
	private String	vendorItemName;
	@Column(length=100)
	private String	uom;
	@Column(length=100)
	private String	unitPricePerUOM;
	@Column(length=100)
	private String	itemOrderScheduleId;
	@Column(length=100)
	private String	jobworkReductionPercentage;
	@Column(length=100)
	private String	qtyinNos;
	@Column(length=100)
	private String	qtyinKgs;
	@Column(length=100)
	private String	documentQtyinNos;
	@Column(length=100)
	private String	documentQtyinKgs;
	@Column(length=100)
	private String	assessableValue;
	@Column(length=100)
	private String	sgst;
	@Column(length=100)
	private String	cgst;
	@Column(length=100)
	private String	igst;
	@Column(length=100)
	private String	totalValue;
	@Column(length=100)
	private String	packaging;
	@Column(length=100)
	private String	noofPackaging;
	@Column(length=100)
	private String	hsnsaCode;
	@Column(length=100)
	private String	hsnsaDescription;
	@Column(length=100)
	private String	hsnsaRatePercentage;
	@Column(length=100)
	private String	hsnsaId;
	@Column(length=100)
	private String	hsnsaRateEffectiveFrom;
	@Column(length=100)
	private String	orderItemWeightinGms;
	@Column(length=100)
	private String	vendorItemWeightinGms;
	@Column(length=100)
	private String	finishedItemWeightinGms;
	@Column(length=100)
	private String	consumeItemWeightinGms;
	@Column(length=100)
	private String	freightCalcType;
	@Column(length=100)
	private String	freightRate;
	@Column(length=100)
	private String	freightRateType;
	@Column(length=100)
	private String	freightValue;
	@Column(length=100)
	private String	packagingCalcType;
	@Column(length=100)
	private String	packagingRate;
	@Column(length=100)
	private String	packagingRateType;
	@Column(length=100)
	private String	packagingValue;
	@Column(length=100)
	private String	pfCalcType;
	@Column(length=100)
	private String	pfRate;
	@Column(length=100)
	private String	pfRateType;
	@Column(length=100)
	private String	pfValue;
	@Column(length=100)
	private String	tcsPercentage;
	@Column(length=100)
	private String	tcsValue;


	public ItemDocument() {}


	public ItemDocument(long itemDocumentId, String createdClient, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate, String documentFor, String documentCategory,
			String documentPurpose, String documentType, String returnable, String conssiderOrder, String multipleOrder,
			String requistionType, String requisitionNo, String stockConsidered, String vendorFromTo,
			String deliveryFromTo, String prefixSpecial, String noofExtraCopy, String documentOurCode,
			String documentDate, String documentTime, String removalDate, String removalTime, String entranceRegisterId,
			String vehicleNo, String convertedDocument, String convertedItemDocumentId, String stockCalcMethod,
			String itemOrderId, String itemId, String processStageNo, String vendorItemNumber, String vendorItemName,
			String uom, String unitPricePerUOM, String itemOrderScheduleId, String jobworkReductionPercentage,
			String qtyinNos, String qtyinKgs, String documentQtyinNos, String documentQtyinKgs, String assessableValue,
			String sgst, String cgst, String igst, String totalValue, String packaging, String noofPackaging,
			String hsnsaCode, String hsnsaDescription, String hsnsaRatePercentage, String hsnsaID,
			String hsnsaRateEffectiveFrom, String orderItemWeightinGms, String vendorItemWeightinGms,
			String finishedItemWeightinGms, String consumeItemWeightinGms, String freightCalcType, String freightRate,
			String freightRateType, String freightValue, String packagingCalcType, String packagingRate,
			String packagingRateType, String packagingValue, String pfCalcType, String pfRate, String pfRateType,
			String pfValue, String tcsPercentage, String tcsValue) {
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
		this.conssiderOrder = conssiderOrder;
		this.multipleOrder = multipleOrder;
		this.requistionType = requistionType;
		this.requisitionNo = requisitionNo;
		this.stockConsidered = stockConsidered;
		this.vendorFromTo = vendorFromTo;
		this.deliveryFromTo = deliveryFromTo;
		this.prefixSpecial = prefixSpecial;
		this.noofExtraCopy = noofExtraCopy;
		this.documentOurCode = documentOurCode;
		this.documentDate = documentDate;
		this.documentTime = documentTime;
		this.removalDate = removalDate;
		this.removalTime = removalTime;
		this.entranceRegisterId = entranceRegisterId;
		this.vehicleNo = vehicleNo;
		this.convertedDocument = convertedDocument;
		this.convertedItemDocumentId = convertedItemDocumentId;
		this.stockCalcMethod = stockCalcMethod;
		this.itemOrderId = itemOrderId;
		this.itemId = itemId;
		this.processStageNo = processStageNo;
		this.vendorItemNumber = vendorItemNumber;
		this.vendorItemName = vendorItemName;
		this.uom = uom;
		this.unitPricePerUOM = unitPricePerUOM;
		this.itemOrderScheduleId = itemOrderScheduleId;
		this.jobworkReductionPercentage = jobworkReductionPercentage;
		this.qtyinNos = qtyinNos;
		this.qtyinKgs = qtyinKgs;
		this.documentQtyinNos = documentQtyinNos;
		this.documentQtyinKgs = documentQtyinKgs;
		this.assessableValue = assessableValue;
		this.sgst = sgst;
		this.cgst = cgst;
		this.igst = igst;
		this.totalValue = totalValue;
		this.packaging = packaging;
		this.noofPackaging = noofPackaging;
		this.hsnsaCode = hsnsaCode;
		this.hsnsaDescription = hsnsaDescription;
		this.hsnsaRatePercentage = hsnsaRatePercentage;
		this.hsnsaId = hsnsaID;
		this.hsnsaRateEffectiveFrom = hsnsaRateEffectiveFrom;
		this.orderItemWeightinGms = orderItemWeightinGms;
		this.vendorItemWeightinGms = vendorItemWeightinGms;
		this.finishedItemWeightinGms = finishedItemWeightinGms;
		this.consumeItemWeightinGms = consumeItemWeightinGms;
		this.freightCalcType = freightCalcType;
		this.freightRate = freightRate;
		this.freightRateType = freightRateType;
		this.freightValue = freightValue;
		this.packagingCalcType = packagingCalcType;
		this.packagingRate = packagingRate;
		this.packagingRateType = packagingRateType;
		this.packagingValue = packagingValue;
		this.pfCalcType = pfCalcType;
		this.pfRate = pfRate;
		this.pfRateType = pfRateType;
		this.pfValue = pfValue;
		this.tcsPercentage = tcsPercentage;
		this.tcsValue = tcsValue;
	}


	@Override
	public String toString() {
		return "ItemDocument [itemDocumentId=" + itemDocumentId + ", createdClient=" + createdClient + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + ", documentFor=" + documentFor + ", documentCategory=" + documentCategory
				+ ", documentPurpose=" + documentPurpose + ", documentType=" + documentType + ", returnable="
				+ returnable + ", conssiderOrder=" + conssiderOrder + ", multipleOrder=" + multipleOrder
				+ ", requistionType=" + requistionType + ", requisitionNo=" + requisitionNo + ", stockConsidered="
				+ stockConsidered + ", vendorFromTo=" + vendorFromTo + ", deliveryFromTo=" + deliveryFromTo
				+ ", prefixSpecial=" + prefixSpecial + ", noofExtraCopy=" + noofExtraCopy + ", documentOurCode="
				+ documentOurCode + ", documentDate=" + documentDate + ", documentTime=" + documentTime
				+ ", removalDate=" + removalDate + ", removalTime=" + removalTime + ", entranceRegisterId="
				+ entranceRegisterId + ", vehicleNo=" + vehicleNo + ", convertedDocument=" + convertedDocument
				+ ", convertedItemDocumentId=" + convertedItemDocumentId + ", stockCalcMethod=" + stockCalcMethod
				+ ", itemOrderId=" + itemOrderId + ", itemId=" + itemId + ", processStageNo=" + processStageNo
				+ ", vendorItemNumber=" + vendorItemNumber + ", vendorItemName=" + vendorItemName + ", uom=" + uom
				+ ", unitPricePerUOM=" + unitPricePerUOM + ", itemOrderScheduleId=" + itemOrderScheduleId
				+ ", jobworkReductionPercentage=" + jobworkReductionPercentage + ", qtyinNos=" + qtyinNos
				+ ", qtyinKgs=" + qtyinKgs + ", documentQtyinNos=" + documentQtyinNos + ", documentQtyinKgs="
				+ documentQtyinKgs + ", assessableValue=" + assessableValue + ", sgst=" + sgst + ", cgst=" + cgst
				+ ", igst=" + igst + ", totalValue=" + totalValue + ", packaging=" + packaging + ", noofPackaging="
				+ noofPackaging + ", hsnsaCode=" + hsnsaCode + ", hsnsaDescription=" + hsnsaDescription
				+ ", hsnsaRatePercentage=" + hsnsaRatePercentage + ", hsnsaID=" + hsnsaId + ", hsnsaRateEffectiveFrom="
				+ hsnsaRateEffectiveFrom + ", orderItemWeightinGms=" + orderItemWeightinGms + ", vendorItemWeightinGms="
				+ vendorItemWeightinGms + ", finishedItemWeightinGms=" + finishedItemWeightinGms
				+ ", consumeItemWeightinGms=" + consumeItemWeightinGms + ", freightCalcType=" + freightCalcType
				+ ", freightRate=" + freightRate + ", freightRateType=" + freightRateType + ", freightValue="
				+ freightValue + ", packagingCalcType=" + packagingCalcType + ", packagingRate=" + packagingRate
				+ ", packagingRateType=" + packagingRateType + ", packagingValue=" + packagingValue + ", pfCalcType="
				+ pfCalcType + ", pfRate=" + pfRate + ", pfRateType=" + pfRateType + ", pfValue=" + pfValue
				+ ", tcsPercentage=" + tcsPercentage + ", tcsValue=" + tcsValue + "]";
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


	public String getConssiderOrder() {
		return conssiderOrder;
	}


	public void setConssiderOrder(String conssiderOrder) {
		this.conssiderOrder = conssiderOrder;
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


	public String getVendorFromTo() {
		return vendorFromTo;
	}


	public void setVendorFromTo(String vendorFromTo) {
		this.vendorFromTo = vendorFromTo;
	}


	public String getDeliveryFromTo() {
		return deliveryFromTo;
	}


	public void setDeliveryFromTo(String deliveryFromTo) {
		this.deliveryFromTo = deliveryFromTo;
	}


	public String getPrefixSpecial() {
		return prefixSpecial;
	}


	public void setPrefixSpecial(String prefixSpecial) {
		this.prefixSpecial = prefixSpecial;
	}


	public String getNoofExtraCopy() {
		return noofExtraCopy;
	}


	public void setNoofExtraCopy(String noofExtraCopy) {
		this.noofExtraCopy = noofExtraCopy;
	}


	public String getDocumentOurCode() {
		return documentOurCode;
	}


	public void setDocumentOurCode(String documentOurCode) {
		this.documentOurCode = documentOurCode;
	}


	public String getDocumentDate() {
		return documentDate;
	}


	public void setDocumentDate(String documentDate) {
		this.documentDate = documentDate;
	}


	public String getDocumentTime() {
		return documentTime;
	}


	public void setDocumentTime(String documentTime) {
		this.documentTime = documentTime;
	}


	public String getRemovalDate() {
		return removalDate;
	}


	public void setRemovalDate(String removalDate) {
		this.removalDate = removalDate;
	}


	public String getRemovalTime() {
		return removalTime;
	}


	public void setRemovalTime(String removalTime) {
		this.removalTime = removalTime;
	}


	public String getEntranceRegisterId() {
		return entranceRegisterId;
	}


	public void setEntranceRegisterId(String entranceRegisterId) {
		this.entranceRegisterId = entranceRegisterId;
	}


	public String getVehicleNo() {
		return vehicleNo;
	}


	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
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


	public String getItemOrderId() {
		return itemOrderId;
	}


	public void setItemOrderId(String itemOrderId) {
		this.itemOrderId = itemOrderId;
	}


	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
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


	public String getUnitPricePerUOM() {
		return unitPricePerUOM;
	}


	public void setUnitPricePerUOM(String unitPricePerUOM) {
		this.unitPricePerUOM = unitPricePerUOM;
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


	public String getQtyinNos() {
		return qtyinNos;
	}


	public void setQtyinNos(String qtyinNos) {
		this.qtyinNos = qtyinNos;
	}


	public String getQtyinKgs() {
		return qtyinKgs;
	}


	public void setQtyinKgs(String qtyinKgs) {
		this.qtyinKgs = qtyinKgs;
	}


	public String getDocumentQtyinNos() {
		return documentQtyinNos;
	}


	public void setDocumentQtyinNos(String documentQtyinNos) {
		this.documentQtyinNos = documentQtyinNos;
	}


	public String getDocumentQtyinKgs() {
		return documentQtyinKgs;
	}


	public void setDocumentQtyinKgs(String documentQtyinKgs) {
		this.documentQtyinKgs = documentQtyinKgs;
	}


	public String getAssessableValue() {
		return assessableValue;
	}


	public void setAssessableValue(String assessableValue) {
		this.assessableValue = assessableValue;
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


	public String getTotalValue() {
		return totalValue;
	}


	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}


	public String getPackaging() {
		return packaging;
	}


	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}


	public String getNoofPackaging() {
		return noofPackaging;
	}


	public void setNoofPackaging(String noofPackaging) {
		this.noofPackaging = noofPackaging;
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


	public String getHsnsaID() {
		return hsnsaId;
	}


	public void setHsnsaID(String hsnsaID) {
		this.hsnsaId = hsnsaID;
	}


	public String getHsnsaRateEffectiveFrom() {
		return hsnsaRateEffectiveFrom;
	}


	public void setHsnsaRateEffectiveFrom(String hsnsaRateEffectiveFrom) {
		this.hsnsaRateEffectiveFrom = hsnsaRateEffectiveFrom;
	}


	public String getOrderItemWeightinGms() {
		return orderItemWeightinGms;
	}


	public void setOrderItemWeightinGms(String orderItemWeightinGms) {
		this.orderItemWeightinGms = orderItemWeightinGms;
	}


	public String getVendorItemWeightinGms() {
		return vendorItemWeightinGms;
	}


	public void setVendorItemWeightinGms(String vendorItemWeightinGms) {
		this.vendorItemWeightinGms = vendorItemWeightinGms;
	}


	public String getFinishedItemWeightinGms() {
		return finishedItemWeightinGms;
	}


	public void setFinishedItemWeightinGms(String finishedItemWeightinGms) {
		this.finishedItemWeightinGms = finishedItemWeightinGms;
	}


	public String getConsumeItemWeightinGms() {
		return consumeItemWeightinGms;
	}


	public void setConsumeItemWeightinGms(String consumeItemWeightinGms) {
		this.consumeItemWeightinGms = consumeItemWeightinGms;
	}


	public String getFreightCalcType() {
		return freightCalcType;
	}


	public void setFreightCalcType(String freightCalcType) {
		this.freightCalcType = freightCalcType;
	}


	public String getFreightRate() {
		return freightRate;
	}


	public void setFreightRate(String freightRate) {
		this.freightRate = freightRate;
	}


	public String getFreightRateType() {
		return freightRateType;
	}


	public void setFreightRateType(String freightRateType) {
		this.freightRateType = freightRateType;
	}


	public String getFreightValue() {
		return freightValue;
	}


	public void setFreightValue(String freightValue) {
		this.freightValue = freightValue;
	}


	public String getPackagingCalcType() {
		return packagingCalcType;
	}


	public void setPackagingCalcType(String packagingCalcType) {
		this.packagingCalcType = packagingCalcType;
	}


	public String getPackagingRate() {
		return packagingRate;
	}


	public void setPackagingRate(String packagingRate) {
		this.packagingRate = packagingRate;
	}


	public String getPackagingRateType() {
		return packagingRateType;
	}


	public void setPackagingRateType(String packagingRateType) {
		this.packagingRateType = packagingRateType;
	}


	public String getPackagingValue() {
		return packagingValue;
	}


	public void setPackagingValue(String packagingValue) {
		this.packagingValue = packagingValue;
	}


	public String getPfCalcType() {
		return pfCalcType;
	}


	public void setPfCalcType(String pfCalcType) {
		this.pfCalcType = pfCalcType;
	}


	public String getPfRate() {
		return pfRate;
	}


	public void setPfRate(String pfRate) {
		this.pfRate = pfRate;
	}


	public String getPfRateType() {
		return pfRateType;
	}


	public void setPfRateType(String pfRateType) {
		this.pfRateType = pfRateType;
	}


	public String getPfValue() {
		return pfValue;
	}


	public void setPfValue(String pfValue) {
		this.pfValue = pfValue;
	}


	public String getTcsPercentage() {
		return tcsPercentage;
	}


	public void setTcsPercentage(String tcsPercentage) {
		this.tcsPercentage = tcsPercentage;
	}


	public String getTcsValue() {
		return tcsValue;
	}


	public void setTcsValue(String tcsValue) {
		this.tcsValue = tcsValue;
	}

	
}
