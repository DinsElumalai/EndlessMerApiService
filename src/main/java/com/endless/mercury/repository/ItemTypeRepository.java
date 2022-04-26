package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.ItemType;

@Repository
public interface ItemTypeRepository extends JpaRepository<ItemType, Long>
{

	public ItemType findTopByOrderByItemTypeIdDesc();
}
