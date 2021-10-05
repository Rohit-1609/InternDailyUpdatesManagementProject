package com.interndailyupdatesmanagement.dao;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.interndailyupdatesmanagement.model.Intern;
import com.interndailyupdatesmanagement.repository.InternRepository;

/**
 * @author Rohit T
 *
 */
@Repository("LoginDao")
public class LoginDaoImpl implements LoginDao
{

	@Autowired
	private InternRepository internRepository;
	
	
	private static final Logger log = LoggerFactory.getLogger(LoginDaoImpl.class);
	
		/* (non-Javadoc)
		 * @see com.interndailyupdatesmanagement.dao.LoginDao#createIntern(com.interndailyupdatesmanagement.model.Intern)
		 */
		public Intern createIntern(Intern intern) 
		{
		return this.internRepository.save(intern);
	
		}
		
		
		/* (non-Javadoc)
		 * @see com.interndailyupdatesmanagement.dao.LoginDao#fetchAllInterns()
		 */
		public List<Intern> fetchAllInterns() {
			List<Intern> employees = this.internRepository.findAll();
			return employees;
		}
  
       
    
     		/* (non-Javadoc)
     		 * @see com.interndailyupdatesmanagement.dao.LoginDao#fetchInternByEmail(java.lang.String)
     		 */
     		public Intern fetchInternByEmail(String email) {
     		Intern intern= (Intern) internRepository.findInternByEmail(email);
     			return intern;
     		}
   	
     		
     		/* (non-Javadoc)
     		 * @see com.interndailyupdatesmanagement.dao.LoginDao#fetchInternById(java.lang.Long)
     		 */
     		public Intern fetchInternById(Long id) {
     			Intern intern= (Intern) internRepository.findInternById(id);
     			return intern;
     		}
     		
	
	/* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.dao.LoginDao#getInternByInternFullName(java.lang.String, java.lang.String)
	 */
	@Override
	public Intern getInternByInternFullName(String email, String password) {
		Intern intern= internRepository.findByEmailAndPassword(email, password);
		return intern;
	}
	
		/* (non-Javadoc)
		 * @see com.interndailyupdatesmanagement.dao.LoginDao#updateIntern(com.interndailyupdatesmanagement.model.Intern)
		 */
		@Override
		public void updateIntern(Intern intern) {
			this.internRepository.save(intern);
			log.info("Intern record intered");
		}
		
		
		
		/* (non-Javadoc)
		 * @see com.interndailyupdatesmanagement.dao.LoginDao#deleteIntern(java.lang.String)
		 */
		public void deleteIntern(Long id) {
		  Intern intern = this.fetchInternById(id);
			this.internRepository.delete(intern);
			log.info("Intern records deleted");
		}
		
		
}			
