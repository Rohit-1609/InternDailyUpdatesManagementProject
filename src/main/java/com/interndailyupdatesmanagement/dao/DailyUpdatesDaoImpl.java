package com.interndailyupdatesmanagement.dao;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.interndailyupdatesmanagement.model.DailyUpdates;
import com.interndailyupdatesmanagement.repository.DailyUpdatesRepository;

/**
 * @author Rohit T
 * @version 1.0
 * @since 1.0
 */
@Repository("DailyUpdatesDao")
public class DailyUpdatesDaoImpl implements DailyUpdatesDao 
{
	/**
	 * Represent Daily Updates Repository class object;
	 */
	@Autowired
	DailyUpdatesRepository dailyUpdatesRepository;

	private static final Logger log = LoggerFactory.getLogger(DailyUpdatesDaoImpl.class);
	
	/* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.dao.DailyUpdatesDao#createDailyUpdates(com.interndailyupdatesmanagement.model.DailyUpdates)
	 */
	public DailyUpdates createDailyUpdates(DailyUpdates dailyUpdates) throws Exception {
		DailyUpdates dailyUpdates1=this.dailyUpdatesRepository.save(dailyUpdates);;
	    return dailyUpdates1;
	}
	
	/* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.dao.DailyUpdatesDao#fetchAllDailyUpdates()
	 */
	public List<DailyUpdates> fetchAllDailyUpdates(){
		List<DailyUpdates> dailyUpdatess =this.dailyUpdatesRepository.findAll(); 
		return dailyUpdatess;
	}
	
	/* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.dao.DailyUpdatesDao#fetchDailyUpdate(java.lang.Long)
	 */
	@Override
	public DailyUpdates fetchDailyUpdate(Long id){
		return this.dailyUpdatesRepository.findAllById(id);
		
	}

	/* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.dao.DailyUpdatesDao#updateDailyUpdate(com.interndailyupdatesmanagement.model.DailyUpdates)
	 */
	@Override
	public void updateDailyUpdate(DailyUpdates dailyUpdates) {
		this.dailyUpdatesRepository.save(dailyUpdates);
		log.info("Daily Updates records updated");
		
	}
	
	/* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.dao.DailyUpdatesDao#deleteDailyUpdates(java.lang.Long)
	 */
	public void deleteDailyUpdates(Long id) {
		DailyUpdates dailyUpdates = this.fetchDailyUpdate(id);
		this.dailyUpdatesRepository.delete(dailyUpdates);
		log.info("daily updates records deleted");
	}
	
	
}
