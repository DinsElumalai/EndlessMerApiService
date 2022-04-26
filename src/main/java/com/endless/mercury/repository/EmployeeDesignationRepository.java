package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.EmployeeDesignation;

@Repository
public interface EmployeeDesignationRepository extends JpaRepository<EmployeeDesignation, Long>{

}
