package com.endless.mercury.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "mry_mst_empl_designation")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class EmployeeDesignation implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "designation_id")
	private long designationId;
	
	@Column(name = "designation_name")
	private String designationName;
	
	private String createdClient;
	
	@Column(name = "created_user_id")
	private String createdUserId;
	
	@Column(name = "created_date", nullable = false)
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@Column(name = "updated_user_id")
	private String updatedUserId;
	
	@Column(name = "updated_date", nullable = false)
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	

	public EmployeeDesignation() {}


	public EmployeeDesignation(int designationId, String designationName, String createdClient, String createdUserId,
			LocalDateTime createdDate, String updatedUserId, LocalDateTime updatedDate) {
		super();
		this.designationId = designationId;
		this.designationName = designationName;
		this.createdClient = createdClient;
		this.createdUserId = createdUserId;
		this.createdDate = createdDate;
		this.updatedUserId = updatedUserId;
		this.updatedDate = updatedDate;
	}


	@Override
	public String toString() {
		return "EmployeeDesignation [designationId=" + designationId + ", designationName=" + designationName
				+ ", createdClient=" + createdClient + ", createdUserId=" + createdUserId + ", createdDate=" + createdDate
				+ ", updatedUserId=" + updatedUserId + ", updatedDate=" + updatedDate + "]";
	}


	public long getDesignationId() {
		return designationId;
	}


	public void setDesignationId(long designationId) {
		this.designationId = designationId;
	}


	public String getDesignationName() {
		return designationName;
	}


	public void setDesignationName(String designationName) {
		this.designationName = designationName;
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


	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
}
