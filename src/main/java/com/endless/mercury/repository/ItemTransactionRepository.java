package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.ItemTransaction;

@Repository
public interface ItemTransactionRepository extends JpaRepository<ItemTransaction, Long> {

}
