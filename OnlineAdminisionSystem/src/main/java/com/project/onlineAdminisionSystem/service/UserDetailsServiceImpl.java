package com.project.onlineAdminisionSystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.UserDetails;
import com.project.onlineAdminisionSystem.repository.UserDetailsRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
@Autowired 
private UserDetailsRepository repo;
	@Override
	public UserDetails addUser(UserDetails user) {

		return repo.save(user);
	}

	@Override
	public UserDetails getUser(String name) {
		
		return repo.findByusername(name);
	}

	@Override
	public UserDetails updateUser(UserDetails user) {
	
		return repo.save(user);
	}

	@Override
	public Optional<UserDetails> getUserById(int id) {
		
		return repo.findById(id);
	}

}
