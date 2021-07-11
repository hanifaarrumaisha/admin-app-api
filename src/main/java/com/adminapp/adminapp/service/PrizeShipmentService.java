package com.adminapp.adminapp.service;

import java.util.List;

import javax.validation.Valid;

import com.adminapp.adminapp.dto.request.PrizeShipmentRequest;
import com.adminapp.adminapp.model.PrizeShipment;

public interface PrizeShipmentService {
	public List<PrizeShipment> getAllPrizeShipment();

	public PrizeShipment save(PrizeShipmentRequest prizeShipmentRequest);
}
