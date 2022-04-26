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
@Table(name = "mry_mst_item_sub_type")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class ItemSubType implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemSubTypeId;
	private String createdClient;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String createdBy;
	private String updatedBy;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	private String itemTypeId;
	private String itemSubTypeName;
	private String itemSubTypeDesc;
	private String itemPrefix;
	
	public ItemSubType() {}

	public ItemSubType(long itemSubTypeId, String createdClient, LocalDateTime createdDate, String createdBy, String updatedBy,
			LocalDateTime updatedDate, String itemTypeId, String itemSubTypeName, String itemSubTypeDesc,
			String itemPrefix) {
		super();
		this.itemSubTypeId = itemSubTypeId;
		this.createdClient = createdClient;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.itemTypeId = itemTypeId;
		this.itemSubTypeName = itemSubTypeName;
		this.itemSubTypeDesc = itemSubTypeDesc;
		this.itemPrefix = itemPrefix;
	}

	@Override
	public String toString() {
		return "ItemSubType [itemSubTypeId=" + itemSubTypeId + ", createdClient=" + createdClient + ", createdDate=" + createdDate
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", itemTypeId=" + itemTypeId + ", itemSubTypeName=" + itemSubTypeName + ", itemSubTypeDesc="
				+ itemSubTypeDesc + ", itemPrefix=" + itemPrefix + "]";
	}

	public long getItemSubTypeId() {
		return itemSubTypeId;
	}

	public void setItemSubTypeId(long itemSubTypeId) {
		this.itemSubTypeId = itemSubTypeId;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	public String getItemTypeId() {
		return itemTypeId;
	}

	public void setItemTypeId(String itemTypeId) {
		this.itemTypeId = itemTypeId;
	}

	public String getItemSubTypeName() {
		return itemSubTypeName;
	}

	public void setItemSubTypeName(String itemSubTypeName) {
		this.itemSubTypeName = itemSubTypeName;
	}

	public String getItemSubTypeDesc() {
		return itemSubTypeDesc;
	}

	public void setItemSubTypeDesc(String itemSubTypeDesc) {
		this.itemSubTypeDesc = itemSubTypeDesc;
	}

	public String getItemPrefix() {
		return itemPrefix;
	}

	public void setItemPrefix(String itemPrefix) {
		this.itemPrefix = itemPrefix;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
