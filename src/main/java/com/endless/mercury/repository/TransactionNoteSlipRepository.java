package com.endless.mercury.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.endless.mercury.model.TransactionNoteSlip;

public interface TransactionNoteSlipRepository extends JpaRepository<TransactionNoteSlip, Long>
{

	public TransactionNoteSlip findByRequisitionCategoryOurCode(String rcoCode);
	
	public TransactionNoteSlip findFirstByPartItemIdAndIssueToVendorIdAndRequisitionCategoryOrderByNoteSlipIdDesc(String partItemId, String issueTo, String requisitionCategoryOurCOde);
	public TransactionNoteSlip findFirstByPartItemIdAndPartStageAndRequisitionCategoryOrderByNoteSlipIdDesc(String partItemId, String partStage, String requisitionCategoryOurCOde);
	public TransactionNoteSlip findFirstByRequisitionCategoryOrderByNoteSlipIdDesc(String reqCode);
	public TransactionNoteSlip findFirstByReturnPartItemIdAndIssueToVendorIdAndRequisitionCategoryOrderByNoteSlipIdDesc(String returnPartItemId, String issueTo, String reqCatcode);
	//public TransactionNoteSlip findFirstByPartItemIdAndIssueToVendorIdAndRequisitionCategoryOrderByNoteSlipIdDesc(String partItemId, String receiptFrom, String reqCat);
	public TransactionNoteSlip findFirstByPartItemIdAndPartStageAndIssueToVendorIdAndRequisitionCategoryOrderByNoteSlipIdDesc(String partItemId, String partStage, String issueTo, String reqCat);
	public List<TransactionNoteSlip> findByRequisitionCategory(String reqCatCode);
	
}
