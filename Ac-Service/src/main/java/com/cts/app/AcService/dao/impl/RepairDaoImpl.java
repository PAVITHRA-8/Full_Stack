package com.cts.app.AcService.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.app.AcService.dao.utility.AcServiceDaoUtility;
import com.cts.app.AcService.entity.Repair;
import com.cts.app.AcService.dao.RepairDao;


public class RepairDaoImpl implements RepairDao {
	

Connection connection=AcServiceDaoUtility.getConnection();

public boolean createRepair(Repair repair) {
	boolean response=false;
	try {
		PreparedStatement ps =connection.prepareStatement("INSERT INTO repair(id,type,brand,model,description,status) VALUES(?,?,?,?,?,?)");
		ps.setInt(1,repair.getId());
		ps.setString(2, repair.getType());
		ps.setString(3, repair.getBrand());
		ps.setString(4, repair.getModel());
		ps.setString(5, repair.getDescription());
		ps.setString(6, repair.getStatus());
		int noOfRows=ps.executeUpdate();
		if(noOfRows>0) {
			response =true;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return response;
}
public List<Repair> fetchRepair() {
	List<Repair> repairsList=new ArrayList<>();
	try {
		PreparedStatement ps=connection.prepareStatement("SELECT * FROM repair");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Repair repair=new Repair(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			repairsList.add(repair);
		}
		return repairsList;
	}
	catch(SQLException e) {
		e.printStackTrace();
}
	return null;
}

}

