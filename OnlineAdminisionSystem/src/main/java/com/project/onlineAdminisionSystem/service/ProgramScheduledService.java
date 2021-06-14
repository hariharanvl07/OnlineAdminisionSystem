package com.project.onlineAdminisionSystem.service;


import java.util.List;
import java.util.Optional;

import com.project.onlineAdminisionSystem.entity.ProgramScheduled;


public interface ProgramScheduledService {

	public ProgramScheduled addProgramSchedule(ProgramScheduled programSchedule);

	public List<ProgramScheduled> viewAllProgramScheduleDetails();

	public List<ProgramScheduled> getProgramScheduleByCollegeName(String collegeName);

	public List<ProgramScheduled> getProgramScheduleByDate(String date);

	public void deleteProgramScheduleById(int scheduleId);

	public Optional <ProgramScheduled> getProgramScheduleById(int scheduleId);

	public int updateProgramSchedule(ProgramScheduled programSchedule);

}
