package com.project.onlineAdminisionSystem.service;

import com.project.onlineAdminisionSystem.entity.UserDetails;

interface UserDetailsService {
	
	UserDetails addUser(UserDetails user);
	UserDetails getUser(String name);
	
	

}
