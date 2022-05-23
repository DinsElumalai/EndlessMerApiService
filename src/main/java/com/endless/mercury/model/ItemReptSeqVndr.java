package com.endless.mercury.model;

import java.io.Serializable;
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
@Table(name = "mry_mst_item_recipe_sequence_vendor")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class ItemReptSeqVndr implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1952918905273480435L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long recipeVendorFlowId;
	private String createdClient;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String updatedBy;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	private String itemType;
	private String item;
	private String receipeVendor;
	private String processStageNo;
	private String processStageName;
	private String processStageFor;
	private String processSequenceNo;
	private String processName;
	private String processFor;
	private String subItemSequenceNo;
	private String subItemId;
	private String subItemPriority;
	private String uom;
	private String consumptionForQty;
	private String consumptionQty;
	private String finishQty;
	private String balanceQty;
	private String processVendor;
	private String hsnCodeId;
	private String vendorItemNumber;
	private String vendorItemName;
	private String vendorItemNameId;
	private String vendorPriority;
	private String processSharingPrecentage;
	
	public ItemReptSeqVndr() {}

	public ItemReptSeqVndr(long recipeVendorFlowId, String createdClient, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate, String itemType, String item, String receipeVendor,
			String processStageNo, String processStageName, String processStageFor, String processSequenceNo,
			String processName, String childItemFor, String childItemSequenceNo, String childItemId,
			String childItemPriority, String uom, String consumptionForQty, String consumptionQty, String finishQty,
			String balanceQty, String vendorId, String hsnCodeId, String vendorItemNumber, String vendorItemName,
			String vendorItemNameId, String vendorPriority, String stockSharingPrecentage) {
		super();
		this.recipeVendorFlowId = recipeVendorFlowId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.itemType = itemType;
		this.item = item;
		this.receipeVendor = receipeVendor;
		this.processStageNo = processStageNo;
		this.processStageName = processStageName;
		this.processStageFor = processStageFor;
		this.processSequenceNo = processSequenceNo;
		this.processName = processName;
		this.processFor = childItemFor;
		this.subItemSequenceNo = childItemSequenceNo;
		this.subItemId = childItemId;
		this.subItemPriority = childItemPriority;
		this.uom = uom;
		this.consumptionForQty = consumptionForQty;
		this.consumptionQty = consumptionQty;
		this.finishQty = finishQty;
		this.balanceQty = balanceQty;
		this.processVendor = vendorId;
		this.hsnCodeId = hsnCodeId;
		this.vendorItemNumber = vendorItemNumber;
		this.vendorItemName = vendorItemName;
		this.vendorItemNameId = vendorItemNameId;
		this.vendorPriority = vendorPriority;
		this.processSharingPrecentage = stockSharingPrecentage;
	}

	@Override
	public String toString() {
		return "ItemReptSeqVndr [recipeVendorFlowId=" + recipeVendorFlowId + ", createdClient=" + createdClient
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", itemType=" + itemType + ", item=" + item + ", receipeVendor="
				+ receipeVendor + ", processStageNo=" + processStageNo + ", processStageName=" + processStageName
				+ ", processStageFor=" + processStageFor + ", processSequenceNo=" + processSequenceNo + ", processName="
				+ processName + ", childItemFor=" + processFor + ", childItemSequenceNo=" + subItemSequenceNo
				+ ", childItemId=" + subItemId + ", childItemPriority=" + subItemPriority + ", uom=" + uom
				+ ", consumptionForQty=" + consumptionForQty + ", consumptionQty=" + consumptionQty + ", finishQty="
				+ finishQty + ", balanceQty=" + balanceQty + ", vendorId=" + processVendor + ", hsnCodeId=" + hsnCodeId
				+ ", vendorItemNumber=" + vendorItemNumber + ", vendorItemName=" + vendorItemName
				+ ", vendorItemNameId=" + vendorItemNameId + ", vendorPriority=" + vendorPriority
				+ ", stockSharingPrecentage=" + processSharingPrecentage + "]";
	}

	public long getRecipeVendorFlowId() {
		return recipeVendorFlowId;
	}

	public void setRecipeVendorFlowId(long receipeVendorFlowId) {
		this.recipeVendorFlowId = receipeVendorFlowId;
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

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getReceipeVendor() {
		return receipeVendor;
	}

	public void setReceipeVendor(String receipeVendor) {
		this.receipeVendor = receipeVendor;
	}

	public String getProcessStageNo() {
		return processStageNo;
	}

	public void setProcessStageNo(String processStageNo) {
		this.processStageNo = processStageNo;
	}

	public String getProcessStageName() {
		return processStageName;
	}

	public void setProcessStageName(String processStageName) {
		this.processStageName = processStageName;
	}

	public String getProcessStageFor() {
		return processStageFor;
	}

	public void setProcessStageFor(String processStageFor) {
		this.processStageFor = processStageFor;
	}

	public String getProcessSequenceNo() {
		return processSequenceNo;
	}

	public void setProcessSequenceNo(String processSequenceNo) {
		this.processSequenceNo = processSequenceNo;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessFor() {
		return processFor;
	}

	public void setProcessFor(String childItemFor) {
		this.processFor = childItemFor;
	}

	public String getSubItemSequenceNo() {
		return subItemSequenceNo;
	}

	public void setSubItemSequenceNo(String childItemSequenceNo) {
		this.subItemSequenceNo = childItemSequenceNo;
	}

	public String getSubItemId() {
		return subItemId;
	}

	public void setSubItemId(String childItemId) {
		this.subItemId = childItemId;
	}

	public String getSubItemPriority() {
		return subItemPriority;
	}

	public void setSubItemPriority(String childItemPriority) {
		this.subItemPriority = childItemPriority;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getConsumptionForQty() {
		return consumptionForQty;
	}

	public void setConsumptionForQty(String consumptionForQty) {
		this.consumptionForQty = consumptionForQty;
	}

	public String getConsumptionQty() {
		return consumptionQty;
	}

	public void setConsumptionQty(String consumptionQty) {
		this.consumptionQty = consumptionQty;
	}

	public String getFinishQty() {
		return finishQty;
	}

	public void setFinishQty(String finishQty) {
		this.finishQty = finishQty;
	}

	public String getBalanceQty() {
		return balanceQty;
	}

	public void setBalanceQty(String balanceQty) {
		this.balanceQty = balanceQty;
	}

	public String getProcessVendor() {
		return processVendor;
	}

	public void setProcessVendor(String vendorId) {
		this.processVendor = vendorId;
	}

	public String getHsnCodeId() {
		return hsnCodeId;
	}

	public void setHsnCodeId(String hsnCodeId) {
		this.hsnCodeId = hsnCodeId;
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

	public String getVendorPriority() {
		return vendorPriority;
	}

	public void setVendorPriority(String vendorPriority) {
		this.vendorPriority = vendorPriority;
	}

	public String getProcessSharingPrecentage() {
		return processSharingPrecentage;
	}

	public void setProcessSharingPrecentage(String stockSharingPrecentage) {
		this.processSharingPrecentage = stockSharingPrecentage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
