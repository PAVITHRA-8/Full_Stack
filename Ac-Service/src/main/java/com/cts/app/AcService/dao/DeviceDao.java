package com.cts.app.AcService.dao;

import java.util.List;

import com.cts.app.AcService.entity.Device;


public interface DeviceDao {
	boolean createDevice(Device device);
	List<Device> fetchDevice();
	

}
