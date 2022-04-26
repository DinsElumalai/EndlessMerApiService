package com.endless.mercury.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endless.mercury.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
	public Employee findByEmployeeOurCode(String empOurCode);
	public Employee findTopByOrderByEmployeeOurCodeDesc();
}
