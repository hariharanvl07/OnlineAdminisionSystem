package com.project.onlineAdminisionSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.UserDetails;
import com.project.onlineAdminisionSystem.service.UserDetailsServiceImpl;

@RestController
	@RequestMapping("/user")

	public class UserDetailsController {

		@Autowired
		private UserDetailsServiceImpl service;
		
		@PostMapping("/addUser")
		public UserDetails addUser(@RequestBody UserDetails user) {
			return service.addUser(user);
			}

		@GetMapping("/getUser/{username}")
		public UserDetails getUser(@PathVariable("username") String name) {
			return service.getUser(name);
			}
		
		

	}
	


