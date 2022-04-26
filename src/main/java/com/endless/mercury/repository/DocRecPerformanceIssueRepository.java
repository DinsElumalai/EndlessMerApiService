package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.DocRecPerformanceIssue;

@Repository
public interface DocRecPerformanceIssueRepository extends JpaRepository<DocRecPerformanceIssue, Long>
{

	public DocRecPerformanceIssue findByDocRecPerId(String docRecPerId);
	public DocRecPerformanceIssue findTopByOrderByIssueIdDesc();
	
}
