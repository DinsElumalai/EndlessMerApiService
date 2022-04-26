package com.endless.mercury.model;

import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "mry_mst_ledger")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class Ledger implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ledgerId;
	private String createdClient;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String updatedBy;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	private String ledgerName;
	private String ledgerNameId;
	private String ledgerDescription;
	private boolean active;
	private LocalDate inactiveDate;
	private String inactiveComments;
	
	public Ledger() {}

	public Ledger(long ledgerId, String createdClient, String createdBy, LocalDateTime createdDate, String updatedBy,
			LocalDateTime updatedDate, String ledgerName, String ledgerNameId, String ledgerDescription, boolean active,
			LocalDate inactiveDate, String inactiveComments) {
		super();
		this.ledgerId = ledgerId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.ledgerName = ledgerName;
		this.ledgerNameId = ledgerNameId;
		this.ledgerDescription = ledgerDescription;
		this.active = active;
		this.inactiveDate = inactiveDate;
		this.inactiveComments = inactiveComments;
	}

	@Override
	public String toString() {
		return "Ledger [ledgerId=" + ledgerId + ", createdClient=" + createdClient + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", ledgerName=" + ledgerName + ", ledgerNameId=" + ledgerNameId + ", ledgerDescription="
				+ ledgerDescription + ", active=" + active + ", inactiveDate=" + inactiveDate + ", inactiveComments="
				+ inactiveComments + "]";
	}

	public long getLedgerId() {
		return ledgerId;
	}

	public void setLedgerId(long ledgerId) {
		this.ledgerId = ledgerId;
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

	public String getLedgerName() {
		return ledgerName;
	}

	public void setLedgerName(String ledgerName) {
		this.ledgerName = ledgerName;
	}

	public String getLedgerNameId() {
		return ledgerNameId;
	}

	public void setLedgerNameId(String ledgerNameId) {
		this.ledgerNameId = ledgerNameId;
	}

	public String getLedgerDescription() {
		return ledgerDescription;
	}

	public void setLedgerDescription(String ledgerDescription) {
		this.ledgerDescription = ledgerDescription;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDate getInactiveDate() {
		return inactiveDate;
	}

	public void setInactiveDate(LocalDate inactiveDate) {
		this.inactiveDate = inactiveDate;
	}

	public String getInactiveComments() {
		return inactiveComments;
	}

	public void setInactiveComments(String inactiveComments) {
		this.inactiveComments = inactiveComments;
	}
	
	

}
