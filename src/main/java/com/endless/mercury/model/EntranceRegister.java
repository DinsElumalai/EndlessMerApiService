package com.endless.mercury.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

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
@Table(name = "mry_txn_entrance_register")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class EntranceRegister 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long entranceRegId;
	
	@Column
	private String createdClient;
	@Column
	private String createdBy;
	@Column
	@CreationTimestamp
	private LocalDateTime createdDate;
	@Column
	private String updatedBy;
	@Column
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	@Column
	private String entranceRegisterOurCode;
	@Column
	private String registerType;
	@Column
	private LocalDate registerDate;
	@Column
	private String vehicleNo;
	@Column
	private String driverName;
	@Column
	private String vendorId;
	@Column
	private String vendorName;
	@Column
	private String personName;
	@Column
	private String employeeId;
	@Column
	private long contactNo1;
	@Column
	private long contactNo2;
	@Column
	private String address1;
	@Column
	private String address2;
	@Column
	private String entryCategory;
	@Column
	private LocalDateTime entryTime;
	@Column
	private LocalDateTime roundedEntryTime;
	@Column
	private String entryCreatedBy;
	@Column
	private LocalDateTime entryCreatedDate;
	@Column
	private String exitCategory;
	@Column
	private LocalDateTime exitTime;
	@Column
	private LocalDateTime roundedExitTime;
	@Column
	private String rdurationHrs;
	@Column
	private String rdurationMins;
	@Column
	private String exitCreatedBy;
	@Column
	private LocalDateTime exitCreatedDate;
	@Column
	private String purpose;
	@Column
	private String comments;
	@Column
	private String dinner;
	@Column
	private String breakfastM;
	@Column
	private String breakfastN;
	@Column
	private String lunch;
	@Column
	private long gloves;
	@Column
	private long snacks;
	@Column
	private boolean isVerified;
	@Column
	private String verifiedBy;
	
	public EntranceRegister()
	{
		
	}

	public EntranceRegister(long entranceRegId, String createdClient, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate, String entranceRegisterOurCode, String registerType,
			LocalDate registerDate, String vehicleNo, String driverName, String vendorId, String vendorName,
			String personName, String employeeId, long contactNo1, long contactNo2, String address1, String address2,
			String entryCategory, LocalDateTime entryTime, LocalDateTime roundedEntryTime, String entryCreatedBy,
			LocalDateTime entryCreatedDate, String exitCategory, LocalDateTime exitTime, LocalDateTime roundedExitTime,
			String rdurationHrs, String rdurationMins, String exitCreatedBy, LocalDateTime exitCreatedDate,
			String purpose, String comments, String dinner, String breakfastM, String breakfastN, String lunch,
			long gloves, long snacks, boolean isVerified, String verifiedBy) {
		super();
		this.entranceRegId = entranceRegId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.entranceRegisterOurCode = entranceRegisterOurCode;
		this.registerType = registerType;
		this.registerDate = registerDate;
		this.vehicleNo = vehicleNo;
		this.driverName = driverName;
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.personName = personName;
		this.employeeId = employeeId;
		this.contactNo1 = contactNo1;
		this.contactNo2 = contactNo2;
		this.address1 = address1;
		this.address2 = address2;
		this.entryCategory = entryCategory;
		this.entryTime = entryTime;
		this.roundedEntryTime = roundedEntryTime;
		this.entryCreatedBy = entryCreatedBy;
		this.entryCreatedDate = entryCreatedDate;
		this.exitCategory = exitCategory;
		this.exitTime = exitTime;
		this.roundedExitTime = roundedExitTime;
		this.rdurationHrs = rdurationHrs;
		this.rdurationMins = rdurationMins;
		this.exitCreatedBy = exitCreatedBy;
		this.exitCreatedDate = exitCreatedDate;
		this.purpose = purpose;
		this.comments = comments;
		this.dinner = dinner;
		this.breakfastM = breakfastM;
		this.breakfastN = breakfastN;
		this.lunch = lunch;
		this.gloves = gloves;
		this.snacks = snacks;
		this.isVerified = isVerified;
		this.verifiedBy = verifiedBy;
	}

	@Override
	public String toString() {
		return "EntranceRegister [entranceRegId=" + entranceRegId + ", createdClient=" + createdClient + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + ", entranceRegisterOurCode=" + entranceRegisterOurCode + ", registerType="
				+ registerType + ", registerDate=" + registerDate + ", vehicleNo=" + vehicleNo + ", driverName="
				+ driverName + ", vendorId=" + vendorId + ", vendorName=" + vendorName + ", personName=" + personName
				+ ", employeeId=" + employeeId + ", contactNo1=" + contactNo1 + ", contactNo2=" + contactNo2
				+ ", address1=" + address1 + ", address2=" + address2 + ", entryCategory=" + entryCategory
				+ ", entryTime=" + entryTime + ", roundedEntryTime=" + roundedEntryTime + ", entryCreatedBy="
				+ entryCreatedBy + ", entryCreatedDate=" + entryCreatedDate + ", exitCategory=" + exitCategory
				+ ", exitTime=" + exitTime + ", roundedExitTime=" + roundedExitTime + ", rdurationHrs=" + rdurationHrs
				+ ", rdurationMins=" + rdurationMins + ", exitCreatedBy=" + exitCreatedBy + ", exitCreatedDate="
				+ exitCreatedDate + ", purpose=" + purpose + ", comments=" + comments + ", dinner=" + dinner
				+ ", breakfastM=" + breakfastM + ", breakfastN=" + breakfastN + ", lunch=" + lunch + ", gloves="
				+ gloves + ", snacks=" + snacks + ", isVerified=" + isVerified + ", verifiedBy=" + verifiedBy + "]";
	}

	public long getEntranceRegId() {
		return entranceRegId;
	}

	public void setEntranceRegId(long entranceRegId) {
		this.entranceRegId = entranceRegId;
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

	public String getEntranceRegisterOurCode() {
		return entranceRegisterOurCode;
	}

	public void setEntranceRegisterOurCode(String entranceRegisterOurCode) {
		this.entranceRegisterOurCode = entranceRegisterOurCode;
	}

	public String getRegisterType() {
		return registerType;
	}

	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}

	public LocalDate getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public long getContactNo1() {
		return contactNo1;
	}

	public void setContactNo1(long contactNo1) {
		this.contactNo1 = contactNo1;
	}

	public long getContactNo2() {
		return contactNo2;
	}

	public void setContactNo2(long contactNo2) {
		this.contactNo2 = contactNo2;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getEntryCategory() {
		return entryCategory;
	}

	public void setEntryCategory(String entryCategory) {
		this.entryCategory = entryCategory;
	}

	public LocalDateTime getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}

	public LocalDateTime getRoundedEntryTime() {
		return roundedEntryTime;
	}

	public void setRoundedEntryTime(LocalDateTime roundedEntryTime) {
		this.roundedEntryTime = roundedEntryTime;
	}

	public String getEntryCreatedBy() {
		return entryCreatedBy;
	}

	public void setEntryCreatedBy(String entryCreatedBy) {
		this.entryCreatedBy = entryCreatedBy;
	}

	public LocalDateTime getEntryCreatedDate() {
		return entryCreatedDate;
	}

	public void setEntryCreatedDate(LocalDateTime entryCreatedDate) {
		this.entryCreatedDate = entryCreatedDate;
	}

	public String getExitCategory() {
		return exitCategory;
	}

	public void setExitCategory(String exitCategory) {
		this.exitCategory = exitCategory;
	}

	public LocalDateTime getExitTime() {
		return exitTime;
	}

	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}

	public LocalDateTime getRoundedExitTime() {
		return roundedExitTime;
	}

	public void setRoundedExitTime(LocalDateTime roundedExitTime) {
		this.roundedExitTime = roundedExitTime;
	}

	public String getRdurationHrs() {
		return rdurationHrs;
	}

	public void setRdurationHrs(String rdurationHrs) {
		this.rdurationHrs = rdurationHrs;
	}

	public String getRdurationMins() {
		return rdurationMins;
	}

	public void setRdurationMins(String rdurationMins) {
		this.rdurationMins = rdurationMins;
	}

	public String getExitCreatedBy() {
		return exitCreatedBy;
	}

	public void setExitCreatedBy(String exitCreatedBy) {
		this.exitCreatedBy = exitCreatedBy;
	}

	public LocalDateTime getExitCreatedDate() {
		return exitCreatedDate;
	}

	public void setExitCreatedDate(LocalDateTime exitCreatedDate) {
		this.exitCreatedDate = exitCreatedDate;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

	public String getBreakfastM() {
		return breakfastM;
	}

	public void setBreakfastM(String breakfastM) {
		this.breakfastM = breakfastM;
	}

	public String getBreakfastN() {
		return breakfastN;
	}

	public void setBreakfastN(String breakfastN) {
		this.breakfastN = breakfastN;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public long getGloves() {
		return gloves;
	}

	public void setGloves(long gloves) {
		this.gloves = gloves;
	}

	public long getSnacks() {
		return snacks;
	}

	public void setSnacks(long snacks) {
		this.snacks = snacks;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public String getVerifiedBy() {
		return verifiedBy;
	}

	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}
	
	
}
