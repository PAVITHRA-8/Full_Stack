package com.cts.app.AcService.dao;

import java.util.List;
import com.cts.app.AcService.entity.Customer;
import com.cts.app.AcService.entity.Employee;
public interface CustomerDao {
	boolean createCustomer(Customer customer);
	List<Customer> fetchCustomer();
}
