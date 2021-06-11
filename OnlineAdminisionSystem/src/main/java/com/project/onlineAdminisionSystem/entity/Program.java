	package com.project.onlineAdminisionSystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Program
{
	@Id

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer programId;	
	
	private String programName;
	
	private String programDescription;
	
	private String programEligibility;
	
	private String programDuration;
	
	private String degreeOffered;
 

	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="collegeId")	
	private College college;

	
	public Integer getProgramId() {
	
		return programId;
		
		
	}

	public void setProgramId(Integer programId) {
		this.programId = programId;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getProgramDescription() {
		return programDescription;
	}

	public void setProgramDescription(String programDescription) {
		this.programDescription = programDescription;
	}

	public String getProgramEligibility() {
		return programEligibility;
	}

	public void setProgramEligibility(String programEligibility) {
		this.programEligibility = programEligibility;
	}

	public String getProgramDuration() {
		return programDuration;
	}

	public void setProgramDuration(String programDuration) {
		this.programDuration = programDuration;
	}

	public String getDegreeOffered() {
		return degreeOffered;
	}

	public void setDegreeOffered(String degreeOffered) {
		this.degreeOffered = degreeOffered;
	}
	
	

	
	public Program(Integer programId, String programName, String programDescription, String programEligibility,
			String programDuration, String degreeOffered) {
		super();
		this.programId = programId;
		this.programName = programName;
		this.programDescription = programDescription;
		this.programEligibility = programEligibility;
		this.programDuration = programDuration;
		this.degreeOffered = degreeOffered;
	}

	public Program() {
		super();
	}
	
	
	
}