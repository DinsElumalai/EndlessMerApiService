package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.Process;

@Repository
public interface ProcessRepository extends JpaRepository<Process, Long>
{
	public Process findByProcessNameId(String code);
}
