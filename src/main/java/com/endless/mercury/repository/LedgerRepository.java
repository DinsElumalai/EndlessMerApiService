package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.Ledger;

@Repository
public interface LedgerRepository extends JpaRepository<Ledger, Long>
{
	public Ledger findByLedgerNameId(String nameId);
}
