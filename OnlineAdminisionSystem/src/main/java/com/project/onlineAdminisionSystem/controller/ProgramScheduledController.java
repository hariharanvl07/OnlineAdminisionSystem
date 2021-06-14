package com.project.onlineAdminisionSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.ProgramScheduled;
import com.project.onlineAdminisionSystem.service.ProgramScheduledService;

@RestController
@RequestMapping("/programS")
public class ProgramScheduledController {
	@Autowired
	private ProgramScheduledService service;

	@PostMapping("/add")
	public ProgramScheduled addProgramSchedule(@RequestBody ProgramScheduled programScheduled) {

		return service.addProgramSchedule(programScheduled);
	}

	@DeleteMapping("/deleteProgramScheduled/{id}")
	public void deleteById(@PathVariable("id") int id) {
		service.deleteProgramScheduleById(id);
	}

	@GetMapping("/getAllProgramScheduled")
	public List<ProgramScheduled> getAllProgramScheduled() {

		return service.viewAllProgramScheduleDetails();
	}
	@GetMapping("/getProgramScheduleByDate/{Date}")
	public List<ProgramScheduled>getProgramScheduleByDate(@PathVariable("Date") String date){
		return service.getProgramScheduleByDate(date);
	}
	@GetMapping("/getProgramScheduleByCollegeName/{collegeName}")
	public List<ProgramScheduled> getProgramScheduleByCollegeName(@PathVariable("collegeName") String name) {

		return service.getProgramScheduleByCollegeName(name);
	}
}
