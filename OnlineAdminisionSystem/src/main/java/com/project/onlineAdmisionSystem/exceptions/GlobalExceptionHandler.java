package com.project.onlineAdmisionSystem.exceptions;





import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(GlobalException.class)
	public final ResponseEntity<ExceptionResponse> handleGlobalException(GlobalException ex, WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}

	@ExceptionHandler(CollegeException.class)
	public final ResponseEntity<ExceptionResponse> handleAdminException(CollegeException ex, WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}
	@ExceptionHandler(UniversityException.class)
	public final ResponseEntity<ExceptionResponse> handleUniversityException(UniversityException ex, WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}
	@ExceptionHandler(AddressException.class)
	public final ResponseEntity<ExceptionResponse> handleAddressException(AddressException ex, WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}
	@ExceptionHandler(BranchException.class)
	public final ResponseEntity<ExceptionResponse> handleBranchException(BranchException ex, WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}	
	
	@ExceptionHandler(CourseException.class)
	public final ResponseEntity<ExceptionResponse> handleCourseException(CourseException ex, WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}
	
	@ExceptionHandler(ProgramException.class)
	public final ResponseEntity<ExceptionResponse> handleProgramException(ProgramException ex, WebRequest req) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),

				req.getDescription(false), HttpStatus.NOT_ACCEPTABLE.getReasonPhrase());

		return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);

	}
	
}