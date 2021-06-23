package com.project.onlineAdminisionSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.project.onlineAdminisionSystem.entity.Course;

public interface ICourseService {
	public Course addCourse(Course course);
	public List<Course> viewAllCourseDetails();
	public  Optional<Course> getCourseDetailsByCourseName(String courseName);
	public  ArrayList<Course> getCourseDetailsByCollegeName(String collegeName);
	public  ArrayList<Course> getCourseDetailsByEligibility(String eligibility);
	public  Optional<Course> getCourseDetailsByCourseId(int courseId);
	public void deleteCourseById(int courseById);
	public void deleteCourseByName(String courseName);
	public Course  updateCourseDetails(Course course);
	
	public List<Course> getCoursesByProgramId(int id);
}
