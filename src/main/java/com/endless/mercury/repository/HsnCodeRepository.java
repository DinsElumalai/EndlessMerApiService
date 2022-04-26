package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.HsnCode;

@Repository
public interface HsnCodeRepository  extends JpaRepository<HsnCode, Long>
{
	public HsnCode findByHsnCode(String code);
}
