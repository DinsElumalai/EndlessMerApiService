package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.DocRecPerformanceFile;

@Repository
public interface DocRecPerformanceFileRepository extends JpaRepository<DocRecPerformanceFile, Long>
{

	public DocRecPerformanceFile findByDocRecPerId(String docRecPerId);
	public DocRecPerformanceFile findTopByOrderByFileIdDesc();
}
