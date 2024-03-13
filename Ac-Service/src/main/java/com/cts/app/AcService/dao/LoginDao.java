package com.cts.app.AcService.dao;

import java.util.List;

import com.cts.app.AcService.entity.Login;

public interface LoginDao {

	boolean createLogin(Login login);
	List<Login> fetchLogin();
}



