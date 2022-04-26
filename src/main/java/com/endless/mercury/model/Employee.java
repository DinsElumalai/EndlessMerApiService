package com.endless.mercury.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "mry_mst_employee")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;
	
	private String createdClient;
	
	private long employeeDuration;
	
	@Column(name = "created_user_id")
	private String createdUserId;
	
	@Column(name = "created_date", updatable = false)
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@Column(name = "updated_user_id")
	private String updatedUserId;
	
	@Column(name = "updated_date", updatable = false)
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	@Column(name = "employee_our_code")
	private String employeeOurCode;
	
	@Column(name = "employee_type")
	private String employeeType;
	
	@Column(name = "employee_sub_type")
	private String employeeSubType;
	
	@Column(name = "employee_our_type_code")
	private String employeeOurTypeCode;
	
	@Column(name = "emp_group")
	private String empGroup;
	
	@Column(name = "vendor_id")
	private String vendorId;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "father_name")
	private String fatherName;
	
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name = "date_of_joining")
	private LocalDate dateOfJoining;
	
	@Column(name = "image")
	private byte[] image;
	
	@Column(name = "resigned")
	private boolean resigned;
	
	@Column(name = "date_of_designation")
	private LocalDate dateOfResignation;
	
	@Column(name = "comments")
	private String comments;

	public Employee() {}

	public Employee(long employeeId, String createdClient, long employeeDuration, String createdUserId,
			LocalDateTime createdDate, String updatedUserId, LocalDateTime updatedDate, String employeeOurCode,
			String employeeType, String employeeSubType, String employeeOurTypeCode, String empGroup, String vendorId,
			String designation, String department, String title, String employeeName, String fatherName,
			LocalDate dateOfBirth, LocalDate dateOfJoining, byte[] image, boolean resigned, LocalDate dateOfResignation,
			String comments) {
		super();
		this.employeeId = employeeId;
		this.createdClient = createdClient;
		this.employeeDuration = employeeDuration;
		this.createdUserId = createdUserId;
		this.createdDate = createdDate;
		this.updatedUserId = updatedUserId;
		this.updatedDate = updatedDate;
		this.employeeOurCode = employeeOurCode;
		this.employeeType = employeeType;
		this.employeeSubType = employeeSubType;
		this.employeeOurTypeCode = employeeOurTypeCode;
		this.empGroup = empGroup;
		this.vendorId = vendorId;
		this.designation = designation;
		this.department = department;
		this.title = title;
		this.employeeName = employeeName;
		this.fatherName = fatherName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.image = image;
		this.resigned = resigned;
		this.dateOfResignation = dateOfResignation;
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", createdClient=" + createdClient + ", employeeDuration="
				+ employeeDuration + ", createdUserId=" + createdUserId + ", createdDate=" + createdDate
				+ ", updatedUserId=" + updatedUserId + ", updatedDate=" + updatedDate + ", employeeOurCode="
				+ employeeOurCode + ", employeeType=" + employeeType + ", employeeSubType=" + employeeSubType
				+ ", employeeOurTypeCode=" + employeeOurTypeCode + ", empGroup=" + empGroup + ", vendorId=" + vendorId
				+ ", designation=" + designation + ", department=" + department + ", title=" + title + ", employeeName="
				+ employeeName + ", fatherName=" + fatherName + ", dateOfBirth=" + dateOfBirth + ", dateOfJoining="
				+ dateOfJoining + ", image=" + Arrays.toString(image) + ", resigned=" + resigned
				+ ", dateOfResignation=" + dateOfResignation + ", comments=" + comments + "]";
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getCreatedClient() {
		return createdClient;
	}

	public void setCreatedClient(String createdClient) {
		this.createdClient = createdClient;
	}

	public long getEmployeeDuration() {
		return employeeDuration;
	}

	public void setEmployeeDuration(long employeeDuration) {
		this.employeeDuration = employeeDuration;
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

	public String getEmployeeOurCode() {
		return employeeOurCode;
	}

	public void setEmployeeOurCode(String employeeOurCode) {
		this.employeeOurCode = employeeOurCode;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getEmployeeSubType() {
		return employeeSubType;
	}

	public void setEmployeeSubType(String employeeSubType) {
		this.employeeSubType = employeeSubType;
	}

	public String getEmployeeOurTypeCode() {
		return employeeOurTypeCode;
	}

	public void setEmployeeOurTypeCode(String employeeOurTypeCode) {
		this.employeeOurTypeCode = employeeOurTypeCode;
	}

	public String getEmpGroup() {
		return empGroup;
	}

	public void setEmpGroup(String empGroup) {
		this.empGroup = empGroup;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public boolean isResigned() {
		return resigned;
	}

	public void setResigned(boolean resigned) {
		this.resigned = resigned;
	}

	public LocalDate getDateOfResignation() {
		return dateOfResignation;
	}

	public void setDateOfResignation(LocalDate dateOfResignation) {
		this.dateOfResignation = dateOfResignation;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
