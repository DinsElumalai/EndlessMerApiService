package com.endless.mercury.model;

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
@Table(name = "mry_mst_empl_user_role_group")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class UserGroup 
{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roleGroupId;
	
	private String roleGroupName;
	
	private String createdClient;
	
	private String roleName;
	
	private String createdUserId;
	
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	private String updatedUserId;
	
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	public UserGroup() {}

	public UserGroup(long roleGroupId, String roleGroupName, String roleName, String createdUserId,
			LocalDateTime createdDate, String updatedUserId, LocalDateTime updatedDate, String createdClient) {
		super();
		this.roleGroupId = roleGroupId;
		this.roleGroupName = roleGroupName;
		this.roleName = roleName;
		this.createdUserId = createdUserId;
		this.createdDate = createdDate;
		this.updatedUserId = updatedUserId;
		this.updatedDate = updatedDate;
		this.createdClient = createdClient;
	}

	
	@Override
	public String toString() {
		return "UserGroup [roleGroupId=" + roleGroupId + ", roleGroupName=" + roleGroupName + ", createdClient="
				+ createdClient + ", roleName=" + roleName + ", createdUserId=" + createdUserId + ", createdDate="
				+ createdDate + ", updatedUserId=" + updatedUserId + ", updatedDate=" + updatedDate + "]";
	}

	public long getRoleGroupId() {
		return roleGroupId;
	}

	public void setRoleGroupId(long roleGroupId) {
		this.roleGroupId = roleGroupId;
	}

	public String getCreatedClient() {
		return createdClient;
	}

	public void setCreatedClient(String createdClient) {
		this.createdClient = createdClient;
	}

	public String getRoleGroupName() {
		return roleGroupName;
	}

	public void setRoleGroupName(String roleGroupName) {
		this.roleGroupName = roleGroupName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

		
	
	
	
	
	
}
