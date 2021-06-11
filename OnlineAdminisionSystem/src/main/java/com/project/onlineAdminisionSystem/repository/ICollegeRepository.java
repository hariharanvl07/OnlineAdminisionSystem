package com.project.onlineAdminisionSystem.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.College;




@Repository
public interface ICollegeRepository extends JpaRepository<College , Integer> {

	Optional<College> findBycollegeName(String collegeName);
	@Query(value="delete from college where college_reg_id = :name ;",nativeQuery=true)
	void deleteBycollegeName(@Param("name") String collegeName);
		
		
	}



