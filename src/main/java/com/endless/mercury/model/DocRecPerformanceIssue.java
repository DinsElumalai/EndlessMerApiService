package com.endless.mercury.model;

import java.time.LocalDateTime;
import java.time.LocalDate;

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
@Table(name = "mry_mst_doc_rec_performance_txn_issue")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class DocRecPerformanceIssue 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long issueId;
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
	private String issueNo;
	@Column
	private LocalDate issueDate;
	@Column
	private String issueReason;
	@Column
	private boolean isActive;
	@Column
	private LocalDate inActivedDate;
	@Column
	private String inActivatedComments;
	
	public DocRecPerformanceIssue() {}

	public DocRecPerformanceIssue(long issueId, String createdClient, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate, String docRecPerId, String issueNo, LocalDate issueDate,
			String issueReason, boolean isActive, LocalDate inActivedDate, String inActivatedComments) {
		super();
		this.issueId = issueId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.docRecPerId = docRecPerId;
		this.issueNo = issueNo;
		this.issueDate = issueDate;
		this.issueReason = issueReason;
		this.isActive = isActive;
		this.inActivedDate = inActivedDate;
		this.inActivatedComments = inActivatedComments;
	}

	@Override
	public String toString() {
		return "DocRecPerformanceIssue [issueId=" + issueId + ", createdClient=" + createdClient + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + ", docRecPerId=" + docRecPerId + ", issueNo=" + issueNo + ", issueDate=" + issueDate
				+ ", issueReason=" + issueReason + ", isActive=" + isActive + ", inActivedDate=" + inActivedDate
				+ ", inActivatedComments=" + inActivatedComments + "]";
	}

	public long getIssueId() {
		return issueId;
	}

	public void setIssueId(long issueId) {
		this.issueId = issueId;
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

	public String getIssueNo() {
		return issueNo;
	}

	public void setIssueNo(String issueNo) {
		this.issueNo = issueNo;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public String getIssueReason() {
		return issueReason;
	}

	public void setIssueReason(String issueReason) {
		this.issueReason = issueReason;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public LocalDate getInActivedDate() {
		return inActivedDate;
	}

	public void setInActivedDate(LocalDate inActivedDate) {
		this.inActivedDate = inActivedDate;
	}

	public String getInActivatedComments() {
		return inActivatedComments;
	}

	public void setInActivatedComments(String inActivatedComments) {
		this.inActivatedComments = inActivatedComments;
	}
	
	
}
