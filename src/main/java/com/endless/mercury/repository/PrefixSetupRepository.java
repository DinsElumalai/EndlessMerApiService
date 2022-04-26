package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.PrefixSetup;


@Repository
public interface PrefixSetupRepository extends JpaRepository<PrefixSetup, Long> {

	
	public PrefixSetup findTopByOrderByIdDesc();
}
