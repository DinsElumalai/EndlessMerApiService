package com.endless.mercury.model;

import java.io.Serializable;
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
@Table(name = "mry_set_prefix")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class PrefixSetup implements Serializable
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String createdClient;
	
	
	@Column(name = "created_date", nullable = false)
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@Column(name = "created_user_id")
	private String createdUserId; 
	
	@Column(name = "update_user_id")
	private String updatedUserId;
	
	@Column(name = "updated_date", nullable = false)
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	@Column(name = "financial_year")
	private String financialYear;
	
	@Column(name = "item_our_code_prefix")
	private String itemOurCodePrefix;
	
	@Column(name = "vendor_our_code_prefix")
	private String vendorOurCodePrefix;
	
	@Column(name = "employee_our_code_prefix")
	private String employeeOurCodePrefix;
	
	@Column(name = "rcrn_our_code_prefix")
	private String rcrnOurCodePrefix;
	
	@Column(name = "ppon_our_code_prefix")
	private String pponOurCodePrefix;
	
	private String rpanOurCodePrefix;
	private String pdrnOurCodePrefix;
	private String ospiOurCodePrefix;
	private String osdiOurCodePrefix;
	private String osdcOurCodePrefix;
	private String ojdcOurCodePrefix;
	private String outwardOurCodePrefix;
	private String isdiOurCodePrefix;
	private String inwardOurCodePrefix;

	public PrefixSetup() {	}

	public PrefixSetup(Long id, String createdClient, LocalDateTime createdDate, String createdUserId,
			String updatedUserId, LocalDateTime updatedDate, String financialYear, String itemOurCodePrefix,
			String vendorOurCodePrefix, String employeeOurCodePrefix, String rcrnOurCodePrefix,
			String pponOurCodePrefix, String rpanOurCodePrefix, String pdrnOurCodePrefix, String ospiOurCodePrefix,
			String osdiOurCodePrefix, String osdcOurCodePrefix, String ojdcOurCodePrefix, String outwardOurCodePrefix,
			String isdiOurCodePrefix, String inwardOurCodePrefix) {
		super();
		this.id = id;
		this.createdClient = createdClient;
		this.createdDate = createdDate;
		this.createdUserId = createdUserId;
		this.updatedUserId = updatedUserId;
		this.updatedDate = updatedDate;
		this.financialYear = financialYear;
		this.itemOurCodePrefix = itemOurCodePrefix;
		this.vendorOurCodePrefix = vendorOurCodePrefix;
		this.employeeOurCodePrefix = employeeOurCodePrefix;
		this.rcrnOurCodePrefix = rcrnOurCodePrefix;
		this.pponOurCodePrefix = pponOurCodePrefix;
		this.rpanOurCodePrefix = rpanOurCodePrefix;
		this.pdrnOurCodePrefix = pdrnOurCodePrefix;
		this.ospiOurCodePrefix = ospiOurCodePrefix;
		this.osdiOurCodePrefix = osdiOurCodePrefix;
		this.osdcOurCodePrefix = osdcOurCodePrefix;
		this.ojdcOurCodePrefix = ojdcOurCodePrefix;
		this.outwardOurCodePrefix = outwardOurCodePrefix;
		this.isdiOurCodePrefix = isdiOurCodePrefix;
		this.inwardOurCodePrefix = inwardOurCodePrefix;
	}

	@Override
	public String toString() {
		return "PrefixSetup [id=" + id + ", createdClient=" + createdClient + ", createdDate=" + createdDate
				+ ", createdUserId=" + createdUserId + ", updatedUserId=" + updatedUserId + ", updatedDate="
				+ updatedDate + ", financialYear=" + financialYear + ", itemOurCodePrefix=" + itemOurCodePrefix
				+ ", vendorOurCodePrefix=" + vendorOurCodePrefix + ", employeeOurCodePrefix=" + employeeOurCodePrefix
				+ ", rcrnOurCodePrefix=" + rcrnOurCodePrefix + ", pponOurCodePrefix=" + pponOurCodePrefix
				+ ", rpanOurCodePrefix=" + rpanOurCodePrefix + ", pdrnOurCodePrefix=" + pdrnOurCodePrefix
				+ ", ospiOurCodePrefix=" + ospiOurCodePrefix + ", osdiOurCodePrefix=" + osdiOurCodePrefix
				+ ", osdcOurCodePrefix=" + osdcOurCodePrefix + ", ojdcOurCodePrefix=" + ojdcOurCodePrefix
				+ ", outwardOurCodePrefix=" + outwardOurCodePrefix + ", isdiOurCodePrefix=" + isdiOurCodePrefix
				+ ", inwardOurCodePrefix=" + inwardOurCodePrefix + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedClient() {
		return createdClient;
	}

	public void setCreatedClient(String createdClient) {
		this.createdClient = createdClient;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedUserId() {
		return createdUserId;
	}

	public void setCreatedUserId(String createdUserId) {
		this.createdUserId = createdUserId;
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

	public String getFinancialYear() {
		return financialYear;
	}

	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}

	public String getItemOurCodePrefix() {
		return itemOurCodePrefix;
	}

	public void setItemOurCodePrefix(String itemOurCodePrefix) {
		this.itemOurCodePrefix = itemOurCodePrefix;
	}

	public String getVendorOurCodePrefix() {
		return vendorOurCodePrefix;
	}

	public void setVendorOurCodePrefix(String vendorOurCodePrefix) {
		this.vendorOurCodePrefix = vendorOurCodePrefix;
	}

	public String getEmployeeOurCodePrefix() {
		return employeeOurCodePrefix;
	}

	public void setEmployeeOurCodePrefix(String employeeOurCodePrefix) {
		this.employeeOurCodePrefix = employeeOurCodePrefix;
	}

	public String getRcrnOurCodePrefix() {
		return rcrnOurCodePrefix;
	}

	public void setRcrnOurCodePrefix(String rcrnOurCodePrefix) {
		this.rcrnOurCodePrefix = rcrnOurCodePrefix;
	}

	public String getPponOurCodePrefix() {
		return pponOurCodePrefix;
	}

	public void setPponOurCodePrefix(String pponOurCodePrefix) {
		this.pponOurCodePrefix = pponOurCodePrefix;
	}

	public String getRpanOurCodePrefix() {
		return rpanOurCodePrefix;
	}

	public void setRpanOurCodePrefix(String rpanOurCodePrefix) {
		this.rpanOurCodePrefix = rpanOurCodePrefix;
	}

	public String getPdrnOurCodePrefix() {
		return pdrnOurCodePrefix;
	}

	public void setPdrnOurCodePrefix(String pdrnOurCodePrefix) {
		this.pdrnOurCodePrefix = pdrnOurCodePrefix;
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

	public String getOjdcOurCodePrefix() {
		return ojdcOurCodePrefix;
	}

	public void setOjdcOurCodePrefix(String ojdcOurCodePrefix) {
		this.ojdcOurCodePrefix = ojdcOurCodePrefix;
	}

	public String getOutwardOurCodePrefix() {
		return outwardOurCodePrefix;
	}

	public void setOutwardOurCodePrefix(String outwardOurCodePrefix) {
		this.outwardOurCodePrefix = outwardOurCodePrefix;
	}

	public String getIsdiOurCodePrefix() {
		return isdiOurCodePrefix;
	}

	public void setIsdiOurCodePrefix(String isdiOurCodePrefix) {
		this.isdiOurCodePrefix = isdiOurCodePrefix;
	}

	public String getInwardOurCodePrefix() {
		return inwardOurCodePrefix;
	}

	public void setInwardOurCodePrefix(String inwardOurCodePrefix) {
		this.inwardOurCodePrefix = inwardOurCodePrefix;
	}

	
}
