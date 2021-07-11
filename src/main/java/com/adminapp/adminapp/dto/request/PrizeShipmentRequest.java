package com.adminapp.adminapp.dto.request;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.adminapp.adminapp.model.EPrizeShipmentStatus;
import com.adminapp.adminapp.model.Product;

public class PrizeShipmentRequest {
	private String shipmentStatus;
	private String address1;
	private String address2;
	private String state;
	private String zipCode;
	private String city;
	private String country;
	private String subscriberUserId;
	private String prizeName;
	public String getShipmentStatus() {
		return shipmentStatus;
	}
	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSubscriberUserId() {
		return subscriberUserId;
	}
	public void setSubscriberUserId(String subscriberUserId) {
		this.subscriberUserId = subscriberUserId;
	}
	public String getPrizeName() {
		return prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}
	
	
}
