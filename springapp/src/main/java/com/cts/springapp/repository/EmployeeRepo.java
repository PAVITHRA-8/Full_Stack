package com.cts.springapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.springapp.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}