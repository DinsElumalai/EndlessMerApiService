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
@Table(name = "mry_txn_item_transaction")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class ItemTransaction implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemTransactionId;
	private String createdClient;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String updatedBy;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	private String transactionFrom;
	private String transactionFromId;
	private LocalDate transactionDate;
	private String vendorId;
	private String itemId;
	private String ProcessStageNo;
	private String uom;
	private String issueQtyInNos;
	private String issueQtyInKgs;
	private String receiptQtyInNos;
	private String receiptQtyInKgs;
	private String adjustQtyInNos;
	private String adjustQtyInKgs;
	private String adjustedBy;
	private LocalDate adjustedDate;
	private String reopeningQtyInNos;
	private String reopeningQtyInKgs;
	private String rclosingQtyInNos;
	private String rclosingQtyInKgs;
	private String vopeningQtyInNos;
	private String vopeningQtyInKgs;
	private String vclosingQtyInNos;
	private String vclosingQtyInKgs;
	
	public ItemTransaction() {}

	public ItemTransaction(long itemTransactionId, String createdClient, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate, String transactionFrom, String transactionFromId,
			LocalDate transactionDate, String vendorId, String itemId, String processStageNo, String uom,
			String issueQtyInNos, String issueQtyInKgs, String receiptQtyInNos, String receiptQtyInKgs,
			String adjustQtyInNos, String adjustQtyInKgs, String adjustedBy, LocalDate adjustedDate,
			String reopeningQtyInNos, String reopeningQtyInKgs, String rclosingQtyInNos, String rclosingQtyInKgs,
			String vopeningQtyInNos, String vopeningQtyInKgs, String vclosingQtyInNos, String vclosingQtyInKgs) {
		super();
		this.itemTransactionId = itemTransactionId;
		this.createdClient = createdClient;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.transactionFrom = transactionFrom;
		this.transactionFromId = transactionFromId;
		this.transactionDate = transactionDate;
		this.vendorId = vendorId;
		this.itemId = itemId;
		ProcessStageNo = processStageNo;
		this.uom = uom;
		this.issueQtyInNos = issueQtyInNos;
		this.issueQtyInKgs = issueQtyInKgs;
		this.receiptQtyInNos = receiptQtyInNos;
		this.receiptQtyInKgs = receiptQtyInKgs;
		this.adjustQtyInNos = adjustQtyInNos;
		this.adjustQtyInKgs = adjustQtyInKgs;
		this.adjustedBy = adjustedBy;
		this.adjustedDate = adjustedDate;
		this.reopeningQtyInNos = reopeningQtyInNos;
		this.reopeningQtyInKgs = reopeningQtyInKgs;
		this.rclosingQtyInNos = rclosingQtyInNos;
		this.rclosingQtyInKgs = rclosingQtyInKgs;
		this.vopeningQtyInNos = vopeningQtyInNos;
		this.vopeningQtyInKgs = vopeningQtyInKgs;
		this.vclosingQtyInNos = vclosingQtyInNos;
		this.vclosingQtyInKgs = vclosingQtyInKgs;
	}

	@Override
	public String toString() {
		return "ItemTransaction [itemTransactionId=" + itemTransactionId + ", createdClient=" + createdClient
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", transactionFrom=" + transactionFrom + ", transactionFromId="
				+ transactionFromId + ", transactionDate=" + transactionDate + ", vendorId=" + vendorId + ", itemId="
				+ itemId + ", ProcessStageNo=" + ProcessStageNo + ", uom=" + uom + ", issueQtyInNos=" + issueQtyInNos
				+ ", issueQtyInKgs=" + issueQtyInKgs + ", receiptQtyInNos=" + receiptQtyInNos + ", receiptQtyInKgs="
				+ receiptQtyInKgs + ", adjustQtyInNos=" + adjustQtyInNos + ", adjustQtyInKgs=" + adjustQtyInKgs
				+ ", adjustedBy=" + adjustedBy + ", adjustedDate=" + adjustedDate + ", reopeningQtyInNos="
				+ reopeningQtyInNos + ", reopeningQtyInKgs=" + reopeningQtyInKgs + ", rclosingQtyInNos="
				+ rclosingQtyInNos + ", rclosingQtyInKgs=" + rclosingQtyInKgs + ", vopeningQtyInNos=" + vopeningQtyInNos
				+ ", vopeningQtyInKgs=" + vopeningQtyInKgs + ", vclosingQtyInNos=" + vclosingQtyInNos
				+ ", vclosingQtyInKgs=" + vclosingQtyInKgs + "]";
	}

	public long getItemTransactionId() {
		return itemTransactionId;
	}

	public void setItemTransactionId(long itemTransactionId) {
		this.itemTransactionId = itemTransactionId;
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

	public String getTransactionFrom() {
		return transactionFrom;
	}

	public void setTransactionFrom(String transactionFrom) {
		this.transactionFrom = transactionFrom;
	}

	public String getTransactionFromId() {
		return transactionFromId;
	}

	public void setTransactionFromId(String transactionFromId) {
		this.transactionFromId = transactionFromId;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getProcessStageNo() {
		return ProcessStageNo;
	}

	public void setProcessStageNo(String processStageNo) {
		ProcessStageNo = processStageNo;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getIssueQtyInNos() {
		return issueQtyInNos;
	}

	public void setIssueQtyInNos(String issueQtyInNos) {
		this.issueQtyInNos = issueQtyInNos;
	}

	public String getIssueQtyInKgs() {
		return issueQtyInKgs;
	}

	public void setIssueQtyInKgs(String issueQtyInKgs) {
		this.issueQtyInKgs = issueQtyInKgs;
	}

	public String getReceiptQtyInNos() {
		return receiptQtyInNos;
	}

	public void setReceiptQtyInNos(String receiptQtyInNos) {
		this.receiptQtyInNos = receiptQtyInNos;
	}

	public String getReceiptQtyInKgs() {
		return receiptQtyInKgs;
	}

	public void setReceiptQtyInKgs(String receiptQtyInKgs) {
		this.receiptQtyInKgs = receiptQtyInKgs;
	}

	public String getAdjustQtyInNos() {
		return adjustQtyInNos;
	}

	public void setAdjustQtyInNos(String adjustQtyInNos) {
		this.adjustQtyInNos = adjustQtyInNos;
	}

	public String getAdjustQtyInKgs() {
		return adjustQtyInKgs;
	}

	public void setAdjustQtyInKgs(String adjustQtyInKgs) {
		this.adjustQtyInKgs = adjustQtyInKgs;
	}

	public String getAdjustedBy() {
		return adjustedBy;
	}

	public void setAdjustedBy(String adjustedBy) {
		this.adjustedBy = adjustedBy;
	}

	public LocalDate getAdjustedDate() {
		return adjustedDate;
	}

	public void setAdjustedDate(LocalDate adjustedDate) {
		this.adjustedDate = adjustedDate;
	}

	public String getReopeningQtyInNos() {
		return reopeningQtyInNos;
	}

	public void setReopeningQtyInNos(String reopeningQtyInNos) {
		this.reopeningQtyInNos = reopeningQtyInNos;
	}

	public String getReopeningQtyInKgs() {
		return reopeningQtyInKgs;
	}

	public void setReopeningQtyInKgs(String reopeningQtyInKgs) {
		this.reopeningQtyInKgs = reopeningQtyInKgs;
	}

	public String getRclosingQtyInNos() {
		return rclosingQtyInNos;
	}

	public void setRclosingQtyInNos(String rclosingQtyInNos) {
		this.rclosingQtyInNos = rclosingQtyInNos;
	}

	public String getRclosingQtyInKgs() {
		return rclosingQtyInKgs;
	}

	public void setRclosingQtyInKgs(String rclosingQtyInKgs) {
		this.rclosingQtyInKgs = rclosingQtyInKgs;
	}

	public String getVopeningQtyInNos() {
		return vopeningQtyInNos;
	}

	public void setVopeningQtyInNos(String vopeningQtyInNos) {
		this.vopeningQtyInNos = vopeningQtyInNos;
	}

	public String getVopeningQtyInKgs() {
		return vopeningQtyInKgs;
	}

	public void setVopeningQtyInKgs(String vopeningQtyInKgs) {
		this.vopeningQtyInKgs = vopeningQtyInKgs;
	}

	public String getVclosingQtyInNos() {
		return vclosingQtyInNos;
	}

	public void setVclosingQtyInNos(String vclosingQtyInNos) {
		this.vclosingQtyInNos = vclosingQtyInNos;
	}

	public String getVclosingQtyInKgs() {
		return vclosingQtyInKgs;
	}

	public void setVclosingQtyInKgs(String vclosingQtyInKgs) {
		this.vclosingQtyInKgs = vclosingQtyInKgs;
	}
	
	
	
}
