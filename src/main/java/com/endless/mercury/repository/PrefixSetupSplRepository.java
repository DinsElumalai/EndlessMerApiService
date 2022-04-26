package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.PrefixSetupSpl;

@Repository
public interface PrefixSetupSplRepository extends JpaRepository<PrefixSetupSpl, Long>
{
	public PrefixSetupSpl findByVendorId(String id);
}
