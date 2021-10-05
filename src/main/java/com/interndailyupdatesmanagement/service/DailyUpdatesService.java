package com.interndailyupdatesmanagement.service;

import java.util.List;

import org.springframework.stereotype.Component;
import com.interndailyupdatesmanagement.model.DailyUpdates;


/**
 * @author Rohit T
 * @version 1.0
 */
@Component
public interface DailyUpdatesService
{
	/**
	 * This method used to add dailyUpdates  
	 * @param dailyUpdates An object of daily updates
	 * @return The daily updates of an intern's
	 * @throws Exception 
	 */
	 public DailyUpdates addDailyUpdates(DailyUpdates dailyUpdates) throws Exception;
	 
	 
	 
	 /**
	  * get all daily updates of an intern's
	 * @return List<DailyUpdates> List of an daily Updates of an intern's
	 */
	public List<DailyUpdates> getAllDailyUpdates();
	
	
	/**
	 * get daily updates of an intern by intern's id
	 * @param id The intern's id
	 * @return A records of intern
	 */
	 public DailyUpdates getDailyUpdates(Long id);
	 
	 
	 /**
	  * This method perform operation of updating daily updates of an intern's
	  * @param dailyUpdates An records of daily updates
	  */
	 public void updateDailyUpdates(DailyUpdates dailyUpdates);
	 
	 
		/**
		 * This method perform operation of deleting records of intern by using id
		 * @param id The daily updates id
		 */
		public void deleteDailyUpdatess(Long id); 
}
