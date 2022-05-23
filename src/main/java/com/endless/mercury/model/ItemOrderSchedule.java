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
@Table(name = "mry_txn_order_schedule")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class ItemOrderSchedule implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemOrderScheduleId;
	private String createdClient;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String updatedBy;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	private String orderScheduleOurCode;
	private String scheduleFor;
	private String itemOrderId;
	private String itemId;
	private String vendorScheduleReference;
	private String scheduleVendor;
	private String scheduleType;
	private LocalDate scheduleDate;
	private String scheduleNos;
	private String scheduleKgs;
	private LocalDate scheduleValidDate;

	public ItemOrderSchedule() {}

	public ItemOrderSchedule(long itemOrderScheduleId, String createdClient, String createdBy,
			LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate, String orderScheduleOurCode,
			String scheduleFor, String itemOrderId, String itemId, String vendorScheduleReference,
			String scheduleVendor, String scheduleType, LocalDate scheduleDate, String scheduleNos, String scheduleKgs,
			LocalDate scheduleValidDate) {
		super();
		this.itemOrderScheduleId = itemOrderScheduleId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.orderScheduleOurCode = orderScheduleOurCode;
		this.scheduleFor = scheduleFor;
		this.itemOrderId = itemOrderId;
		this.itemId = itemId;
		this.vendorScheduleReference = vendorScheduleReference;
		this.scheduleVendor = scheduleVendor;
		this.scheduleType = scheduleType;
		this.scheduleDate = scheduleDate;
		this.scheduleNos = scheduleNos;
		this.scheduleKgs = scheduleKgs;
		this.scheduleValidDate = scheduleValidDate;
	}

	@Override
	public String toString() {
		return "ItemOrderSchedule [itemOrderScheduleId=" + itemOrderScheduleId + ", createdClient=" + createdClient
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", orderScheduleOurCode=" + orderScheduleOurCode + ", scheduleFor="
				+ scheduleFor + ", itemOrderId=" + itemOrderId + ", itemId=" + itemId + ", vendorScheduleReference="
				+ vendorScheduleReference + ", scheduleVendor=" + scheduleVendor + ", scheduleType=" + scheduleType
				+ ", scheduleDate=" + scheduleDate + ", scheduleNos=" + scheduleNos + ", scheduleKgs=" + scheduleKgs
				+ ", scheduleValidDate=" + scheduleValidDate + "]";
	}

	public long getItemOrderScheduleId() {
		return itemOrderScheduleId;
	}

	public void setItemOrderScheduleId(long itemOrderScheduleId) {
		this.itemOrderScheduleId = itemOrderScheduleId;
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

	public String getOrderScheduleOurCode() {
		return orderScheduleOurCode;
	}

	public void setOrderScheduleOurCode(String orderScheduleOurCode) {
		this.orderScheduleOurCode = orderScheduleOurCode;
	}

	public String getScheduleFor() {
		return scheduleFor;
	}

	public void setScheduleFor(String scheduleFor) {
		this.scheduleFor = scheduleFor;
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

	public String getVendorScheduleReference() {
		return vendorScheduleReference;
	}

	public void setVendorScheduleReference(String vendorScheduleReference) {
		this.vendorScheduleReference = vendorScheduleReference;
	}

	public String getScheduleVendor() {
		return scheduleVendor;
	}

	public void setScheduleVendor(String scheduleVendor) {
		this.scheduleVendor = scheduleVendor;
	}

	public String getScheduleType() {
		return scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}

	public LocalDate getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(LocalDate scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getScheduleNos() {
		return scheduleNos;
	}

	public void setScheduleNos(String scheduleNos) {
		this.scheduleNos = scheduleNos;
	}

	public String getScheduleKgs() {
		return scheduleKgs;
	}

	public void setScheduleKgs(String scheduleKgs) {
		this.scheduleKgs = scheduleKgs;
	}

	public LocalDate getScheduleValidDate() {
		return scheduleValidDate;
	}

	public void setScheduleValidDate(LocalDate scheduleValidDate) {
		this.scheduleValidDate = scheduleValidDate;
	}

	
	
	
	
	}
