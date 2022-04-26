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
@Table(name = "mry_mst_process")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class Process implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long processId;
	private String createdClient;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String updatedBy;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	private String processName;
	private String processNameId;
	private String processDescription;
	private boolean active;
	private LocalDate inactiveDate;
	private String inactiveComments;
	
	public Process() {}

	public Process(long processId, String createdClient, String createdBy, LocalDateTime createdDate, String updatedBy,
			LocalDateTime updatedDate,  String processName, String processNameId,
			String processDescription, boolean active, LocalDate inactiveDate, String inactiveComments) {
		super();
		this.processId = processId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.processName = processName;
		this.processNameId = processNameId;
		this.processDescription = processDescription;
		this.active = active;
		this.inactiveDate = inactiveDate;
		this.inactiveComments = inactiveComments;
	}

	@Override
	public String toString() {
		return "Process [processId=" + processId + ", createdClient=" + createdClient + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", hsnCode=" + processName + ", processNameId=" + processNameId
				+ ", processDescription=" + processDescription + ", active=" + active + ", inactiveDate=" + inactiveDate
				+ ", inactiveComments=" + inactiveComments + "]";
	}

	public long getProcessId() {
		return processId;
	}

	public void setProcessId(long processId) {
		this.processId = processId;
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


	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessNameId() {
		return processNameId;
	}

	public void setProcessNameId(String processNameId) {
		this.processNameId = processNameId;
	}

	public String getProcessDescription() {
		return processDescription;
	}

	public void setProcessDescription(String processDescription) {
		this.processDescription = processDescription;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDate getInactiveDate() {
		return inactiveDate;
	}

	public void setInactiveDate(LocalDate inactiveDate) {
		this.inactiveDate = inactiveDate;
	}

	public String getInactiveComments() {
		return inactiveComments;
	}

	public void setInactiveComments(String inactiveComments) {
		this.inactiveComments = inactiveComments;
	}
	
	

}
