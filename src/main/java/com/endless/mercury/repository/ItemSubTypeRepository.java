package com.endless.mercury.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.Item;
import com.endless.mercury.model.ItemSubType;

@Repository
public interface ItemSubTypeRepository extends JpaRepository<ItemSubType, Long>
{

	public ItemSubType findTopByOrderByItemSubTypeIdDesc();
	
	public List<ItemSubType> findByItemTypeId(String itemTypeId);
}
