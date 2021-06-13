package com.project.onlineAdminisionSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.UserDetails;


@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer>
{

	UserDetails findByusername(String name);


}
