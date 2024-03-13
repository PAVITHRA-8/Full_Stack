package com.cts.app.AcService.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.app.AcService.dao.LoginDao;
import com.cts.app.AcService.dao.utility.AcServiceDaoUtility;
import com.cts.app.AcService.entity.Login;


public class LoginDaoImpl implements LoginDao{

Connection connection=AcServiceDaoUtility.getConnection();

public boolean createLogin(Login login) {
	boolean response=false;
	try {
		PreparedStatement ps =connection.prepareStatement("INSERT INTO login(id,name,password) VALUES(?,?,?)");
		ps.setInt(1,login.getId());
		ps.setString(2, login.getName());
		ps.setString(3, login.getPassword());
		int noOfRows=ps.executeUpdate();
		if(noOfRows>0) {
			response =true;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return response;
}
public List<Login> fetchLogin() {
	List<Login> loginsList=new ArrayList<>();
	try {
		PreparedStatement ps=connection.prepareStatement("SELECT * FROM login");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Login login=new Login(rs.getInt(1),rs.getString(2),rs.getString(3));
			loginsList.add(login);
		}
		return loginsList;
	}
	catch(SQLException e) {
		e.printStackTrace();
}
	return null;
}

}