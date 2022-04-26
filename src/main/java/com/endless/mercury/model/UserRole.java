package com.endless.mercury.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "mry_set_user_role")
@EntityListeners(AuditingEntityListener.class)
public class UserRole 
{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roleId;
		
	private String roleName;
	
	public UserRole() {}

	public UserRole(long roleId,String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "UserGroupRole [roleId=" + roleId  + ", roleName=" + roleName + "]";
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
