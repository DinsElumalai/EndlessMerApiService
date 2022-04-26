package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.DocRecPerformanceResponsibility;

@Repository
public interface DocRecPerformanceResponsibilityRepository extends JpaRepository<DocRecPerformanceResponsibility, Long>
{

	public DocRecPerformanceResponsibility findByDocRecPerId(String docRecPerId);
	public DocRecPerformanceResponsibility findTopByOrderByResponsibilityIdDesc();
}
