package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.ItemOrderSchedule;

@Repository
public interface ItemOrderScheduleRepository extends JpaRepository<ItemOrderSchedule, Long> {
	

}
