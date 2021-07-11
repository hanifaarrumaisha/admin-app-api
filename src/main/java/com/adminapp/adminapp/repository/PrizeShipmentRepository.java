package com.adminapp.adminapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adminapp.adminapp.model.PrizeShipment;
import com.adminapp.adminapp.model.Product;

@Repository
public interface PrizeShipmentRepository extends JpaRepository<PrizeShipment, Integer> {
	
}
