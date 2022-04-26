package com.endless.mercury.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "mry_txn_empl_user_accessed_page")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class UserAccessedPage implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rec_id")
	private long recId;
	
	@Column( name = "user_id")
	private String userId;
	
	private String createdClient;
	
	@Column( name = "accessed_page")
	private String accessedPage;
		
	@Column( name = "accessed_date")
	@UpdateTimestamp
	private LocalDateTime accessedDate;

	public UserAccessedPage()
	{
		
	}
	
	public UserAccessedPage(long recId, String createdClient, String userId, String accessedPage, LocalDateTime accessedDate) {
		super();
		this.recId = recId;
		this.userId = userId;
		this.accessedPage = accessedPage;
		this.accessedDate = accessedDate;
		this.createdClient = createdClient;
	}

	

	@Override
	public String toString() {
		return "UserAccessedPage [recId=" + recId + ", userId=" + userId + ", createdClient=" + createdClient
				+ ", accessedPage=" + accessedPage + ", accessedDate=" + accessedDate + "]";
	}

	public long getRecId() {
		return recId;
	}

	public void setRecId(long recId) {
		this.recId = recId;
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

	public String getAccessedPage() {
		return accessedPage;
	}

	public void setAccessedPage(String accessedPage) {
		this.accessedPage = accessedPage;
	}

	public LocalDateTime getAccessedDate() {
		return accessedDate;
	}

	public void setAccessedDate(LocalDateTime accessedDate) {
		this.accessedDate = accessedDate;
	}

	
}
