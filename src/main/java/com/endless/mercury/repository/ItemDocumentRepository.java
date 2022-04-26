package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.ItemDocument;

@Repository
public interface ItemDocumentRepository extends JpaRepository<ItemDocument, Long>{

}
