package com.project.onlineAdminisionSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.College;
import com.project.onlineAdminisionSystem.entity.ProgramScheduled;
import com.project.onlineAdminisionSystem.repository.IProgramScheduleRepository;

@Service
public class IProgramScheduledService implements ProgramScheduledService {

	@Autowired
	private IProgramScheduleRepository repository;
	
	@Autowired
	CollegeSericeImpl college;

	@Override
	public ProgramScheduled addProgramSchedule(ProgramScheduled programSchedule) {
		return repository.save(programSchedule);
	}

	@Override
	public List<ProgramScheduled> viewAllProgramScheduleDetails() {

		return repository.findAll();
	}

	/*@Override
	public List<ProgramScheduled> getProgramScheduleByCollegeName(String collegeName){
		Optional<College> clg = college.getCollegeDetailsByName(collegeName);
		ProgramScheduled progSche = clg.getProgramScheduleByCollegeName();
		return progSche;
	}*/

	@Override
	public List<ProgramScheduled> getProgramScheduleByDate(String date) {

		return repository.findProgramScheduleByDate(date);
	}

	@Override
	public void deleteProgramScheduleById(int scheduleId) {

		repository.deleteById(scheduleId);
		
	}

	@Override
	public Optional<ProgramScheduled> getProgramScheduleById(int scheduleId) {

		return repository.findById(scheduleId);
		
	}

	@Override
	public int updateProgramSchedule(ProgramScheduled programSchedule) {
		ProgramScheduled schedule =repository.findProgramScheduleById(programSchedule.getScheduleId());
		schedule.setBranch(programSchedule.getBranch());
		schedule.setProgram(programSchedule.getProgram());
		return 0;
	}

}