package com.endless.mercury.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "mry_set_software")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"updatedDate"}, allowGetters = true)
public class SoftwareSetup implements Serializable
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	@Column(name = "constant_name")
	private String constantName;
	
	@Column(name = "constant_value")
	private String constantValue;
	
	@Column(name = "comments")
	private String comments;
	
	@Column(name = "updated_user_id")
	private String updatedUserId;
	
	@Column(name = "updated_date", nullable = false)
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	public SoftwareSetup() {}

	public SoftwareSetup(Long id, String constantName, String constantValue, String comments, String updatedUserId,
			LocalDateTime updatedDate) {
		super();
		this.id = id;
		this.constantName = constantName;
		this.constantValue = constantValue;
		this.comments = comments;
		this.updatedUserId = updatedUserId;
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "SoftwareSetup [id=" + id + ", constantName=" + constantName + ", constantValue=" + constantValue
				+ ", comments=" + comments + ", updatedUserId=" + updatedUserId + ", updatedDate=" + updatedDate + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConstantName() {
		return constantName;
	}

	public void setConstantName(String constantName) {
		this.constantName = constantName;
	}

	public String getConstantValue() {
		return constantValue;
	}

	public void setConstantValue(String constantValue) {
		this.constantValue = constantValue;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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
