package com.endless.mercury.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.endless.mercury.exceptions.ResourceNotFoundException;
import com.endless.mercury.model.Employee;
import com.endless.mercury.model.PrefixSetup;
import com.endless.mercury.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmployeeController 
{
	@Autowired
    EmployeeRepository employeeRepository;

 // Get All Employees
    @GetMapping("/emp")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

 // Create a new Employee
    @PostMapping("/emp")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

 // Get a Single Employee
    @GetMapping("/emp/{id}")
    public Employee getEmployeeById(@PathVariable(value = "id") Long employeeId) {
        return employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "id", employeeId));
    }
    
 // Get a Single Employee our code
    @GetMapping("/empcode/{id}")
    public Employee getEmployeeByEymployeeOurCode(@PathVariable(value = "id") String employeeId) {
        return employeeRepository.findByEmployeeOurCode(employeeId);
    }
    
    //Get last record
    @GetMapping("/emplast")
    public Employee getLastEmployee()
    {
    	return employeeRepository.findTopByOrderByEmployeeOurCodeDesc();
    }
 // Delete a Employee
    @DeleteMapping("/emp/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable(value = "id") Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "id", employeeId));

        employeeRepository.delete(employee);

        return ResponseEntity.ok().build();

}
    
 // Update a Employee
    @PutMapping("/emp/{id}")
    public Employee updateEmployee(@PathVariable(value = "id") Long empId,
                                            @Valid @RequestBody Employee employeeDetails) {

        Employee employee = employeeRepository.findById(empId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "id", empId));

        employee.setComments(employeeDetails.getComments());
        employee.setDateOfBirth(employeeDetails.getDateOfBirth());
        employee.setDateOfJoining(employeeDetails.getDateOfJoining());
        employee.setDateOfResignation(employeeDetails.getDateOfResignation());
        employee.setDepartment(employeeDetails.getDepartment());
        employee.setDesignation(employeeDetails.getDesignation());
        employee.setEmpGroup(employeeDetails.getEmpGroup());
        employee.setEmployeeName(employeeDetails.getEmployeeName());
        employee.setEmployeeOurCode(employeeDetails.getEmployeeOurCode());
        employee.setEmployeeOurTypeCode(employeeDetails.getEmployeeOurTypeCode());
        employee.setEmployeeSubType(employeeDetails.getEmployeeSubType());
        employee.setEmployeeType(employeeDetails.getEmployeeType());
        employee.setImage(employeeDetails.getImage());
        employee.setFatherName(employeeDetails.getFatherName());
        employee.setCreatedClient(employeeDetails.getCreatedClient());
        employee.setEmployeeDuration(employeeDetails.getEmployeeDuration());
        employee.setResigned(employeeDetails.isResigned());
        employee.setTitle(employeeDetails.getTitle());
        employee.setUpdatedUserId(employeeDetails.getUpdatedUserId());
        employee.setVendorId(employeeDetails.getVendorId());

        Employee updatedEmployee = employeeRepository.save(employee);
        return updatedEmployee;
    }

}
