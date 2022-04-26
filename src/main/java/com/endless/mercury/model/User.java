package com.endless.mercury.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "mry_mst_empl_user")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class User implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "user_id")
	private String userId;
	
	private String createdClient;
	
	@Column(name = "created_user_id")
	private String createdUserId;
	
	@Column(name = "created_date", nullable = false)
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@Column(name = "group_name")
	private String groupName;
	
	@Column(name = "updated_user_id")
	private String updatedUserId;
	
	@Column(name = "updated_date", nullable = false)
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	@Column(name = "isActive")
	private boolean isActive;
	
	@Column(name = "password")
	private String password;
	

	public User() {}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", createdClient=" + createdClient + ", createdUserId=" + createdUserId + ", createdDate="
				+ createdDate + ", groupName=" + groupName + ", updatedUserId=" + updatedUserId + ", updatedDate="
				+ updatedDate + ", isActive=" + isActive + ", password=" + password + "]";
	}


	public User(String userId, String createdClient, String createdUserId, LocalDateTime createdDate, String groupName,
			String updatedUserId, LocalDateTime updatedDate, boolean isActive, String password) {
		super();
		this.userId = userId;
		this.createdClient = createdClient;
		this.createdUserId = createdUserId;
		this.createdDate = createdDate;
		this.groupName = groupName;
		this.updatedUserId = updatedUserId;
		this.updatedDate = updatedDate;
		this.isActive = isActive;
		this.password = password;
	}


	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}


	public String getcreatedClient() {
		return createdClient;
	}


	public void setcreatedClient(String createdClient) {
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


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
