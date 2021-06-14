package com.project.onlineAdminisionSystem.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.College;




@Repository
public interface ICollegeRepository extends JpaRepository<College , Integer> {
		
		
	}



