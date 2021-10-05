package com.interndailyupdatesmanagement.dao;

import java.util.List;
import org.springframework.stereotype.Component;
import com.interndailyupdatesmanagement.model.DailyUpdates;


/**
 * @author Rohit T
 *
 */
@Component
public interface DailyUpdatesDao 
{

	/**
	 * This method used to create daily updates records
	 * @param dailyUpdates An daily updates object
	 * @return dailyupdates
	 * @throws Exception 
	 */
	public DailyUpdates createDailyUpdates(DailyUpdates dailyUpdates) throws Exception;
	
	
	/**
	 * This method used to fetch all daily updates records 
	 * @return A list of daily updates
	 */
	public List<DailyUpdates> fetchAllDailyUpdates();
	
	
	/**
	 * This method used to fetch daily updates records using id
	 * @param id An daily updates id
	 * @return daily updates
	 */
	public DailyUpdates fetchDailyUpdate(Long id);
	
	
	/**
	 * This method is used to updates daily updates records
	 * @param dailyUpdates An daily updates object
	 * @return daily updates
	 */
	 public void updateDailyUpdate(DailyUpdates dailyUpdates);
	 
	 
		/**
		 * This method used to delete the daily updates records by using id
		 * @param id An intern id.
		 */
		public void deleteDailyUpdates(Long id);
}
