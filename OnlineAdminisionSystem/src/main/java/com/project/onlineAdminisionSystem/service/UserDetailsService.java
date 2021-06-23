package com.project.onlineAdminisionSystem.service;

import java.util.Optional;

import com.project.onlineAdminisionSystem.entity.UserDetails;

interface UserDetailsService {
	
	UserDetails addUser(UserDetails user);
	UserDetails getUser(String name);
	
	UserDetails updateUser(UserDetails user);
	Optional<UserDetails> getUserById(int id);	
	
	

}
