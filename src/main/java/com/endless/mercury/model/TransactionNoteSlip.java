package com.endless.mercury.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

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
@Table(name = "mry_txn_note_slip")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "updatedDate"}, allowGetters = true)
public class TransactionNoteSlip 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long noteSlipId;
	private String requisitionCategoryOurCode;
	private String transactionCategory;
	private String requisitionCategory;
	private LocalDate noteSlipDate;
	private String noteSlipShift;
	private String inchargeEmployeeId;
	private String operatorEmployeeId;
	private String machineItemId;
	private String productionCategory;
	private String partItemId;
	private String partStage;
	private String partStageNumber;
	private String receiptFromVendorId;
	private LocalDate receiptDate;
	private boolean fromShopfloor;
	private boolean rpSfp ;
	private boolean toStock;
	private String rawMaterialItemId;
	private String batchNo;
	private String issueCategory;
	private String issueToVendorId;
	private String requisitionGroupCategory;
	private String requisitionGroupNo;
	private String returnPartItemId;
	private String returnPartStage;
	private long returnPartStageNo;
	private double wtMcAverage1Gms;
	private double wtMcAverage2Gms;
	private double unitWtGms;
	private double stockNos;
	private double stockWt;
	private double openingNos;
	private double openingWt;
	private double okayNos;
	private double okayWt;
	private double rejectedNos;
	private double rejectedWt;
	private double takenNos;
	private double takenWt;
	private double directTakenNos;
	private double directTakenWt;
	private double pendingTakenNos;
	private double pendingTakenWt;
	private double adjustNos;
	private double adjustWt;
	private double mismatchNos;
	private double mismatchWt;
	private String rejectedReason;
	private String binLocation;
	private String remarks;
	private boolean isVerified;
	private String rcrnRefNoteSlipId;
	private String pponRefNoteSlipId;
	private String rpanRefNoteSlipId;
	private String pdrnRefNoteSlipId;
	private String createdClient;
	@CreationTimestamp
	private LocalDateTime createdDate;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	private String createdUserId;;
	private String updatedUserId;
	
	public TransactionNoteSlip() {}

	public TransactionNoteSlip(long noteSlipId, String requisitionCategoryOurCode, String transactionCategory,
			String requisitionCategory, LocalDate noteSlipDate, String noteSlipShift, String inchargeEmployeeId,
			String operatorEmployeeId, String machineItemId, String productionCategory, String partItemId,
			String partStage, String partStageNumber, String receiptFromVendorId, LocalDate receiptDate,
			boolean fromShopfloor, boolean rpSfp, boolean toStock, String rawMaterialItemId, String batchNo,
			String issueCategory, String issueToVendorId, String requisitionGroupCategory, String requisitionGroupNo,
			String returnPartItemId, String returnPartStage, long returnPartStageNo, double wtMcAverage1Gms,
			double wtMcAverage2Gms, double unitWtGms, double stockNos, double stockWt, double openingNos,
			double openingWt, double okayNos, double okayWt, double rejectedNos, double rejectedWt, double takenNos,
			double takenWt, double directTakenNos, double directTakenWt, double pendingTakenNos, double pendingTakenWt,
			double adjustNos, double adjustWt, double mismatchNos, double mismatchWt, String rejectedReason,
			String binLocation, String remarks, boolean isVerified, String rcrnRefNoteSlipId, String pponRefNoteSlipId,
			String rpanRefNoteSlipId, String pdrnRefNoteSlipId, String createdClient, LocalDateTime createdDate,
			LocalDateTime updatedDate, String createdUserId, String updatedUserId) {
		super();
		this.noteSlipId = noteSlipId;
		this.requisitionCategoryOurCode = requisitionCategoryOurCode;
		this.transactionCategory = transactionCategory;
		this.requisitionCategory = requisitionCategory;
		this.noteSlipDate = noteSlipDate;
		this.noteSlipShift = noteSlipShift;
		this.inchargeEmployeeId = inchargeEmployeeId;
		this.operatorEmployeeId = operatorEmployeeId;
		this.machineItemId = machineItemId;
		this.productionCategory = productionCategory;
		this.partItemId = partItemId;
		this.partStage = partStage;
		this.partStageNumber = partStageNumber;
		this.receiptFromVendorId = receiptFromVendorId;
		this.receiptDate = receiptDate;
		this.fromShopfloor = fromShopfloor;
		this.rpSfp = rpSfp;
		this.toStock = toStock;
		this.rawMaterialItemId = rawMaterialItemId;
		this.batchNo = batchNo;
		this.issueCategory = issueCategory;
		this.issueToVendorId = issueToVendorId;
		this.requisitionGroupCategory = requisitionGroupCategory;
		this.requisitionGroupNo = requisitionGroupNo;
		this.returnPartItemId = returnPartItemId;
		this.returnPartStage = returnPartStage;
		this.returnPartStageNo = returnPartStageNo;
		this.wtMcAverage1Gms = wtMcAverage1Gms;
		this.wtMcAverage2Gms = wtMcAverage2Gms;
		this.unitWtGms = unitWtGms;
		this.stockNos = stockNos;
		this.stockWt = stockWt;
		this.openingNos = openingNos;
		this.openingWt = openingWt;
		this.okayNos = okayNos;
		this.okayWt = okayWt;
		this.rejectedNos = rejectedNos;
		this.rejectedWt = rejectedWt;
		this.takenNos = takenNos;
		this.takenWt = takenWt;
		this.directTakenNos = directTakenNos;
		this.directTakenWt = directTakenWt;
		this.pendingTakenNos = pendingTakenNos;
		this.pendingTakenWt = pendingTakenWt;
		this.adjustNos = adjustNos;
		this.adjustWt = adjustWt;
		this.mismatchNos = mismatchNos;
		this.mismatchWt = mismatchWt;
		this.rejectedReason = rejectedReason;
		this.binLocation = binLocation;
		this.remarks = remarks;
		this.isVerified = isVerified;
		this.rcrnRefNoteSlipId = rcrnRefNoteSlipId;
		this.pponRefNoteSlipId = pponRefNoteSlipId;
		this.rpanRefNoteSlipId = rpanRefNoteSlipId;
		this.pdrnRefNoteSlipId = pdrnRefNoteSlipId;
		this.createdClient = createdClient;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.createdUserId = createdUserId;
		this.updatedUserId = updatedUserId;
	}

	@Override
	public String toString() {
		return "TransactionNoteSlip [noteSlipId=" + noteSlipId + ", requisitionCategoryOurCode="
				+ requisitionCategoryOurCode + ", transactionCategory=" + transactionCategory + ", requisitionCategory="
				+ requisitionCategory + ", noteSlipDate=" + noteSlipDate + ", noteSlipShift=" + noteSlipShift
				+ ", inchargeEmployeeId=" + inchargeEmployeeId + ", operatorEmployeeId=" + operatorEmployeeId
				+ ", machineItemId=" + machineItemId + ", productionCategory=" + productionCategory + ", partItemId="
				+ partItemId + ", partStage=" + partStage + ", partStageNumber=" + partStageNumber
				+ ", receiptFromVendorId=" + receiptFromVendorId + ", receiptDate=" + receiptDate + ", fromShopfloor="
				+ fromShopfloor + ", rpSfp=" + rpSfp + ", toStock=" + toStock + ", rawMaterialItemId="
				+ rawMaterialItemId + ", batchNo=" + batchNo + ", issueCategory=" + issueCategory + ", issueToVendorId="
				+ issueToVendorId + ", requisitionGroupCategory=" + requisitionGroupCategory + ", requisitionGroupNo="
				+ requisitionGroupNo + ", returnPartItemId=" + returnPartItemId + ", returnPartStage=" + returnPartStage
				+ ", returnPartStageNo=" + returnPartStageNo + ", wtMcAverage1Gms=" + wtMcAverage1Gms
				+ ", wtMcAverage2Gms=" + wtMcAverage2Gms + ", unitWtGms=" + unitWtGms + ", stockNos=" + stockNos
				+ ", stockWt=" + stockWt + ", openingNos=" + openingNos + ", openingWt=" + openingWt + ", okayNos="
				+ okayNos + ", okayWt=" + okayWt + ", rejectedNos=" + rejectedNos + ", rejectedWt=" + rejectedWt
				+ ", takenNos=" + takenNos + ", takenWt=" + takenWt + ", directTakenNos=" + directTakenNos
				+ ", directTakenWt=" + directTakenWt + ", pendingTakenNos=" + pendingTakenNos + ", pendingTakenWt="
				+ pendingTakenWt + ", adjustNos=" + adjustNos + ", adjustWt=" + adjustWt + ", mismatchNos="
				+ mismatchNos + ", mismatchWt=" + mismatchWt + ", rejectedReason=" + rejectedReason + ", binLocation="
				+ binLocation + ", remarks=" + remarks + ", isVerified=" + isVerified + ", rcrnRefNoteSlipId="
				+ rcrnRefNoteSlipId + ", pponRefNoteSlipId=" + pponRefNoteSlipId + ", rpanRefNoteSlipId="
				+ rpanRefNoteSlipId + ", pdrnRefNoteSlipId=" + pdrnRefNoteSlipId + ", createdClient=" + createdClient + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + ", createdUserId=" + createdUserId + ", updatedUserId="
				+ updatedUserId + "]";
	}

	public long getNoteSlipId() {
		return noteSlipId;
	}

	public void setNoteSlipId(long noteSlipId) {
		this.noteSlipId = noteSlipId;
	}

	public String getRequisitionCategoryOurCode() {
		return requisitionCategoryOurCode;
	}

	public void setRequisitionCategoryOurCode(String requisitionCategoryOurCode) {
		this.requisitionCategoryOurCode = requisitionCategoryOurCode;
	}

	public String getTransactionCategory() {
		return transactionCategory;
	}

	public void setTransactionCategory(String transactionCategory) {
		this.transactionCategory = transactionCategory;
	}

	public String getRequisitionCategory() {
		return requisitionCategory;
	}

	public void setRequisitionCategory(String requisitionCategory) {
		this.requisitionCategory = requisitionCategory;
	}

	public LocalDate getNoteSlipDate() {
		return noteSlipDate;
	}

	public void setNoteSlipDate(LocalDate noteSlipDate) {
		this.noteSlipDate = noteSlipDate;
	}

	public String getNoteSlipShift() {
		return noteSlipShift;
	}

	public void setNoteSlipShift(String noteSlipShift) {
		this.noteSlipShift = noteSlipShift;
	}

	public String getInchargeEmployeeId() {
		return inchargeEmployeeId;
	}

	public void setInchargeEmployeeId(String inchargeEmployeeId) {
		this.inchargeEmployeeId = inchargeEmployeeId;
	}

	public String getOperatorEmployeeId() {
		return operatorEmployeeId;
	}

	public void setOperatorEmployeeId(String operatorEmployeeId) {
		this.operatorEmployeeId = operatorEmployeeId;
	}

	public String getMachineItemId() {
		return machineItemId;
	}

	public void setMachineItemId(String machineItemId) {
		this.machineItemId = machineItemId;
	}

	public String getProductionCategory() {
		return productionCategory;
	}

	public void setProductionCategory(String productionCategory) {
		this.productionCategory = productionCategory;
	}

	public String getPartItemId() {
		return partItemId;
	}

	public void setPartItemId(String partItemId) {
		this.partItemId = partItemId;
	}

	public String getPartStage() {
		return partStage;
	}

	public void setPartStage(String partStage) {
		this.partStage = partStage;
	}

	public String getPartStageNumber() {
		return partStageNumber;
	}

	public void setPartStageNumber(String partStageNumber) {
		this.partStageNumber = partStageNumber;
	}

	public String getReceiptFromVendorId() {
		return receiptFromVendorId;
	}

	public void setReceiptFromVendorId(String receiptFromVendorId) {
		this.receiptFromVendorId = receiptFromVendorId;
	}

	public LocalDate getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(LocalDate receiptDate) {
		this.receiptDate = receiptDate;
	}

	public boolean isFromShopfloor() {
		return fromShopfloor;
	}

	public void setFromShopfloor(boolean fromShopfloor) {
		this.fromShopfloor = fromShopfloor;
	}

	public boolean isRpSfp() {
		return rpSfp;
	}

	public void setRpSfp(boolean rpSfp) {
		this.rpSfp = rpSfp;
	}

	public boolean isToStock() {
		return toStock;
	}

	public void setToStock(boolean toStock) {
		this.toStock = toStock;
	}

	public String getRawMaterialItemId() {
		return rawMaterialItemId;
	}

	public void setRawMaterialItemId(String rawMaterialItemId) {
		this.rawMaterialItemId = rawMaterialItemId;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getIssueCategory() {
		return issueCategory;
	}

	public void setIssueCategory(String issueCategory) {
		this.issueCategory = issueCategory;
	}

	public String getIssueToVendorId() {
		return issueToVendorId;
	}

	public void setIssueToVendorId(String issueToVendorId) {
		this.issueToVendorId = issueToVendorId;
	}

	public String getRequisitionGroupCategory() {
		return requisitionGroupCategory;
	}

	public void setRequisitionGroupCategory(String requisitionGroupCategory) {
		this.requisitionGroupCategory = requisitionGroupCategory;
	}

	public String getRequisitionGroupNo() {
		return requisitionGroupNo;
	}

	public void setRequisitionGroupNo(String requisitionGroupNo) {
		this.requisitionGroupNo = requisitionGroupNo;
	}

	public String getReturnPartItemId() {
		return returnPartItemId;
	}

	public void setReturnPartItemId(String returnPartItemId) {
		this.returnPartItemId = returnPartItemId;
	}

	public String getReturnPartStage() {
		return returnPartStage;
	}

	public void setReturnPartStage(String returnPartStage) {
		this.returnPartStage = returnPartStage;
	}

	public long getReturnPartStageNo() {
		return returnPartStageNo;
	}

	public void setReturnPartStageNo(long returnPartStageNo) {
		this.returnPartStageNo = returnPartStageNo;
	}

	public double getWtMcAverage1Gms() {
		return wtMcAverage1Gms;
	}

	public void setWtMcAverage1Gms(double wtMcAverage1Gms) {
		this.wtMcAverage1Gms = wtMcAverage1Gms;
	}

	public double getWtMcAverage2Gms() {
		return wtMcAverage2Gms;
	}

	public void setWtMcAverage2Gms(double wtMcAverage2Gms) {
		this.wtMcAverage2Gms = wtMcAverage2Gms;
	}

	public double getUnitWtGms() {
		return unitWtGms;
	}

	public void setUnitWtGms(double unitWtGms) {
		this.unitWtGms = unitWtGms;
	}

	public double getStockNos() {
		return stockNos;
	}

	public void setStockNos(double stockNos) {
		this.stockNos = stockNos;
	}

	public double getStockWt() {
		return stockWt;
	}

	public void setStockWt(double stockWt) {
		this.stockWt = stockWt;
	}

	public double getOpeningNos() {
		return openingNos;
	}

	public void setOpeningNos(double openingNos) {
		this.openingNos = openingNos;
	}

	public double getOpeningWt() {
		return openingWt;
	}

	public void setOpeningWt(double openingWt) {
		this.openingWt = openingWt;
	}

	public double getOkayNos() {
		return okayNos;
	}

	public void setOkayNos(double okayNos) {
		this.okayNos = okayNos;
	}

	public double getOkayWt() {
		return okayWt;
	}

	public void setOkayWt(double okayWt) {
		this.okayWt = okayWt;
	}

	public double getRejectedNos() {
		return rejectedNos;
	}

	public void setRejectedNos(double rejectedNos) {
		this.rejectedNos = rejectedNos;
	}

	public double getRejectedWt() {
		return rejectedWt;
	}

	public void setRejectedWt(double rejectedWt) {
		this.rejectedWt = rejectedWt;
	}

	public double getTakenNos() {
		return takenNos;
	}

	public void setTakenNos(double takenNos) {
		this.takenNos = takenNos;
	}

	public double getTakenWt() {
		return takenWt;
	}

	public void setTakenWt(double takenWt) {
		this.takenWt = takenWt;
	}

	public double getDirectTakenNos() {
		return directTakenNos;
	}

	public void setDirectTakenNos(double directTakenNos) {
		this.directTakenNos = directTakenNos;
	}

	public double getDirectTakenWt() {
		return directTakenWt;
	}

	public void setDirectTakenWt(double directTakenWt) {
		this.directTakenWt = directTakenWt;
	}

	public double getPendingTakenNos() {
		return pendingTakenNos;
	}

	public void setPendingTakenNos(double pendingTakenNos) {
		this.pendingTakenNos = pendingTakenNos;
	}

	public double getPendingTakenWt() {
		return pendingTakenWt;
	}

	public void setPendingTakenWt(double pendingTakenWt) {
		this.pendingTakenWt = pendingTakenWt;
	}

	public double getAdjustNos() {
		return adjustNos;
	}

	public void setAdjustNos(double adjustNos) {
		this.adjustNos = adjustNos;
	}

	public double getAdjustWt() {
		return adjustWt;
	}

	public void setAdjustWt(double adjustWt) {
		this.adjustWt = adjustWt;
	}

	public double getMismatchNos() {
		return mismatchNos;
	}

	public void setMismatchNos(double mismatchNos) {
		this.mismatchNos = mismatchNos;
	}

	public double getMismatchWt() {
		return mismatchWt;
	}

	public void setMismatchWt(double mismatchWt) {
		this.mismatchWt = mismatchWt;
	}

	public String getRejectedReason() {
		return rejectedReason;
	}

	public void setRejectedReason(String rejectedReason) {
		this.rejectedReason = rejectedReason;
	}

	public String getBinLocation() {
		return binLocation;
	}

	public void setBinLocation(String binLocation) {
		this.binLocation = binLocation;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public String getRcrnRefNoteSlipId() {
		return rcrnRefNoteSlipId;
	}

	public void setRcrnRefNoteSlipId(String rcrnRefNoteSlipId) {
		this.rcrnRefNoteSlipId = rcrnRefNoteSlipId;
	}

	public String getPponRefNoteSlipId() {
		return pponRefNoteSlipId;
	}

	public void setPponRefNoteSlipId(String pponRefNoteSlipId) {
		this.pponRefNoteSlipId = pponRefNoteSlipId;
	}

	public String getRpanRefNoteSlipId() {
		return rpanRefNoteSlipId;
	}

	public void setRpanRefNoteSlipId(String rpanRefNoteSlipId) {
		this.rpanRefNoteSlipId = rpanRefNoteSlipId;
	}

	public String getPdrnRefNoteSlipId() {
		return pdrnRefNoteSlipId;
	}

	public void setPdrnRefNoteSlipId(String pdrnRefNoteSlipId) {
		this.pdrnRefNoteSlipId = pdrnRefNoteSlipId;
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

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
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

	
		
}














