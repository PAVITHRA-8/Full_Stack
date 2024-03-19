package com.cts.springapp.repository;
import org.springframework.stereotype.Repository;

import com.cts.springapp.model.Register;

import org.springframework.data.jpa.repository.JpaRepository;



@Repository

public interface RegisterRepo extends JpaRepository<Register, Long> {
	 Register findByEmail(String email);
	 Register findByPhone(Long phone);
}
