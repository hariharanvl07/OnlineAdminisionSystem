package com.project.onlineAdminisionSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.Course;
import com.project.onlineAdminisionSystem.repository.ICourseRepository;
@Service
public class CourseServiceImpl implements ICourseService {
@Autowired
private ICourseRepository repo;
	@Override
	public Course addCourse(Course course) {
		return repo.save(course);
	}

	@Override
	public List<Course> viewAllCourseDetails() {
		return repo.findAll();
	}

	@Override
	public Optional<Course> getCourseDetailsByCourseName(String courseName) {
		return repo.findBycourseName(courseName);
	}

	@Override
	public ArrayList<Course> getCourseDetailsByCollegeName(String collegeName) {
		return null;
	}

	@Override
	public ArrayList<Course> getCourseDetailsByEligibility(String eligibility) {
		return repo.findByeligibility(eligibility);
	}

	@Override
	public Course getCourseDetailsByCourseId(int courseId) {
		return repo.findById(courseId).orElseThrow();
	}

	@Override
	public void deleteCourseById(int courseById) {
		 repo.deleteById(courseById);
	}

	@Override
	public void deleteCourseByName(String courseName) {
		 repo.deleteBycourseName(courseName);
	}

	@Override
	public int updateCourseDetails(Course course) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public Object updateCourseDetails(Course course) {
//		return null;
//	}

}
