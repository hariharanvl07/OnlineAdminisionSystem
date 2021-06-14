package com.project.onlineAdminisionSystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ProgramScheduled {
	@GeneratedValue
	@Id
	private int scheduleId;
	@OneToOne(cascade = { CascadeType.ALL })
	private Branch branch;
	@OneToOne(cascade = { CascadeType.ALL })
	private Course course;
	@OneToOne(cascade = { CascadeType.ALL })
	private Program program;
	@OneToOne(cascade = { CascadeType.ALL })
	private College college;
	@OneToOne(cascade = { CascadeType.ALL })
	private University university;
	
	private String startDate;
	private String endDate;

	public ProgramScheduled() {
		super();
	}

	public ProgramScheduled(Branch branch, Course course, Program program, College college, University university,
			String startDate, String endDate) {
		super();
		this.branch = branch;
		this.course = course;
		this.program = program;
		this.college = college;
		this.university = university;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
