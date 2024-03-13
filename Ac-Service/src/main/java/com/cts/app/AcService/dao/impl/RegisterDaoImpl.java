package com.cts.app.AcService.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.app.AcService.dao.LoginDao;
import com.cts.app.AcService.dao.RegisterDao;
import com.cts.app.AcService.dao.utility.AcServiceDaoUtility;
import com.cts.app.AcService.entity.Register;

public class RegisterDaoImpl implements RegisterDao{


Connection connection=AcServiceDaoUtility.getConnection();

public boolean createRegister(Register register) {
	boolean response=false;
	try {
		PreparedStatement ps =connection.prepareStatement("INSERT INTO register(customerid,name,email,phone,password) VALUES(?,?,?,?,?)");
		ps.setInt(1,register.getCustomerId());
		ps.setString(2,register.getName());
		ps.setString(3,register.getEmail());
		ps.setString(4,register.getPhone());
		ps.setString(5,register.getPassword());

		int noOfRows=ps.executeUpdate();
		if(noOfRows>0) {
			response =true;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return response;
}
public List<Register> fetchRegister() {
	List<Register> registersList=new ArrayList<>();
	try {
		PreparedStatement ps=connection.prepareStatement("SELECT * FROM register");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Register register=new Register(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			registersList.add(register);
		}
		return registersList;
	}
	catch(SQLException e) {
		e.printStackTrace();
}
	return null;
}

}