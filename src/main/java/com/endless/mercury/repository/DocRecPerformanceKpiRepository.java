package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.DocRecPerformanceKpi;

@Repository
public interface DocRecPerformanceKpiRepository extends JpaRepository<DocRecPerformanceKpi, Long>
{

	public DocRecPerformanceKpi findByDocRecPerId(String docRecPerId);
	public DocRecPerformanceKpi findTopByOrderByKpiIdDesc();
}
