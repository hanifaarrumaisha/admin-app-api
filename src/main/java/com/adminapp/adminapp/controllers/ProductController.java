package com.adminapp.adminapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adminapp.adminapp.service.ProductService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/product")
public class ProductController {
//	@Autowired
//	ProductService productService;
//	
//	@GetMapping("/add")
//	@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_EDIT') or hasRole('ROLE_VIEW')")
//	public String userAccess() {
//		return "User Content.";
//	}
}
