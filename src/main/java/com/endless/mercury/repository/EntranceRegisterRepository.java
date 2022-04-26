package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.EntranceRegister;


@Repository
public interface EntranceRegisterRepository extends JpaRepository<EntranceRegister, Long>
{

	public EntranceRegister findByEntranceRegisterOurCode(String entranceRegisterOurCode);
	public EntranceRegister findTopByOrderByEntranceRegId();
	public EntranceRegister findTopByOrderByEntranceRegisterOurCode();
}
