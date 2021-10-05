package com.interndailyupdatesmanagement.service;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.interndailyupdatesmanagement.controller.DailyUpdatesExceptionController;
import com.interndailyupdatesmanagement.dao.DailyUpdatesDao;
import com.interndailyupdatesmanagement.exception.DailyUpdatesNotFoundException;
import com.interndailyupdatesmanagement.model.DailyUpdates;


/**
 * @author Rohit T
 *
 */
@Service
public class DailyUpdatesServiceImpl implements DailyUpdatesService
{
	   @Autowired
	   DailyUpdatesDao dailyUpdatesDao;
	   
	   private static final Logger log = LoggerFactory.getLogger(DailyUpdatesServiceImpl.class);
	   
	  
	   public DailyUpdates addDailyUpdates(DailyUpdates dailyUpdates) throws Exception {
		   DailyUpdates dailyUpdates1 = null;
			if(dailyUpdates.getTopicName().equals("")||dailyUpdates.getDescription().equals("")||
					dailyUpdates.getHours().equals("")||dailyUpdates.getDate().equals(""))
			{
				throw new Exception("The required field in requested body is empty");
			}	
			else
			{
				try
				{
			     dailyUpdates1= this.dailyUpdatesDao.createDailyUpdates(dailyUpdates); 
		//	     return new ResponseEntity<>("Employee is created successfully with id"+dailyUpdates.getId(),HttpStatus.OK);
			 
				}
				catch(Exception exception)
				{
					log.error("couldn't serialize response for content type application/json",exception);
				}
			
			}
			return dailyUpdates1;
		
	   }
	   
	   
	   /* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.service.DailyUpdatesService#getAllDailyUpdates()
	 */
	public List<DailyUpdates> getAllDailyUpdates(){
		   
		
		List<DailyUpdates> dailyUpdateslist= dailyUpdatesDao.fetchAllDailyUpdates();
	//	return new ResponseEntity(dailyUpdateslist,HttpStatus.OK);
		return dailyUpdateslist;	
		}
		
	/**
	 * This method used to get the daily updates records by using id
	 * @return daily updates records
	 */
	   public DailyUpdates getDailyUpdates(Long id)
	   {
		   DailyUpdates dailyUpdates;
		   if(id!=null)
		   {
			  dailyUpdates= dailyUpdatesDao.fetchDailyUpdate(id);
		//	   return new ResponseEntity<>(dailyUpdates,HttpStatus.OK);
		   }
		   else
		   {
			   throw new DailyUpdatesNotFoundException();
		   }
			return dailyUpdates;
			
		}
		
		
	   
		/* (non-Javadoc)
		 * @see com.interndailyupdatesmanagement.service.DailyUpdatesService#updateDailyUpdates(com.interndailyupdatesmanagement.model.DailyUpdates)
		 */
		@Override
		public void updateDailyUpdates(DailyUpdates dailyUpdates)
		{
			if(dailyUpdates!=null)
			{
				this.dailyUpdatesDao.updateDailyUpdate(dailyUpdates);
				log.info("Daily updates records updated");
			//	return new ResponseEntity<>("Daily Updates is updated successfully", HttpStatus.OK);
			}
			else
			{
				throw new DailyUpdatesNotFoundException();
			}
		//	this.dailyUpdatesDao.updateDailyUpdate(dailyUpdates);
			
		}
		
		
		/* (non-Javadoc)
		 * @see com.interndailyupdatesmanagement.service.DailyUpdatesService#deleteDailyUpdatess(java.lang.Long)
		 */
		public void deleteDailyUpdatess(Long id) 
		{
			if(id!=null)
			{
				this.dailyUpdatesDao.deleteDailyUpdates(id);
				log.info("Daily updates records deleted");
		//		return new ResponseEntity<>("Daily Updates is deleted succussfully", HttpStatus.OK);
			}
			else
			{
				throw new DailyUpdatesNotFoundException();
			}
		//	this.dailyUpdatesDao.deleteDailyUpdates(id);
		
		}
}
