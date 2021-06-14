package com.project.onlineAdminisionSystem.repository;

import java.util.ArrayList;

import com.project.onlineAdminisionSystem.entity.Course;



public interface ICourseRepository
{
	public Course addCourse(Course course);
	public ArrayList<Course> viewAllCourseDetails();
	public  ArrayList<Course> getCourseDetailsByCourseName(String courceName);
	public  ArrayList<Course> getCourseDetailsByCollegeName(String collegeName);
	public  ArrayList<Course> getCourseDetailsByEligibility(String eligibility);
	public  Course getCourseDetailsByCourseId(int courceId);
	public int deleteCourseById(int courseById);
	public int deleteCourseByName(String courseName);
	public int  updateCourseDetails(Course course);
}
