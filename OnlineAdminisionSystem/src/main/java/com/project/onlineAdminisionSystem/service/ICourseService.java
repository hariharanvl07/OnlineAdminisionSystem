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
	public  Course getCourseDetailsByCourseId(int courseId);
	public void deleteCourseById(int courseById);
	public void deleteCourseByName(String courseName);
	public int  updateCourseDetails(Course course);
}
