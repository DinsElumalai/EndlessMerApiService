package com.endless.mercury.model;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@Table(name = "mry_mst_hsnsacode")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class HsnCode implements Serializable
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long hsnId;
	private String createdClient;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String updatedBy;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	private String hsnCode;
    private String hsnDescription;
    private String hsnRate;
    private String hsnRateFrom;
    
    public HsnCode()
    {
    	
    }

	public HsnCode(long hsnId, String createdClient, String createdBy, LocalDateTime createdDate, String updatedBy,
			LocalDateTime updatedDate, String hsnCode, String hsnDescription, String hsnRate, String hsnRateFrom) {
		super();
		this.hsnId = hsnId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.hsnCode = hsnCode;
		this.hsnDescription = hsnDescription;
		this.hsnRate = hsnRate;
		this.hsnRateFrom = hsnRateFrom;
	}

	@Override
	public String toString() {
		return "HsnCode [hsnId=" + hsnId + ", createdClient=" + createdClient + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", hsnCode=" + hsnCode + ", hsnDescription=" + hsnDescription + ", hsnRate=" + hsnRate
				+ ", hsnRateFrom=" + hsnRateFrom + "]";
	}

	public long getHsnId() {
		return hsnId;
	}

	public void setHsnId(long hsnId) {
		this.hsnId = hsnId;
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

	public String getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public String getHsnDescription() {
		return hsnDescription;
	}

	public void setHsnDescription(String hsnDescription) {
		this.hsnDescription = hsnDescription;
	}

	public String getHsnRate() {
		return hsnRate;
	}

	public void setHsnRate(String hsnRate) {
		this.hsnRate = hsnRate;
	}

	public String getHsnRateFrom() {
		return hsnRateFrom;
	}

	public void setHsnRateFrom(String hsnRateFrom) {
		this.hsnRateFrom = hsnRateFrom;
	}
    
    

}
