package com.endless.mercury.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.Item;


@Repository
public interface ItemRepository extends JpaRepository<Item, Long>
{

	public Item findByItemOurCode(String itemOurCode);
	public Item findTopByOrderByItemIdDesc();
	
	public Item findTopByItemSubTypeIdOrderByItemOurTypeCodeDesc(String itemSubTypeId);
}
