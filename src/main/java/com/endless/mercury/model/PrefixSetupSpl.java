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
@Table(name = "mry_mst_prefix_special")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class PrefixSetupSpl implements Serializable
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long prefixSetupSplId;
	private String createdClient;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String updatedBy;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	private String vendorId;
	private String financialYear;
	private String ospiOurCodePrefix;
	private String osdiOurCodePrefix;
	private String osdcOurCodePrefix;
	
	public PrefixSetupSpl() {}

	public PrefixSetupSpl(long prefixSetupSplId, String createdClient, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate, String vendorId, String financialYear,
			String ospiOurCodePrefix, String osdiOurCodePrefix, String osdcOurCodePrefix) {
		super();
		this.prefixSetupSplId = prefixSetupSplId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.vendorId = vendorId;
		this.financialYear = financialYear;
		this.ospiOurCodePrefix = ospiOurCodePrefix;
		this.osdiOurCodePrefix = osdiOurCodePrefix;
		this.osdcOurCodePrefix = osdcOurCodePrefix;
	}

	@Override
	public String toString() {
		return "PrefixSetupSpl [prefixSetupSplId=" + prefixSetupSplId + ", createdClient=" + createdClient
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", vendorId=" + vendorId + ", financialYear=" + financialYear
				+ ", ospiOurCodePrefix=" + ospiOurCodePrefix + ", osdiOurCodePrefix=" + osdiOurCodePrefix
				+ ", osdcOurCodePrefix=" + osdcOurCodePrefix + "]";
	}

	public long getPrefixSetupSplId() {
		return prefixSetupSplId;
	}

	public void setPrefixSetupSplId(long prefixSetupSplId) {
		this.prefixSetupSplId = prefixSetupSplId;
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

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getFinancialYear() {
		return financialYear;
	}

	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}

	public String getOspiOurCodePrefix() {
		return ospiOurCodePrefix;
	}

	public void setOspiOurCodePrefix(String ospiOurCodePrefix) {
		this.ospiOurCodePrefix = ospiOurCodePrefix;
	}

	public String getOsdiOurCodePrefix() {
		return osdiOurCodePrefix;
	}

	public void setOsdiOurCodePrefix(String osdiOurCodePrefix) {
		this.osdiOurCodePrefix = osdiOurCodePrefix;
	}

	public String getOsdcOurCodePrefix() {
		return osdcOurCodePrefix;
	}

	public void setOsdcOurCodePrefix(String osdcOurCodePrefix) {
		this.osdcOurCodePrefix = osdcOurCodePrefix;
	}
	
	
}
