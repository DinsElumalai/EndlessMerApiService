package com.endless.mercury.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.Item;
import com.endless.mercury.model.ItemOrder;

@Repository
public interface ItemOrderRepository extends JpaRepository<ItemOrder, Long> 
{

	public List<ItemOrder> findByOrderToVendorId(String id);
	public List<ItemOrder> findByItemId(String id);
}
