package com.adminapp.adminapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminapp.adminapp.repository.ProductRepository;

@Service
public class ProductServiceImpl {
	@Autowired
	ProductRepository productRepository;
	
	
}
