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
@Table(name = "mry_mst_item_order")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class ItemOrder implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemOrderId;
	private String createdClient;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String updatedBy;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	private String orderOurCode;
	private String orderFor;
	private String orderType;
	private String orderNo;
	private LocalDate orderDate;
	private LocalDate orderRptIssueDate;	
	private LocalDate orderEffectiveFromDate;
	private String multipleHsnRate;
	private String orderToVendorId;
	private String deliveryToVendorId;
	private String modeOfDispatch;
	private String deliveryTerms;
	private String paymentTerms;
	private String contactMail;
	private String contactNo;
	private String contactPerson;
	private String comments;
	private String specialInstruction;
	private String scheduleVariationPercentage;
	private String tcsPercentage;
	private String packagingCalcType;
	private String packagingRateType;
	private String packagingRate;
	private String freightCalcType;
	private String freightRateType;
	private String freightRate;
	private String pfCalcType;
	private String pfRateType;
	private String pfRate;
	private String itemTypeId;
	private String itemId;
	private String processStageNo;
	private String rcptVendorFlowId;
	private String vendorItemNumber;
	private String vendorItemName;
	private String vendorItemNameId;
	private String orderLineNo;
	private String orderNos;
	private String orderKgs;
	private String precisionNosDigit;
	private String precisionKgsDigit;
	private String uom;
	private String unitPriceUom;
	private String discountPrecentage;
	private String jobworkRedPercentage;
	private String hsnsaCodeId;
	private String hsnsaCode;
	private String hsnsaDescription;
	private String hsnsaRatePercentage;
	private LocalDate hsnsaRateEffectiveFrom;
	private String orderItemWtGms;
	private String vendorItemWtGms;
	private String finishedItemWtGms;
	private String consumeItemWtGms;
	private String orderItemApprovalStatus;
	private String orderItemStatus;

	public ItemOrder() {}

	public ItemOrder(long itemOrderId, String createdClient, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate, String orderOurCode, String orderFor, String orderType,
			String orderNo, LocalDate orderDate, LocalDate orderRptIssueDate, LocalDate orderEffectiveFromDate,
			String multipleHsnRate, String orderToVendorId, String deliveryToVendorId, String modeOfDispatch,
			String deliveryTerms, String paymentTerms, String contactMail, String contactNo, String contactPerson,
			String comments, String specialInstruction, String scheduleVariationPercentage, String tcsPercentage,
			String packagingCalcType, String packagingRateType, String packagingRate, String freightCalcType,
			String freightRateType, String freightRate, String pfCalcType, String pfRateType, String pfRate,
			String itemTypeId, String itemId, String processStageNo, String rcptVendorFlowId, String vendorItemNumber,
			String vendorItemName, String vendorItemNameId, String orderLineNo, String orderNos, String orderKgs,
			String precisionNosDigit, String precisionKgsDigit, String uom, String unitPriceUom,
			String discountPrecentage, String jobworkRedPercentage, String hsnsaCodeId, String hsnsaCode,
			String hsnsaDescription, String hsnsaRatePercentage, LocalDate hsnsaRateEffectiveFrom, String orderItemWtGms,
			String vendorItemWtGms, String finishedItemWtGms, String consumeItemWtGms, String orderItemApprovalStatus,
			String orderItemStatus) {
		super();
		this.itemOrderId = itemOrderId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.orderOurCode = orderOurCode;
		this.orderFor = orderFor;
		this.orderType = orderType;
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderRptIssueDate = orderRptIssueDate;
		this.orderEffectiveFromDate = orderEffectiveFromDate;
		this.multipleHsnRate = multipleHsnRate;
		this.orderToVendorId = orderToVendorId;
		this.deliveryToVendorId = deliveryToVendorId;
		this.modeOfDispatch = modeOfDispatch;
		this.deliveryTerms = deliveryTerms;
		this.paymentTerms = paymentTerms;
		this.contactMail = contactMail;
		this.contactNo = contactNo;
		this.contactPerson = contactPerson;
		this.comments = comments;
		this.specialInstruction = specialInstruction;
		this.scheduleVariationPercentage = scheduleVariationPercentage;
		this.tcsPercentage = tcsPercentage;
		this.packagingCalcType = packagingCalcType;
		this.packagingRateType = packagingRateType;
		this.packagingRate = packagingRate;
		this.freightCalcType = freightCalcType;
		this.freightRateType = freightRateType;
		this.freightRate = freightRate;
		this.pfCalcType = pfCalcType;
		this.pfRateType = pfRateType;
		this.pfRate = pfRate;
		this.itemTypeId = itemTypeId;
		this.itemId = itemId;
		this.processStageNo = processStageNo;
		this.rcptVendorFlowId = rcptVendorFlowId;
		this.vendorItemNumber = vendorItemNumber;
		this.vendorItemName = vendorItemName;
		this.vendorItemNameId = vendorItemNameId;
		this.orderLineNo = orderLineNo;
		this.orderNos = orderNos;
		this.orderKgs = orderKgs;
		this.precisionNosDigit = precisionNosDigit;
		this.precisionKgsDigit = precisionKgsDigit;
		this.uom = uom;
		this.unitPriceUom = unitPriceUom;
		this.discountPrecentage = discountPrecentage;
		this.jobworkRedPercentage = jobworkRedPercentage;
		this.hsnsaCodeId = hsnsaCodeId;
		this.hsnsaCode = hsnsaCode;
		this.hsnsaDescription = hsnsaDescription;
		this.hsnsaRatePercentage = hsnsaRatePercentage;
		this.hsnsaRateEffectiveFrom = hsnsaRateEffectiveFrom;
		this.orderItemWtGms = orderItemWtGms;
		this.vendorItemWtGms = vendorItemWtGms;
		this.finishedItemWtGms = finishedItemWtGms;
		this.consumeItemWtGms = consumeItemWtGms;
		this.orderItemApprovalStatus = orderItemApprovalStatus;
		this.orderItemStatus = orderItemStatus;
	}

	@Override
	public String toString() {
		return "ItemOrder [itemOrderId=" + itemOrderId + ", createdClient=" + createdClient + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", orderOurCode=" + orderOurCode + ", orderFor=" + orderFor + ", orderType=" + orderType
				+ ", orderNo=" + orderNo + ", orderDate=" + orderDate + ", orderRptIssueDate=" + orderRptIssueDate
				+ ", orderEffectiveFromDate=" + orderEffectiveFromDate + ", multipleHsnRate=" + multipleHsnRate
				+ ", orderToVendorId=" + orderToVendorId + ", deliveryToVendorId=" + deliveryToVendorId
				+ ", modeOfDispatch=" + modeOfDispatch + ", deliveryTerms=" + deliveryTerms + ", paymentTerms="
				+ paymentTerms + ", contactMail=" + contactMail + ", contactNo=" + contactNo + ", contactPerson="
				+ contactPerson + ", comments=" + comments + ", specialInstruction=" + specialInstruction
				+ ", scheduleVariationPercentage=" + scheduleVariationPercentage + ", tcsPercentage=" + tcsPercentage
				+ ", packagingCalcType=" + packagingCalcType + ", packagingRateType=" + packagingRateType
				+ ", packagingRate=" + packagingRate + ", freightCalcType=" + freightCalcType + ", freightRateType="
				+ freightRateType + ", freightRate=" + freightRate + ", pfCalcType=" + pfCalcType + ", pfRateType="
				+ pfRateType + ", pfRate=" + pfRate + ", itemTypeId=" + itemTypeId + ", itemId=" + itemId
				+ ", processStageNo=" + processStageNo + ", rcptVendorFlowId=" + rcptVendorFlowId
				+ ", vendorItemNumber=" + vendorItemNumber + ", vendorItemName=" + vendorItemName
				+ ", vendorItemNameId=" + vendorItemNameId + ", orderLineNo=" + orderLineNo + ", orderNos=" + orderNos
				+ ", orderKgs=" + orderKgs + ", precisionNosDigit=" + precisionNosDigit + ", precisionKgsDigit="
				+ precisionKgsDigit + ", uom=" + uom + ", unitPriceUom=" + unitPriceUom + ", discountPrecentage="
				+ discountPrecentage + ", jobworkRedPercentage=" + jobworkRedPercentage + ", hsnsaCodeId=" + hsnsaCodeId
				+ ", hsnsaCode=" + hsnsaCode + ", hsnsaDescription=" + hsnsaDescription + ", hsnsaRatePercentage="
				+ hsnsaRatePercentage + ", hsnsaRateEffectiveFrom=" + hsnsaRateEffectiveFrom + ", orderItemWtGms="
				+ orderItemWtGms + ", vendorItemWtGms=" + vendorItemWtGms + ", finishedItemWtGms=" + finishedItemWtGms
				+ ", consumeItemWtGms=" + consumeItemWtGms + ", orderItemApprovalStatus=" + orderItemApprovalStatus
				+ ", orderItemStatus=" + orderItemStatus + "]";
	}

	public long getItemOrderId() {
		return itemOrderId;
	}

	public void setItemOrderId(long itemOrderId) {
		this.itemOrderId = itemOrderId;
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

	public String getOrderOurCode() {
		return orderOurCode;
	}

	public void setOrderOurCode(String orderOurCode) {
		this.orderOurCode = orderOurCode;
	}

	public String getOrderFor() {
		return orderFor;
	}

	public void setOrderFor(String orderFor) {
		this.orderFor = orderFor;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getOrderRptIssueDate() {
		return orderRptIssueDate;
	}

	public void setOrderRptIssueDate(LocalDate orderRptIssueDate) {
		this.orderRptIssueDate = orderRptIssueDate;
	}

	public LocalDate getOrderEffectiveFromDate() {
		return orderEffectiveFromDate;
	}

	public void setOrderEffectiveFromDate(LocalDate orderEffectiveFromDate) {
		this.orderEffectiveFromDate = orderEffectiveFromDate;
	}

	public String getMultipleHsnRate() {
		return multipleHsnRate;
	}

	public void setMultipleHsnRate(String multipleHsnRate) {
		this.multipleHsnRate = multipleHsnRate;
	}

	public String getOrderToVendorId() {
		return orderToVendorId;
	}

	public void setOrderToVendorId(String orderToVendorId) {
		this.orderToVendorId = orderToVendorId;
	}

	public String getDeliveryToVendorId() {
		return deliveryToVendorId;
	}

	public void setDeliveryToVendorId(String deliveryToVendorId) {
		this.deliveryToVendorId = deliveryToVendorId;
	}

	public String getModeOfDispatch() {
		return modeOfDispatch;
	}

	public void setModeOfDispatch(String modeOfDispatch) {
		this.modeOfDispatch = modeOfDispatch;
	}

	public String getDeliveryTerms() {
		return deliveryTerms;
	}

	public void setDeliveryTerms(String deliveryTerms) {
		this.deliveryTerms = deliveryTerms;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getContactMail() {
		return contactMail;
	}

	public void setContactMail(String contactMail) {
		this.contactMail = contactMail;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSpecialInstruction() {
		return specialInstruction;
	}

	public void setSpecialInstruction(String specialInstruction) {
		this.specialInstruction = specialInstruction;
	}

	public String getScheduleVariationPercentage() {
		return scheduleVariationPercentage;
	}

	public void setScheduleVariationPercentage(String scheduleVariationPercentage) {
		this.scheduleVariationPercentage = scheduleVariationPercentage;
	}

	public String getTcsPercentage() {
		return tcsPercentage;
	}

	public void setTcsPercentage(String tcsPercentage) {
		this.tcsPercentage = tcsPercentage;
	}

	public String getPackagingCalcType() {
		return packagingCalcType;
	}

	public void setPackagingCalcType(String packagingCalcType) {
		this.packagingCalcType = packagingCalcType;
	}

	public String getPackagingRateType() {
		return packagingRateType;
	}

	public void setPackagingRateType(String packagingRateType) {
		this.packagingRateType = packagingRateType;
	}

	public String getPackagingRate() {
		return packagingRate;
	}

	public void setPackagingRate(String packagingRate) {
		this.packagingRate = packagingRate;
	}

	public String getFreightCalcType() {
		return freightCalcType;
	}

	public void setFreightCalcType(String freightCalcType) {
		this.freightCalcType = freightCalcType;
	}

	public String getFreightRateType() {
		return freightRateType;
	}

	public void setFreightRateType(String freightRateType) {
		this.freightRateType = freightRateType;
	}

	public String getFreightRate() {
		return freightRate;
	}

	public void setFreightRate(String freightRate) {
		this.freightRate = freightRate;
	}

	public String getPfCalcType() {
		return pfCalcType;
	}

	public void setPfCalcType(String pfCalcType) {
		this.pfCalcType = pfCalcType;
	}

	public String getPfRateType() {
		return pfRateType;
	}

	public void setPfRateType(String pfRateType) {
		this.pfRateType = pfRateType;
	}

	public String getPfRate() {
		return pfRate;
	}

	public void setPfRate(String pfRate) {
		this.pfRate = pfRate;
	}

	public String getItemTypeId() {
		return itemTypeId;
	}

	public void setItemTypeId(String itemTypeId) {
		this.itemTypeId = itemTypeId;
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

	public String getRcptVendorFlowId() {
		return rcptVendorFlowId;
	}

	public void setRcptVendorFlowId(String rcptVendorFlowId) {
		this.rcptVendorFlowId = rcptVendorFlowId;
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

	public String getVendorItemNameId() {
		return vendorItemNameId;
	}

	public void setVendorItemNameId(String vendorItemNameId) {
		this.vendorItemNameId = vendorItemNameId;
	}

	public String getOrderLineNo() {
		return orderLineNo;
	}

	public void setOrderLineNo(String orderLineNo) {
		this.orderLineNo = orderLineNo;
	}

	public String getOrderNos() {
		return orderNos;
	}

	public void setOrderNos(String orderNos) {
		this.orderNos = orderNos;
	}

	public String getOrderKgs() {
		return orderKgs;
	}

	public void setOrderKgs(String orderKgs) {
		this.orderKgs = orderKgs;
	}

	public String getPrecisionNosDigit() {
		return precisionNosDigit;
	}

	public void setPrecisionNosDigit(String precisionNosDigit) {
		this.precisionNosDigit = precisionNosDigit;
	}

	public String getPrecisionKgsDigit() {
		return precisionKgsDigit;
	}

	public void setPrecisionKgsDigit(String precisionKgsDigit) {
		this.precisionKgsDigit = precisionKgsDigit;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getUnitPriceUom() {
		return unitPriceUom;
	}

	public void setUnitPriceUom(String unitPriceUom) {
		this.unitPriceUom = unitPriceUom;
	}

	public String getDiscountPrecentage() {
		return discountPrecentage;
	}

	public void setDiscountPrecentage(String discountPrecentage) {
		this.discountPrecentage = discountPrecentage;
	}

	public String getJobworkRedPercentage() {
		return jobworkRedPercentage;
	}

	public void setJobworkRedPercentage(String jobworkRedPercentage) {
		this.jobworkRedPercentage = jobworkRedPercentage;
	}

	public String getHsnsaCodeId() {
		return hsnsaCodeId;
	}

	public void setHsnsaCodeId(String hsnsaCodeId) {
		this.hsnsaCodeId = hsnsaCodeId;
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

	public LocalDate getHsnsaRateEffectiveFrom() {
		return hsnsaRateEffectiveFrom;
	}

	public void setHsnsaRateEffectiveFrom(LocalDate hsnsaRateEffectiveFrom) {
		this.hsnsaRateEffectiveFrom = hsnsaRateEffectiveFrom;
	}

	public String getOrderItemWtGms() {
		return orderItemWtGms;
	}

	public void setOrderItemWtGms(String orderItemWtGms) {
		this.orderItemWtGms = orderItemWtGms;
	}

	public String getVendorItemWtGms() {
		return vendorItemWtGms;
	}

	public void setVendorItemWtGms(String vendorItemWtGms) {
		this.vendorItemWtGms = vendorItemWtGms;
	}

	public String getFinishedItemWtGms() {
		return finishedItemWtGms;
	}

	public void setFinishedItemWtGms(String finishedItemWtGms) {
		this.finishedItemWtGms = finishedItemWtGms;
	}

	public String getConsumeItemWtGms() {
		return consumeItemWtGms;
	}

	public void setConsumeItemWtGms(String consumeItemWtGms) {
		this.consumeItemWtGms = consumeItemWtGms;
	}

	public String getOrderItemApprovalStatus() {
		return orderItemApprovalStatus;
	}

	public void setOrderItemApprovalStatus(String orderItemApprovalStatus) {
		this.orderItemApprovalStatus = orderItemApprovalStatus;
	}

	public String getOrderItemStatus() {
		return orderItemStatus;
	}

	public void setOrderItemStatus(String orderItemStatus) {
		this.orderItemStatus = orderItemStatus;
	}
	
	
	
		

}
