package com.project.onlineAdminisionSystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	private String username;

	private String password;

	private long phoneNumber;

	private String emailId;
	private String firstName;
	private String MiddleName;
	private String LastName;
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "stuentId")
	private List<Document> document;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "stuentId")
	private List<Application> application;
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Document> getDocument() {
		return document;
	}

	public void setDocument(List<Document> document) {
		this.document = document;
	}

	public List<Application> getApplication() {
		return application;
	}

	public void setApplication(List<Application> application) {
		this.application = application;
	}



	public UserDetails(String username, String password) {
		super();
		this.username = username;
		this.password = password;

	}

	public UserDetails(int id, String username, String password, long phoneNumber, String emailId, String firstName,
			String middleName, String lastName, List<Document> document, List<Application> application) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.firstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		this.document = document;
		this.application = application;
	}

	public UserDetails() {
		super();
	}

}
