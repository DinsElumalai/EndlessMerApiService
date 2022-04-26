package com.endless.mercury.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "mry_mst_item")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class Item implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemId;
	private String createdClient;
	private String createdUserId;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String updatedUserId;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	private String itemOurCode;
	private String itemTypeId;
	private String itemSubTypeId;
	private String itemOurTypeCode;
	private String itemNumber;
	private String itemName;
	private String itemNameId;
	private long vendorId;
	private String itemDescription;
	private String unitCategory;
	private String hsnSacCode;
	private String comments;
	private String bufferQty;
	private String reorderQtyLevel;
	private LocalDate registeredDate;
	private byte[] imageName;
	private boolean active;
	private LocalDate inactivatedDate;
	
	public Item() {}

	public Item(long itemId, String createdClient, String createdUserId, LocalDateTime createdDate, String updatedUserId,
			LocalDateTime updatedDate, String itemOurCode, String itemTypeId, String itemSubTypeId,
			String itemOurTypeCode, String itemNumber, String itemName, String itemNameId, long vendorId,
			String itemDescription, String unitCategory, String hsnSacCode, String comments, String bufferQty,
			String reorderQtyLevel, LocalDate registeredDate, byte[] imageName, boolean active,
			LocalDate inactivatedDate) {
		super();
		this.itemId = itemId;
		this.createdClient = createdClient;
		this.createdUserId = createdUserId;
		this.createdDate = createdDate;
		this.updatedUserId = updatedUserId;
		this.updatedDate = updatedDate;
		this.itemOurCode = itemOurCode;
		this.itemTypeId = itemTypeId;
		this.itemSubTypeId = itemSubTypeId;
		this.itemOurTypeCode = itemOurTypeCode;
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.itemNameId = itemNameId;
		this.vendorId = vendorId;
		this.itemDescription = itemDescription;
		this.unitCategory = unitCategory;
		this.hsnSacCode = hsnSacCode;
		this.comments = comments;
		this.bufferQty = bufferQty;
		this.reorderQtyLevel = reorderQtyLevel;
		this.registeredDate = registeredDate;
		this.imageName = imageName;
		this.active = active;
		this.inactivatedDate = inactivatedDate;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", createdClient=" + createdClient + ", createdUserId=" + createdUserId + ", createdDate="
				+ createdDate + ", updatedUserId=" + updatedUserId + ", updatedDate=" + updatedDate + ", itemOurCode="
				+ itemOurCode + ", itemTypeId=" + itemTypeId + ", itemSubTypeId=" + itemSubTypeId + ", itemOurTypeCode="
				+ itemOurTypeCode + ", itemNumber=" + itemNumber + ", itemName=" + itemName + ", itemNameId="
				+ itemNameId + ", vendorId=" + vendorId + ", itemDescription=" + itemDescription + ", unitCategory="
				+ unitCategory + ", hsnSacCode=" + hsnSacCode + ", comments=" + comments + ", bufferQty=" + bufferQty
				+ ", reorderQtyLevel=" + reorderQtyLevel + ", registeredDate=" + registeredDate + ", imageName="
				+ Arrays.toString(imageName) + ", active=" + active + ", inactivatedDate=" + inactivatedDate + "]";
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getCreatedClient() {
		return createdClient;
	}

	public void setCreatedClient(String createdClient) {
		this.createdClient = createdClient;
	}

	public String getCreatedUserId() {
		return createdUserId;
	}

	public void setCreatedUserId(String createdUserId) {
		this.createdUserId = createdUserId;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedUserId() {
		return updatedUserId;
	}

	public void setUpdatedUserId(String updatedUserId) {
		this.updatedUserId = updatedUserId;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUdpatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getItemOurCode() {
		return itemOurCode;
	}

	public void setItemOurCode(String itemOurCode) {
		this.itemOurCode = itemOurCode;
	}

	public String getItemTypeId() {
		return itemTypeId;
	}

	public void setItemTypeId(String itemTypeId) {
		this.itemTypeId = itemTypeId;
	}

	public String getItemSubTypeId() {
		return itemSubTypeId;
	}

	public void setItemSubTypeId(String itemSubTypeId) {
		this.itemSubTypeId = itemSubTypeId;
	}

	public String getItemOurTypeCode() {
		return itemOurTypeCode;
	}

	public void setItemOurTypeCode(String itemOurTypeCode) {
		this.itemOurTypeCode = itemOurTypeCode;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemNameId() {
		return itemNameId;
	}

	public void setItemNameId(String itemNameId) {
		this.itemNameId = itemNameId;
	}

	public long getVendorId() {
		return vendorId;
	}

	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getUnitCategory() {
		return unitCategory;
	}

	public void setUnitCategory(String unitCategory) {
		this.unitCategory = unitCategory;
	}

	public String getHsnSacCode() {
		return hsnSacCode;
	}

	public void setHsnSacCode(String hsnSacCode) {
		this.hsnSacCode = hsnSacCode;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getBufferQty() {
		return bufferQty;
	}

	public void setBufferQty(String bufferQty) {
		this.bufferQty = bufferQty;
	}

	public String getReorderQtyLevel() {
		return reorderQtyLevel;
	}

	public void setReorderQtyLevel(String reorderQtyLevel) {
		this.reorderQtyLevel = reorderQtyLevel;
	}

	public LocalDate getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(LocalDate registeredDate) {
		this.registeredDate = registeredDate;
	}

	public byte[] getImageName() {
		return imageName;
	}

	public void setImageName(byte[] imageName) {
		this.imageName = imageName;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDate getInactivatedDate() {
		return inactivatedDate;
	}

	public void setInactivatedDate(LocalDate inactivatedDate) {
		this.inactivatedDate = inactivatedDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
