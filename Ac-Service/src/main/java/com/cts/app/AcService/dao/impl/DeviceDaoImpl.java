package com.cts.app.AcService.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.app.AcService.dao.utility.AcServiceDaoUtility;
import com.cts.app.AcService.entity.Device;
import com.cts.app.AcService.dao.DeviceDao;


public class DeviceDaoImpl implements DeviceDao {

	Connection connection=AcServiceDaoUtility.getConnection();
	public boolean createDevice(Device device) {
		boolean response=false;
		try {
			PreparedStatement ps =connection.prepareStatement("INSERT INTO device(id,type,brand,model,problem) VALUES(?,?,?,?,?)");
			ps.setInt(1,device.getId());
			ps.setString(2,device.getType());
			ps.setString(3,device.getBrand());
			ps.setString(4,device.getModel());
			ps.setString(5,device.getProblem());
			int noOfRows=ps.executeUpdate();
			if(noOfRows>0) {
				response =true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return response;
	}

 
	public List<Device> fetchDevice() {
		List<Device> devicesList=new ArrayList<>();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM device");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Device device=new Device(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				devicesList.add(device);
			}
			return devicesList;
		}
		catch(SQLException e) {
			e.printStackTrace();
	}
		return null;
}



}