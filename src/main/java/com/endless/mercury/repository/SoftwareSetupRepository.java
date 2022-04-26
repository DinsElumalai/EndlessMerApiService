package com.endless.mercury.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.endless.mercury.model.SoftwareSetup;


@Repository
public interface SoftwareSetupRepository extends JpaRepository<SoftwareSetup, Long>
{
	public SoftwareSetup findByConstantName(String constantName);
}
