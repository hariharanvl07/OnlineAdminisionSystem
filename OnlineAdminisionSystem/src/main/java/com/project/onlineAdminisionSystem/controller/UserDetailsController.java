package com.project.onlineAdminisionSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.UserDetails;
import com.project.onlineAdminisionSystem.repository.UserDetailsRepository;
import com.project.onlineAdminisionSystem.service.UserDetailsServiceImpl;
@CrossOrigin(origins="http://localhost:3000")
@RestController
	@RequestMapping("/user")

	public class UserDetailsController {

		@Autowired
		private UserDetailsServiceImpl service;
		@Autowired
		private UserDetailsRepository repo;
		
		@PostMapping("/addUser")
		public UserDetails addUser(@RequestBody UserDetails user) {
			return service.addUser(user);
			}

		@GetMapping("/getUser/{username}")
		public UserDetails getUser(@PathVariable("username") String name) {
			return service.getUser(name);
			}
		
		@GetMapping("/getUserById/{id}")
		public UserDetails getUserById(@PathVariable("id") int id) {
			return service.getUserById(id).orElseThrow();
			}
		
		
		@PutMapping("/updateUser/{id}")
		public UserDetails getUser(@PathVariable("id") int id,@RequestBody UserDetails user) {
			UserDetails user1= service.getUserById(id).orElseThrow(); 
		
			user1.setDocument(user.getDocument());
			user1.setEmailId(user.getEmailId());
			user1.setPassword(user.getPassword());
			user1.setPhoneNumber(user.getPhoneNumber());
			user1.setFirstName(user.getFirstName());
			user1.setMiddleName(user.getMiddleName());
			user1.setLastName(user.getLastName());
			user1.setApplication(user.getApplication());
			user1.setUsername(user.getUsername());
		
	
			
			return service.updateUser(user1);
			}
		
		@PutMapping("/addUserApplication/{id}")
		public UserDetails addUserApplication(@PathVariable("id") int id,@RequestBody UserDetails user) {
			UserDetails user1= service.getUserById(id).orElseThrow(); 
		user1.setApplication(user.getApplication());
			
		
	
			
			return service.updateUser(user1);
			}
		
		

	}
	


