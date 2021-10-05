package com.interndailyupdatesmanagement.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.interndailyupdatesmanagement.model.Intern;

/**
 * @author Rohit T
 * @version 1.0
 */
@Component
public interface LoginService 
{
	/**
	 * This method is used to add the interns records
	 * @param intern A Intern object
	 * @throws Exception 
	 */
	public Intern addIntern(Intern intern) throws Exception ;
	
	 /**
	  * get the records of all intern
	 * @return List<Intern> It returns all intern records
	 */
	public List<Intern> getAllInterns();
	
		/**
		 * get the records of specific intern by email
		 * @param email The intern's email
		 * @return Intern An intern object
		 */
		public Intern getInternByEmail(String email);
		
		
		/**
		 * get the records of specific intern by id
		 * @param id The intern's id
		 * @return Intern An intern object
		 */
		public Intern getInternById(Long id);
		

		/**
		 * This method used to find intern records by interns full name
		 * @param email The intern's email
		 * @param password The intern's password
		 * @return Intern An Intern Object
		 */
		public Intern findByInternFullName(String email,String password);
		
		 
		 
		 /**
		  * This method used to update the interns records
		 * @param intern AN intern object
		 */
		public void updateInterns(Intern intern);
		 
		 
		
			/**
			 * This method used to delete the intern's records by using id
			 * @param id An intern's id
			 */
			public void deleteInterns(Long id); 
			
	
		
	
}
