package com.adminapp.adminapp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adminapp.adminapp.dto.request.PrizeShipmentRequest;
import com.adminapp.adminapp.dto.request.SignupRequest;
import com.adminapp.adminapp.dto.response.MessageResponse;
import com.adminapp.adminapp.model.PrizeShipment;
import com.adminapp.adminapp.service.PrizeShipmentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true", maxAge = 3600)
@RequestMapping("/api/prizeshipments")
public class PrizeShipmentController {
	@Autowired
	PrizeShipmentService prizeShipmentService;
	
	@GetMapping("")
	public ResponseEntity<?> getAll(){
		List<PrizeShipment> prizeShipments = prizeShipmentService.getAllPrizeShipment();
		if ( prizeShipments != null) { 
			return ResponseEntity.ok(prizeShipments);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("")
	@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_EDIT')")
	public ResponseEntity<?> save( @RequestBody PrizeShipmentRequest prizeShipmentRequest){
		PrizeShipment prizeShipment = prizeShipmentService.save(prizeShipmentRequest);
		if ( prizeShipment != null) { 
			return ResponseEntity.ok(prizeShipment);
		}
		return ResponseEntity.notFound().build();
	}
}
