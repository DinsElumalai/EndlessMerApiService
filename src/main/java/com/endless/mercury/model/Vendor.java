package com.endless.mercury.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "mry_mst_vendor")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class Vendor 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "vendor_id")
	private long vendorId;
	
	private String createdClient;
	
	private long priority;
	
	@Column( name = "created_user_id")
	private String createdUserId;
	
	@Column( name = "created_date")
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@Column( name = "updated_user_id")
	private String updatedUserId;
	
	@Column( name = "updated_date")
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	@Column( name = "vendor_our_code")
	private String vendorOurCode;
	
	@Column( name = "vendor_name")
	private String vendorName;
	
	@Column( name = "vendor_name_ac")
	private String vendorNameAc;
	
	@Column( name = "vendor_name_id")
	private String vendorNameId;
	
	@Column( name = "vendor_given_code")
	private String vendorGivenCode;
	
	@Column( name = "vendor_type")
	private String vendorType;
	
	@Column( name = "vendor_sub_type")
	private String vendorSubType;
	
	@Column( name = "vendor_our_type_code")
	private String vendorOurTypeCode;
	
	@Column( name = "sales")
	private boolean sales;
	
	@Column( name = "purchase")
	private boolean purchase;
	
	@Column( name = "job_work")
	private boolean jobWork;
	
	@Column( name = "transporter")
	private boolean transporter;
	
	@Column( name = "manpower")
	private boolean manPower;
	
	@Column( name = "address1")
	private String address1;
	
	@Column( name = "address2")
	private String address2;
	
	@Column( name = "adress3")
	private String address3;
	
	@Column( name = "country")
	private String country;
	
	@Column( name = "state")
	private String state;
	
	@Column( name = "city")
	private String city;
	
	@Column( name = "pincode")
	private String pincode;
	
	@Column( name = "comments")
	private String comments;
	
	@Column( name = "gstin")
	private String gstin;
	
	@Column( name = "registered_date")
	private LocalDate registeredate;
	
	@Column( name = "active")
	private boolean active;
	
	@Column( name = "inactivated_date")
	private LocalDate inActivatedDate;
	
	
	public Vendor() {}


	public Vendor(long vendorId, String createdClient, long priority, String createdUserId, LocalDateTime createdDate,
			String updatedUserId, LocalDateTime updatedDate, String vendorOurCode, String vendorName,
			String vendorNameAc, String vendorNameId, String vendorGivenCode, String vendorType, String vendorSubType,
			String vendorOurTypeCode, boolean sales, boolean purchase, boolean jobWork, boolean transporter,
			boolean manPower, String address1, String address2, String address3, String country, String state,
			String city, String pincode, String comments, String gstin, LocalDate registeredate, boolean active,
			LocalDate inActivatedDate) {
		super();
		this.vendorId = vendorId;
		this.createdClient = createdClient;
		this.priority = priority;
		this.createdUserId = createdUserId;
		this.createdDate = createdDate;
		this.updatedUserId = updatedUserId;
		this.updatedDate = updatedDate;
		this.vendorOurCode = vendorOurCode;
		this.vendorName = vendorName;
		this.vendorNameAc = vendorNameAc;
		this.vendorNameId = vendorNameId;
		this.vendorGivenCode = vendorGivenCode;
		this.vendorType = vendorType;
		this.vendorSubType = vendorSubType;
		this.vendorOurTypeCode = vendorOurTypeCode;
		this.sales = sales;
		this.purchase = purchase;
		this.jobWork = jobWork;
		this.transporter = transporter;
		this.manPower = manPower;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.comments = comments;
		this.gstin = gstin;
		this.registeredate = registeredate;
		this.active = active;
		this.inActivatedDate = inActivatedDate;
	}


	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", createdClient=" + createdClient + ", priority=" + priority
				+ ", createdUserId=" + createdUserId + ", createdDate=" + createdDate + ", updatedUserId="
				+ updatedUserId + ", updatedDate=" + updatedDate + ", vendorOurCode=" + vendorOurCode + ", vendorName="
				+ vendorName + ", vendorNameAc=" + vendorNameAc + ", vendorNameId=" + vendorNameId
				+ ", vendorGivenCode=" + vendorGivenCode + ", vendorType=" + vendorType + ", vendorSubType="
				+ vendorSubType + ", vendorOurTypeCode=" + vendorOurTypeCode + ", sales=" + sales + ", purchase="
				+ purchase + ", jobWork=" + jobWork + ", transporter=" + transporter + ", manPower=" + manPower
				+ ", address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + ", country="
				+ country + ", state=" + state + ", city=" + city + ", pincode=" + pincode + ", comments=" + comments
				+ ", gstin=" + gstin + ", registeredate=" + registeredate + ", active=" + active + ", inActivatedDate="
				+ inActivatedDate + "]";
	}


	public long getVendorId() {
		return vendorId;
	}


	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}


	public String getCreatedClient() {
		return createdClient;
	}


	public void setCreatedClient(String createdClient) {
		this.createdClient = createdClient;
	}


	public long getPriority() {
		return priority;
	}


	public void setPriority(long priority) {
		this.priority = priority;
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


	public String getVendorOurCode() {
		return vendorOurCode;
	}


	public void setVendorOurCode(String vendorOurCode) {
		this.vendorOurCode = vendorOurCode;
	}


	public String getVendorName() {
		return vendorName;
	}


	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}


	public String getVendorNameAc() {
		return vendorNameAc;
	}


	public void setVendorNameAc(String vendorNameAc) {
		this.vendorNameAc = vendorNameAc;
	}


	public String getVendorNameId() {
		return vendorNameId;
	}


	public void setVendorNameId(String vendorNameId) {
		this.vendorNameId = vendorNameId;
	}


	public String getVendorGivenCode() {
		return vendorGivenCode;
	}


	public void setVendorGivenCode(String vendorGivenCode) {
		this.vendorGivenCode = vendorGivenCode;
	}


	public String getVendorType() {
		return vendorType;
	}


	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}


	public String getVendorSubType() {
		return vendorSubType;
	}


	public void setVendorSubType(String vendorSubType) {
		this.vendorSubType = vendorSubType;
	}


	public String getVendorOurTypeCode() {
		return vendorOurTypeCode;
	}


	public void setVendorOurTypeCode(String vendorOurTypeCode) {
		this.vendorOurTypeCode = vendorOurTypeCode;
	}


	public boolean isSales() {
		return sales;
	}


	public void setSales(boolean sales) {
		this.sales = sales;
	}


	public boolean isPurchase() {
		return purchase;
	}


	public void setPurchase(boolean purchase) {
		this.purchase = purchase;
	}


	public boolean isJobWork() {
		return jobWork;
	}


	public void setJobWork(boolean jobWork) {
		this.jobWork = jobWork;
	}


	public boolean isTransporter() {
		return transporter;
	}


	public void setTransporter(boolean transporter) {
		this.transporter = transporter;
	}


	public boolean isManPower() {
		return manPower;
	}


	public void setManPower(boolean manPower) {
		this.manPower = manPower;
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


	public String getAddress3() {
		return address3;
	}


	public void setAddress3(String address3) {
		this.address3 = address3;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public String getGstin() {
		return gstin;
	}


	public void setGstin(String gstin) {
		this.gstin = gstin;
	}


	public LocalDate getRegisteredate() {
		return registeredate;
	}


	public void setRegisteredate(LocalDate registeredate) {
		this.registeredate = registeredate;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public LocalDate getInActivatedDate() {
		return inActivatedDate;
	}


	public void setInActivatedDate(LocalDate inActivatedDate) {
		this.inActivatedDate = inActivatedDate;
	}


	
	
	
	
	
}
