package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.DocRecPerformance;

@Repository
public interface DocRecPerformanceRepository extends JpaRepository<DocRecPerformance, Long>
{

	public DocRecPerformance findTopByOrderByDocRecPerformanceIdDesc();
}
