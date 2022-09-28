package com.endless.mercury.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.ItemDocument;

@Repository
public interface ItemDocumentRepository extends JpaRepository<ItemDocument, Long>{

	public List<ItemDocument> findAllByDocumentOurCode(String docOurCode);
}
