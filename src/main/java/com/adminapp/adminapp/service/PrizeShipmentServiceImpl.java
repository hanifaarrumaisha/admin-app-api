package com.adminapp.adminapp.service;

import com.adminapp.adminapp.model.EPrizeShipmentStatus;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminapp.adminapp.dto.request.PrizeShipmentRequest;
import com.adminapp.adminapp.model.PrizeShipment;
import com.adminapp.adminapp.repository.PrizeShipmentRepository;

@Service
public class PrizeShipmentServiceImpl implements PrizeShipmentService{

	@Autowired
	PrizeShipmentRepository prizeShipmentRepository;
	
	@Override
	public List<PrizeShipment> getAllPrizeShipment() {
		return prizeShipmentRepository.findAll();
	}

	@Override
	public PrizeShipment save(PrizeShipmentRequest prizeShipmentRequest) {
		PrizeShipment prizeShipment = new PrizeShipment();
		prizeShipment.setAddress1(prizeShipmentRequest.getAddress1());
		prizeShipment.setAddress2(prizeShipmentRequest.getAddress2());
		prizeShipment.setCity(prizeShipmentRequest.getCity());
		prizeShipment.setCountry(prizeShipmentRequest.getCountry());
		prizeShipment.setPrizeName(prizeShipmentRequest.getPrizeName());
		prizeShipment.setShipmentStatus(prizeShipmentRequest.getShipmentStatus());
		prizeShipment.setState(prizeShipmentRequest.getState());
		prizeShipment.setSubscriberUserId(prizeShipmentRequest.getSubscriberUserId());
		prizeShipment.setZipCode(prizeShipmentRequest.getZipCode());
		return prizeShipmentRepository.save(prizeShipment);
	}

}
