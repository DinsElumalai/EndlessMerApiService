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
@Table(name = "mry_mst_doc_rec_performance_txn_review")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class DocRecPerformanceReview 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reviewId;
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
	private LocalDate reviewDate;
	@Column
	private String employeeId;
	@Column
	private String reviewComments;
	
	public DocRecPerformanceReview() {}

	public DocRecPerformanceReview(long reviewId, String createdClient, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate, String docRecPerId, LocalDate reviewDate,
			String employeeId, String reviewComments) {
		super();
		this.reviewId = reviewId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.docRecPerId = docRecPerId;
		this.reviewDate = reviewDate;
		this.employeeId = employeeId;
		this.reviewComments = reviewComments;
	}

	@Override
	public String toString() {
		return "DocRecPerformanceReview [reviewId=" + reviewId + ", createdClient=" + createdClient + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + ", docRecPerId=" + docRecPerId + ", reviewDate=" + reviewDate + ", employeeId="
				+ employeeId + ", reviewComments=" + reviewComments + "]";
	}

	public long getReviewId() {
		return reviewId;
	}

	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
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

	public LocalDate getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(LocalDate reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getReviewComments() {
		return reviewComments;
	}

	public void setReviewComments(String reviewComments) {
		this.reviewComments = reviewComments;
	}
	
	
}
