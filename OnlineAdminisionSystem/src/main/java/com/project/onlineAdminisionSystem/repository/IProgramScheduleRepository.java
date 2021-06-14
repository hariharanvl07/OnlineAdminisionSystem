package com.project.onlineAdminisionSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.ProgramScheduled;


@Repository
public interface IProgramScheduleRepository extends JpaRepository<ProgramScheduled, Integer> {

	
	ProgramScheduled findProgramScheduleByCollegeName(String collegeName);

	List<ProgramScheduled> findProgramScheduleByDate(String date);


	ProgramScheduled findProgramScheduleById(int scheduleId);
	


}
