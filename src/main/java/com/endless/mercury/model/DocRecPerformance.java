package com.endless.mercury.model;

import java.time.LocalDate;
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
@Table(name = "mry_mst_doc_rec_performance")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class DocRecPerformance 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long docRecPerformanceId;
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
	private String type;
	@Column
	private String typeDepartmentName;
	@Column
	private String typeNo;
	@Column
	private String typePurpose;
	@Column
	private LocalDate implementedOn;
	@Column
	private String implementedBy;
	@Column
	private String fileLocation;
	@Column
	private boolean kpiRequired;
	@Column
	private String kpiValueMustBe;
	@Column
	private String retensionMonth;
	@Column
	private String retainedLocation;
	@Column
	private boolean isActive;
	@Column
	private LocalDate inActivatedDate;
	@Column
	private String inActivatedComments;
	
	public DocRecPerformance() {}

	public DocRecPerformance(long docRecPerformanceId, String createdClient, String createdBy,
			LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate, String type,
			String typeDepartmentName, String typeNo, String typePurpose, LocalDate implementedOn,
			String implementedBy, String fileLocation, boolean kpiRequired, String kpiValueMustBe,
			String retensionMonth, String retainedLocation, boolean isActive, LocalDate inActivatedDate,
			String inActivatedComments) {
		super();
		this.docRecPerformanceId = docRecPerformanceId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.type = type;
		this.typeDepartmentName = typeDepartmentName;
		this.typeNo = typeNo;
		this.typePurpose = typePurpose;
		this.implementedOn = implementedOn;
		this.implementedBy = implementedBy;
		this.fileLocation = fileLocation;
		this.kpiRequired = kpiRequired;
		this.kpiValueMustBe = kpiValueMustBe;
		this.retensionMonth = retensionMonth;
		this.retainedLocation = retainedLocation;
		this.isActive = isActive;
		this.inActivatedDate = inActivatedDate;
		this.inActivatedComments = inActivatedComments;
	}

	@Override
	public String toString() {
		return "DocRecPerformance [docRecPerformanceId=" + docRecPerformanceId + ", createdClient=" + createdClient
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", type=" + type + ", typeDepartmentName=" + typeDepartmentName
				+ ", typeNo=" + typeNo + ", typePurpose=" + typePurpose + ", implementedOn=" + implementedOn
				+ ", implementedBy=" + implementedBy + ", fileLocation=" + fileLocation + ", kpiRequired="
				+ kpiRequired + ", kpiValueMustBe=" + kpiValueMustBe + ", retensionMonth=" + retensionMonth
				+ ", retainedLocation=" + retainedLocation + ", isActive=" + isActive + ", inActivatedDate="
				+ inActivatedDate + ", inActivatedComments=" + inActivatedComments + "]";
	}

	public long getDocRecPerformanceId() {
		return docRecPerformanceId;
	}

	public void setDocRecPerformanceId(long docRecPerformanceId) {
		this.docRecPerformanceId = docRecPerformanceId;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeDepartmentName() {
		return typeDepartmentName;
	}

	public void setTypeDepartmentName(String typeDepartmentName) {
		this.typeDepartmentName = typeDepartmentName;
	}

	public String getTypeNo() {
		return typeNo;
	}

	public void setTypeNo(String typeNo) {
		this.typeNo = typeNo;
	}

	public String getTypePurpose() {
		return typePurpose;
	}

	public void setTypePurpose(String typePurpose) {
		this.typePurpose = typePurpose;
	}

	public LocalDate getImplementedOn() {
		return implementedOn;
	}

	public void setImplementedOn(LocalDate implementedOn) {
		this.implementedOn = implementedOn;
	}

	public String getImplementedBy() {
		return implementedBy;
	}

	public void setImplementedBy(String implementedBy) {
		this.implementedBy = implementedBy;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public boolean isKpiRequired() {
		return kpiRequired;
	}

	public void setKpiRequired(boolean isKpiRequired) {
		this.kpiRequired = isKpiRequired;
	}

	public String getKpiValueMustBe() {
		return kpiValueMustBe;
	}

	public void setKpiValueMustBe(String kpiValueustBe) {
		this.kpiValueMustBe = kpiValueustBe;
	}

	public String getRetensionMonth() {
		return retensionMonth;
	}

	public void setRetensionMonth(String retensionMonth) {
		this.retensionMonth = retensionMonth;
	}

	public String getRetainedLocation() {
		return retainedLocation;
	}

	public void setRetainedLocation(String retainedLocation) {
		this.retainedLocation = retainedLocation;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public LocalDate getInActivatedDate() {
		return inActivatedDate;
	}

	public void setInActivatedDate(LocalDate inActivatedDate) {
		this.inActivatedDate = inActivatedDate;
	}

	public String getInActivatedComments() {
		return inActivatedComments;
	}

	public void setInActivatedComments(String inActivatedComments) {
		this.inActivatedComments = inActivatedComments;
	}
	
	
}
