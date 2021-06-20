package com.project.onlineAdminisionSystem.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.Course;
import com.project.onlineAdminisionSystem.service.ICourseService;
@CrossOrigin(origins="http://localhost:3000")
@RestController
	@RequestMapping("/course")

	public class CourseController {
	
	Logger logger = LoggerFactory.getLogger(CourseController.class);

		@Autowired
		private ICourseService service;
		
		@PostMapping("/addCourse")
		public Course addCourse(@RequestBody Course course) {
			
			logger.info("addCourse service started");
			logger.info("addCourse service ended");
			
			return service.addCourse(course);
			}
		
		@DeleteMapping("/deleteCourse/{id}")
		public void deleteCourseById(@PathVariable("id") int id) {
			
			logger.info("deleteCourse service started");
			
			service.deleteCourseById(id);
			
			logger.info("deleteCourse service ended");
		}
		
		@DeleteMapping("/deleteCourseByName/{courseName}")
		public void deleteCourseByName(@PathVariable("courseName") String name) {
			
			logger.info("deleteCourseByName service started");
			
			service.deleteCourseByName(name);
			
			logger.info("deleteCourseByName service ended");
		}
		
		@GetMapping("/getAllCourse")
		public List<Course> getAllCourse(){
			
			logger.info("getAllCourse service started");
			logger.info("getAllCourse service ended");
			
			return service.viewAllCourseDetails();
			
		}
		
		@GetMapping("/getCourseByName/{courseName}")
		public Optional<Course> getCourseByName(@PathVariable("courseName") String name) {
			
			logger.info("getCourseByName service started");
			logger.info("getCourseByName service ended");

			return service.getCourseDetailsByCourseName(name);
		}
		
		@GetMapping("/getCourseByProgrmName/{programName}")
		public List<Course> getCourseByProgramName(@PathVariable("programName") String name) {
			
			logger.info("getCourseByProgramName service started");
			logger.info("getCourseByProgramName service ended");

			return service.getCoursesByProgramName(name);
		}

	}
	


