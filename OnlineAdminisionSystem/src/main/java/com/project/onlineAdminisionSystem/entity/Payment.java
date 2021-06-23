package com.project.onlineAdminisionSystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int paymentId;
	
	
	@OneToOne(cascade = { CascadeType.ALL })
	private Application applicationId;
	@NotNull(message ="The amount should not be null")
	private double paymentAmount;
	@NotNull(message ="The Date should not be null")
	private String paymentDate;
	@NotNull(message ="The Status should not be null")
	private String paymentStatus;

	public Payment() {
		super();
	}
	
	public Payment(Application applicationId, double paymentAmount,
			String paymentDate, String paymentStatus) {
		super();
		
	
		this.paymentAmount = paymentAmount;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
	}
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public Application getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Application applicationId) {
		this.applicationId = applicationId;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
