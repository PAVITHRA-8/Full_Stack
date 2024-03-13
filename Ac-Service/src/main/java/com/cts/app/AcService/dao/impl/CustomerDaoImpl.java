package com.cts.app.AcService.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.app.AcService.dao.utility.AcServiceDaoUtility;
import com.cts.app.AcService.entity.Customer;
import com.cts.app.AcService.dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao{


Connection connection=AcServiceDaoUtility.getConnection();

public boolean createCustomer(Customer customer) {
	boolean response=false;
	try {
		PreparedStatement ps =connection.prepareStatement("INSERT INTO customer(id,name,email,phone) VALUES(?,?,?,?)");
		ps.setInt(1,customer.getId());
		ps.setString(2, customer.getName());
		ps.setString(3, customer.getEmail());
		ps.setString(4, customer.getPhone());
		int noOfRows=ps.executeUpdate();
		if(noOfRows>0) {
			response =true;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return response;
}
public List<Customer> fetchCustomer() {
	List<Customer> customersList=new ArrayList<>();
	try {
		PreparedStatement ps=connection.prepareStatement("SELECT * FROM customer");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Customer customer=new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			customersList.add(customer);
		}
		return customersList;
	}
	catch(SQLException e) {
		e.printStackTrace();
}
	return null;
}

}