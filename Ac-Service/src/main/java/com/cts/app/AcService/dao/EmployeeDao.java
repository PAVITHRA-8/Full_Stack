package com.cts.app.AcService.dao;

import java.util.List;

import com.cts.app.AcService.entity.Employee;


public interface EmployeeDao {
	boolean createEmployee(Employee employee);
	List<Employee> fetchEmployee();
}
