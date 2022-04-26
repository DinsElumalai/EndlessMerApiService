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
@Table(name = "mry_mst_doc_rec_performance_txn_kpi")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class DocRecPerformanceKpi
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long kpiId;
	@Column
	private String createdClient;
	@Column
	private String createdBy;
	@Column(name = "created_date", updatable = false)
	@CreationTimestamp
	private LocalDateTime createdDate;
	@Column
	private String updatedBy;
	@Column(name = "updated_date", updatable = false)
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	@Column
	private String docRecPerId;
	@Column
	private String kpiFromMonthYear;
	@Column
	private String kpiFrequnecyMonth;
	@Column
	private String kpiUom;
	@Column
	private String kpiTargetValue;
	
	public DocRecPerformanceKpi() {}

	public DocRecPerformanceKpi(long kpiId, String createdClient, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate, String docRecPerId, String kpiFromMonthYear,
			String kpiFrequnecyMonth, String kpiUom, String kpiTargetValue) {
		super();
		this.kpiId = kpiId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.docRecPerId = docRecPerId;
		this.kpiFromMonthYear = kpiFromMonthYear;
		this.kpiFrequnecyMonth = kpiFrequnecyMonth;
		this.kpiUom = kpiUom;
		this.kpiTargetValue = kpiTargetValue;
	}

	@Override
	public String toString() {
		return "DocRecPerformanceKpi [kpiId=" + kpiId + ", createdClient=" + createdClient + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", docRecPerId=" + docRecPerId + ", kpiFromMonthYear=" + kpiFromMonthYear + ", kpiFrequnecyMonth="
				+ kpiFrequnecyMonth + ", kpiUom=" + kpiUom + ", kpiTargetValue=" + kpiTargetValue + "]";
	}

	public long getKpiId() {
		return kpiId;
	}

	public void setKpiId(long kpiId) {
		this.kpiId = kpiId;
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

	public String getDocRecPerId() {
		return docRecPerId;
	}

	public void setDocRecPerId(String docRecPerId) {
		this.docRecPerId = docRecPerId;
	}

	public String getKpiFromMonthYear() {
		return kpiFromMonthYear;
	}

	public void setKpiFromMonthYear(String kpiFromMonthYear) {
		this.kpiFromMonthYear = kpiFromMonthYear;
	}

	public String getKpiFrequnecyMonth() {
		return kpiFrequnecyMonth;
	}

	public void setKpiFrequnecyMonth(String kpiFrequnecyMonth) {
		this.kpiFrequnecyMonth = kpiFrequnecyMonth;
	}

	public String getKpiUom() {
		return kpiUom;
	}

	public void setKpiUom(String kpiUom) {
		this.kpiUom = kpiUom;
	}

	public String getKpiTargetValue() {
		return kpiTargetValue;
	}

	public void setKpiTargetValue(String kpiTargetValue) {
		this.kpiTargetValue = kpiTargetValue;
	}
	
	
}
