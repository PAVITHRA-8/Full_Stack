package com.cts.app.AcService.dao;

import java.util.List;

import com.cts.app.AcService.entity.Repair;
public interface RepairDao {
	boolean createRepair(Repair repair);
	List<Repair> fetchRepair();
}

