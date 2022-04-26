package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>
{

	public Department findTopByOrderByDepartmentIdDesc();
}
