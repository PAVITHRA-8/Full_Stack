package com.cts.app.AcService.dao.impl;
import com.cts.app.AcService.dao.utility.AcServiceDaoUtility;
import com.cts.app.AcService.entity.Employee;
import com.cts.app.AcService.dao.EmployeeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDaoImpl implements EmployeeDao{


Connection connection=AcServiceDaoUtility.getConnection();

public boolean createEmployee(Employee employee) {
	boolean response=false;
	try {
		PreparedStatement ps =connection.prepareStatement("INSERT INTO employee(id,name,email,phone) VALUES(?,?,?,?)");
		ps.setInt(1,employee.getId());
		ps.setString(2, employee.getName());
		ps.setString(3, employee.getEmail());
		ps.setString(4, employee.getPhone());
		int noOfRows=ps.executeUpdate();
		if(noOfRows>0) {
			response =true;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return response;
}
public List<Employee> fetchEmployee() {
	List<Employee> employeesList=new ArrayList<>();
	try {
		PreparedStatement ps=connection.prepareStatement("SELECT * FROM employee");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Employee employee=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			employeesList.add(employee);
		}
		return employeesList;
	}
	catch(SQLException e) {
		e.printStackTrace();
}
	return null;
}

}