package com.project.onlineAdminisionSystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.Program;

@Repository
public interface IProgramRepository  extends JpaRepository<Program , Integer> {

	Optional<Program> findByprogramName(String programName);

	void deleteByprogramName(String programName);

	List<Program> findByprogramEligibility(String programEligibility);

	

	List<Program> findBycollege(int id);
	
	
	
@Query(value="SELECT * FROM program WHERE college_id= :collegeId ;",nativeQuery=true)
	List<Program> findByCollegeId(@Param("collegeId") int collegeId);
@Query(value="select college_id from program where program_name= :programName ;",nativeQuery=true)
List<Integer> findCollegeByProgramName(@Param("programName") String programName);
@Query(value="delete from program where program_id= :id ;",nativeQuery=true)
int  deleteByprogramId(@Param("id")  int programId);


	

}
