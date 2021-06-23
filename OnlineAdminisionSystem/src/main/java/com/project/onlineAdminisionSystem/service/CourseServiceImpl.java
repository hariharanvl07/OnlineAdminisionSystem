package com.project.onlineAdminisionSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.Course;
import com.project.onlineAdminisionSystem.entity.Program;
import com.project.onlineAdminisionSystem.repository.ICourseRepository;
@Service
public class CourseServiceImpl implements ICourseService {
	
	Logger logger = LoggerFactory.getLogger(ICourseService.class);
@Autowired
private ICourseRepository repo;

@Autowired
private IProgramService service;
	@Override
	public Course addCourse(Course course) {
		
		logger.info("addCourse service started");
		logger.info("addCourse service ended");
		
		return repo.save(course);
	}

	@Override
	public List<Course> viewAllCourseDetails() {
		
		logger.info("viewAllCourseDetails service started");
		logger.info("viewAllCourseDetails service ended");
		
		return repo.findAll();
	}

	@Override
	public Optional<Course> getCourseDetailsByCourseName(String courseName) {
		
		logger.info("getCourseDetailsByCourseName service started");
		logger.info("getCourseDetailsByCourseName service ended");
		
		return repo.findBycourseName(courseName);
	}

	@Override
	public ArrayList<Course> getCourseDetailsByCollegeName(String collegeName) {
		
		logger.info("getCourseDetailsByCollegeName service started");
		logger.info("getCourseDetailsByCollegeName service ended");
		
		return null;
	}

	@Override
	public ArrayList<Course> getCourseDetailsByEligibility(String eligibility) {
		
		logger.info("getCourseDetailsByEligibility service started");
		logger.info("getCourseDetailsByEligibility service ended");
		
		return repo.findByeligibility(eligibility);
	}

	@Override
	public Optional<Course> getCourseDetailsByCourseId(int courseId) {
		
		logger.info("getCourseDetailsByCourseId service started");
		logger.info("getCourseDetailsByCourseId service ended");
		
		return repo.findById(courseId);
	}

	@Override
	public void deleteCourseById(int courseById) {
		
		logger.info("deleteCourseById service started");
		
		 repo.deleteById(courseById);
		 
		logger.info("deleteCourseById service ended");
	}

	@Override
	public void deleteCourseByName(String courseName) {
		
		logger.info("deleteCourseByName service started");
		
		 repo.deleteBycourseName(courseName);
		 
	    logger.info("deleteCourseByName service ended");
	}

	@Override
	public Course updateCourseDetails(Course course) {
		
		logger.info("updateCourseDetails service started");
		
		
		logger.info("updateCourseDetails service ended");

		return repo.save(course);
	}

	@Override
	public List<Course> getCoursesByProgramId(int id) {
		// TODO Auto-generated method stub
		return repo.findByprogramId(id);
	}

	





}
