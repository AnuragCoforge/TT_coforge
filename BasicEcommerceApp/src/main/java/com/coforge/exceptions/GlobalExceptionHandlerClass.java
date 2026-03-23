package com.coforge.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.coforge.entities.Customer;

@ControllerAdvice
public class GlobalExceptionHandlerClass {
	
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> handleCustomerNotFoundException(CustomerNotFoundException e){
		return new ResponseEntity<>("Customer Not found",HttpStatus.NOT_FOUND);
	}
	
	
	

}
