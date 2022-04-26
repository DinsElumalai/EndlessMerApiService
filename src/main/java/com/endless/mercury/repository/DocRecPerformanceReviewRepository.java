package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.DocRecPerformanceReview;

@Repository
public interface DocRecPerformanceReviewRepository extends JpaRepository<DocRecPerformanceReview, Long>
{

	public DocRecPerformanceReview findByDocRecPerId(String docRecPerId);
	public DocRecPerformanceReview findTopByOrderByReviewIdDesc();
}
