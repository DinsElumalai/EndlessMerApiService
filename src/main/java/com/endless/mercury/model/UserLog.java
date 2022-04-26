package com.endless.mercury.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "mry_txn_empl_user_log")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class UserLog implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "log_id")
	private long logId;
	
	@Column( name = "user_id")
	private String userId;
	
	private String createdClient;
	
	@Column( name = "user_ip")
	private String userIp;
	
	@Column( name = "log_type")
	private String logType;
	
	@Column( name = "log_date", nullable = false)
	@UpdateTimestamp
	private LocalDateTime logDate;
	
	public UserLog() {}

	public UserLog(long logId,String createdClient,  String userId, String userIp, String logType, LocalDateTime logDate) {
		super();
		this.logId = logId;
		this.userId = userId;
		this.userIp = userIp;
		this.logType = logType;
		this.logDate = logDate;
		this.createdClient = createdClient;
	}

	

	@Override
	public String toString() {
		return "UserLog [logId=" + logId + ", userId=" + userId + ", createdClient=" + createdClient + ", userIp="
				+ userIp + ", logType=" + logType + ", logDate=" + logDate + "]";
	}

	public long getLogId() {
		return logId;
	}

	public void setLogId(long logId) {
		this.logId = logId;
	}

	public String getCreatedClient() {
		return createdClient;
	}

	public void setCreatedClient(String createdClient) {
		this.createdClient = createdClient;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public LocalDateTime getLogDate() {
		return logDate;
	}

	public void setLogDate(LocalDateTime logDate) {
		this.logDate = logDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
