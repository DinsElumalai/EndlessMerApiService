package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.DocRecPerformanceRevision;

@Repository
public interface DocRecPerformanceRevisionRepository extends JpaRepository<DocRecPerformanceRevision, Long>
{

	public DocRecPerformanceRevision findByDocRecPerId(String docRecPerId);
	public DocRecPerformanceRevision findTopByOrderByRevisionIdDesc();
}

