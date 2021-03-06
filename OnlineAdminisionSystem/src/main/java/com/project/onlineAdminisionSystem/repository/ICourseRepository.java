package com.project.onlineAdminisionSystem.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.Course;


@Repository
public interface ICourseRepository extends JpaRepository<Course , Integer>
{

	ArrayList<Course> findByeligibility(String eligibility);

	Optional<Course> findBycourseName(String courseName);

	void deleteBycourseName(String courseName);
	@Query(value="select * from course where program_id= :id ;",nativeQuery=true)
	List<Course> findByprogramId(@Param("id") int programId);
	
}
