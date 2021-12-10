package com.thp.spring.simplecontext.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/test")
public class TestController {

	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}

	@GetMapping("/expert")
	@PreAuthorize("hasRole('EXPERT')")
	public String expertAccess() {
		return "Moderator Board.";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}
	@GetMapping("/collab")
	@PreAuthorize("hasRole('COLLAB')")
	public String collabAccess() {
		return "Moderator Board.";
	}

}
