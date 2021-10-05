package com.interndailyupdatesmanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.interndailyupdatesmanagement.exception.DailyUpdatesNotFoundException;

@Controller
@ControllerAdvice
public class DailyUpdatesExceptionController
{

		@ExceptionHandler(value= DailyUpdatesNotFoundException.class)
		public ResponseEntity<Object> exception(DailyUpdatesNotFoundException exception)
		{
			return new ResponseEntity<>("Daily Updates not found",HttpStatus.NOT_FOUND);
		}
}
