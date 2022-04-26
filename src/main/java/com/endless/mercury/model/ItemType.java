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
@Table(name = "mry_mst_item_type")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class ItemType implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemTypeId;
	private String createdClient;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String createdUserId;
	private String updatedBy;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	private String itemTypeName;
	private String description;
	
	public ItemType()
	{
		
	}

	public ItemType(long itemTypeId, String createdClient, LocalDateTime createdDate, String createdUserId, String updatedBy,
			LocalDateTime updatedDate, String itemTypeName, String description) {
		super();
		this.itemTypeId = itemTypeId;
		this.createdClient = createdClient;
		this.createdDate = createdDate;
		this.createdUserId = createdUserId;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.itemTypeName = itemTypeName;
		this.description = description;
	}

	@Override
	public String toString() {
		return "ItemType [itemTypeId=" + itemTypeId + ", createdClient=" + createdClient + ", createdDate=" + createdDate
				+ ", createdUserId=" + createdUserId + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", itemTypeName=" + itemTypeName + ", description=" + description + "]";
	}

	public long getItemTypeId() {
		return itemTypeId;
	}

	public void setItemTypeId(long itemTypeId) {
		this.itemTypeId = itemTypeId;
	}

	public String getCreatedClient() {
		return createdClient;
	}

	public void setCreatedClient(String createdClient) {
		this.createdClient = createdClient;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedUserId() {
		return createdUserId;
	}

	public void setCreatedUserId(String createdUserId) {
		this.createdUserId = createdUserId;
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

	public String getItemTypeName() {
		return itemTypeName;
	}

	public void setItemTypeName(String itemTypeName) {
		this.itemTypeName = itemTypeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
