package com.adminapp.adminapp.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_EDIT') or hasRole('ROLE_VIEW')")
	public String userAccess() {
		return "User Content.";
	}

	@GetMapping("/edit")
	@PreAuthorize("hasRole('ROLE_EDIT')")
	public String roleAccess() {
		return "Edit Board.";
	}

	@GetMapping("/view")
	@PreAuthorize("hasRole('ROLE_VIEW')")
	public String viewAccess() {
		return "View Board.";
	}
}