package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long>
{
	
	public Vendor findByVendorOurCode(String vendorOurCode);
	public Vendor findTopByOrderByVendorOurCodeDesc();
}
