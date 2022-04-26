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
	private String scheduleType;
	private LocalDate scheduleDate;
	private String schedule_nos;
	private String schedule_kgs;
	private LocalDate schedule_valid_date;

	public ItemOrderSchedule() {}

	public ItemOrderSchedule(long itemOrderScheduleId, String createdClient, String createdBy,
			LocalDateTime createdDate,String itemId, String updatedBy, LocalDateTime updatedDate, String orderScheduleOurCode,
			String scheduleFor, String itemOrderId, String vendorScheduleReference, String scheduleType,
			LocalDate scheduleDate, String schedule_nos, String schedule_kgs, LocalDate schedule_valid_date) {
		super();
		this.itemOrderScheduleId = itemOrderScheduleId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.itemId = itemId;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.orderScheduleOurCode = orderScheduleOurCode;
		this.scheduleFor = scheduleFor;
		this.itemOrderId = itemOrderId;
		this.vendorScheduleReference = vendorScheduleReference;
		this.scheduleType = scheduleType;
		this.scheduleDate = scheduleDate;
		this.schedule_nos = schedule_nos;
		this.schedule_kgs = schedule_kgs;
		this.schedule_valid_date = schedule_valid_date;
	}

	

	@Override
	public String toString() {
		return "ItemOrderSchedule [itemOrderScheduleId=" + itemOrderScheduleId + ", createdClient=" + createdClient
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", orderScheduleOurCode=" + orderScheduleOurCode + ", scheduleFor="
				+ scheduleFor + ", itemOrderId=" + itemOrderId + ", itemId=" + itemId + ", vendorScheduleReference="
				+ vendorScheduleReference + ", scheduleType=" + scheduleType + ", scheduleDate=" + scheduleDate
				+ ", schedule_nos=" + schedule_nos + ", schedule_kgs=" + schedule_kgs + ", schedule_valid_date="
				+ schedule_valid_date + "]";
	}

	
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
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

	public String getVendorScheduleReference() {
		return vendorScheduleReference;
	}

	public void setVendorScheduleReference(String vendorScheduleReference) {
		this.vendorScheduleReference = vendorScheduleReference;
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

	public String getSchedule_nos() {
		return schedule_nos;
	}

	public void setSchedule_nos(String schedule_nos) {
		this.schedule_nos = schedule_nos;
	}

	public String getSchedule_kgs() {
		return schedule_kgs;
	}

	public void setSchedule_kgs(String schedule_kgs) {
		this.schedule_kgs = schedule_kgs;
	}

	public LocalDate getSchedule_valid_date() {
		return schedule_valid_date;
	}

	public void setSchedule_valid_date(LocalDate schedule_valid_date) {
		this.schedule_valid_date = schedule_valid_date;
	}
	
	
	
	}
