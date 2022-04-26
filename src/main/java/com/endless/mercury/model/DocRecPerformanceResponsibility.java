package com.endless.mercury.model;

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
@Table(name = "mry_mst_doc_rec_performance_txn_responsibility")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class DocRecPerformanceResponsibility 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long responsibilityId;
	@Column
	private String createdClient;
	@Column
	private String createdBy;
	@Column(name = "created_date", updatable = false)
	@CreationTimestamp
	private LocalDateTime createdDate;
	@Column
	private String updatedBy;
	@Column(name = "updated_date", updatable = false)
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	@Column
	private String docRecPerId;
	@Column
	private LocalDate responsibilityFromDate;
	@Column
	private String responsibilityEmployeeId;
	@Column
	private String responsibilityApproverEmployeeId;
	
	public DocRecPerformanceResponsibility() {}

	public DocRecPerformanceResponsibility(long responsibilityId, String createdClient, String createdBy,
			LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate, String docRecPerId,
			LocalDate responsibilityFromDate, String responsibilityEmployeeId,
			String responsibilityApproverEmployeeId) {
		super();
		this.responsibilityId = responsibilityId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.docRecPerId = docRecPerId;
		this.responsibilityFromDate = responsibilityFromDate;
		this.responsibilityEmployeeId = responsibilityEmployeeId;
		this.responsibilityApproverEmployeeId = responsibilityApproverEmployeeId;
	}

	@Override
	public String toString() {
		return "DocRecPerformanceResponsibility [responsibilityId=" + responsibilityId + ", createdClient="
				+ createdClient + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy="
				+ updatedBy + ", updatedDate=" + updatedDate + ", docRecPerId=" + docRecPerId
				+ ", responsibilityFromDate=" + responsibilityFromDate + ", responsibilityEmployeeId="
				+ responsibilityEmployeeId + ", responsibilityApproverEmployeeId=" + responsibilityApproverEmployeeId
				+ "]";
	}

	public long getResponsibilityId() {
		return responsibilityId;
	}

	public void setResponsibilityId(long responsibilityId) {
		this.responsibilityId = responsibilityId;
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

	public String getDocRecPerId() {
		return docRecPerId;
	}

	public void setDocRecPerId(String docRecPerId) {
		this.docRecPerId = docRecPerId;
	}

	public LocalDate getResponsibilityFromDate() {
		return responsibilityFromDate;
	}

	public void setResponsibilityFromDate(LocalDate responsibilityFromDate) {
		this.responsibilityFromDate = responsibilityFromDate;
	}

	public String getResponsibilityEmployeeId() {
		return responsibilityEmployeeId;
	}

	public void setResponsibilityEmployeeId(String responsibilityEmployeeId) {
		this.responsibilityEmployeeId = responsibilityEmployeeId;
	}

	public String getResponsibilityApproverEmployeeId() {
		return responsibilityApproverEmployeeId;
	}

	public void setResponsibilityApproverEmployeeId(String responsibilityApproverEmployeeId) {
		this.responsibilityApproverEmployeeId = responsibilityApproverEmployeeId;
	}
	
	
	
	
}
