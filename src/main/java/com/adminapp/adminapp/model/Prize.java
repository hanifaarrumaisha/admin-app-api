package com.adminapp.adminapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.adminapp.adminapp.dto.Product;

@Entity
@Table(name = "prizes")
public class Prize {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prize_id")
	private Integer prizeId;
	private String name;
	private String imgUrl;

	public Prize() {
	}
	
	public Integer getPrizeId() {
		return prizeId;
	}

	public void setPrizeId(Integer prizeId) {
		this.prizeId = prizeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
}
