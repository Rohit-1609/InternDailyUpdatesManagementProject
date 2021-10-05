package com.interndailyupdatesmanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.interndailyupdatesmanagement.exception.InternNotFoundException;

@Controller
@ControllerAdvice
public class InternExceptionController {

	@ExceptionHandler(value= InternNotFoundException.class)
	public ResponseEntity<Object> exception(InternNotFoundException exception)
	{
		return new ResponseEntity<>("Intern not found",HttpStatus.NOT_FOUND);
	}
}
