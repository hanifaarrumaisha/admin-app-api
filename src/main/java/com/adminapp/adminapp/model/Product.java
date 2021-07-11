package com.adminapp.adminapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;

	private String packageName;
	
	private String packageTag;
	
	private String packageStatus;
	
	private String packageSerial;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "product_prizes", 
				joinColumns = @JoinColumn(name = "product_id"), 
				inverseJoinColumns = @JoinColumn(name = "prize_id"))
	private Set<Prize> prize = new HashSet<>();
	
	public String getPackageName() {
		return packageName;
	}
	
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	public String getPackageTag() {
		return packageTag;
	}
	
	public void setPackageTag(String packageTag) {
		this.packageTag = packageTag;
	}
	
	public String getPackageStatus() {
		return packageStatus;
	}
	
	public void setPackageStatus(String packageStatus) {
		this.packageStatus = packageStatus;
	}
	
	public String getPackageSerial() {
		return packageSerial;
	}
	
	public void setPackageSerial(String packageSerial) {
		this.packageSerial = packageSerial;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Set<Prize> getPrize() {
		return prize;
	}

	public void setPrize(Set<Prize> prize) {
		this.prize = prize;
	}
	
	
}