package com.interndailyupdatesmanagement.dao;

import java.util.List;
import org.springframework.stereotype.Component;
import com.interndailyupdatesmanagement.model.Intern;

@Component
public interface LoginDao 
{

	/**
	 * This method perform operation of creating new records of intern
	 * @param intern An Intern object
	 */
	public Intern createIntern(Intern intern);
	
	/**
	 * This method used to fetch all interns records
	 * @return A List of records
	 */
	public List<Intern> fetchAllInterns();
	
	/**
	 * This method perform operation of geting intern using email and password
	 * @param email An intern's email
	 * @param password An intern's password
	 * @return A intern object
	 */
	public Intern getInternByInternFullName(String email,String password);
	
	
	/**
	 * This method used to fetch intern's records by using email
	 * @param email An intern's email
	 * @return a intern object
	 */
	public Intern fetchInternByEmail(String email);
	
	
	/**
	 * This method used to fetch intern's records by using id 
	 * @param id An intern's id
	 * @return An intern object
	 */
	public Intern fetchInternById(Long id);
	
	
	/**
	 * This method used to update intern's records
	 * @param Intern AN intern object
	 * @return 
	 */
	 public void updateIntern(Intern intern);
	 
		/**
		 * THis method is used to delete the intern's records by using id
		 * @param id An intern id
		 */
		public void deleteIntern(Long id);
		
	 
			
}
