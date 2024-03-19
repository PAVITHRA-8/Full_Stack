package com.cts.springapp.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.springapp.model.Device;

@Repository
public interface DeviceRepo extends JpaRepository<Device,Long> {
}
