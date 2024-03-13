package com.cts.app.AcService.dao;

import java.util.List;

import com.cts.app.AcService.entity.Register;

public interface RegisterDao {
	boolean createRegister(Register register);
	List<Register> fetchRegister();

}

