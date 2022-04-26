package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.ItemReptSeqVndr;

@Repository
public interface ItemReptSeqVndrRepository extends JpaRepository<ItemReptSeqVndr, Long>
{

}
