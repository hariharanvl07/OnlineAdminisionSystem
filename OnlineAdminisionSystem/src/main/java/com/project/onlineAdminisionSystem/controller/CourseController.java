package com.project.onlineAdminisionSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.Course;
import com.project.onlineAdminisionSystem.service.ICourseService;

@RestController
	@RequestMapping("/course")

	public class CourseController {

		@Autowired
		private ICourseService service;
		
		@PostMapping("/addCourse")
		public Course addCourse(@RequestBody Course course) {
			return service.addCourse(course);
			}
		
		@DeleteMapping("/deleteCourse/{id}")
		public void deleteCourseById(@PathVariable("id") int id) {
			service.deleteCourseById(id);
		}
		
		@DeleteMapping("/deleteCourseByName/{courseName}")
		public void deleteCourseByName(@PathVariable("courseName") String name) {
			service.deleteCourseByName(name);
		}
		
		@GetMapping("/getAllCourse")
		public List<Course> getAllCourse(){
			return service.viewAllCourseDetails();
			
		}
		
		@GetMapping("/getCourseByName/{courseName}")
		public Optional<Course> getCollegeByName(@PathVariable("courseName") String name) {

			return service.getCourseDetailsByCourseName(name);
		}

	}
	


