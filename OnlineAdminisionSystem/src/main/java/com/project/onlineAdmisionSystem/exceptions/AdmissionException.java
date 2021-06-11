package com.project.onlineAdmisionSystem.exceptions;



/**
 * @author VLH
 *
 */
public class AdmissionException extends RuntimeException {

	private static final long serialVersionUID = -4271456732351898052L;

	public AdmissionException(String msg) {
		super(msg);
	}

	public AdmissionException() {

	}
}