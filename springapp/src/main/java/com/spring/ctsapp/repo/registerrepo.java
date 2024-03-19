package com.spring.ctsapp.repo;
import org.springframework.stereotype.Repository;

import com.spring.ctsapp.model.registermodel;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface registerrepo extends JpaRepository<registermodel, Long> {

    registermodel findByEmail(String email);

}
