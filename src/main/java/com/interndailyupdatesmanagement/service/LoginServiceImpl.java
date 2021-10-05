package com.interndailyupdatesmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.interndailyupdatesmanagement.dao.LoginDao;

import com.interndailyupdatesmanagement.exception.InternNotFoundException;
import com.interndailyupdatesmanagement.model.Intern;


/**
 * @author Rohit T
 *
 */

@Service
public class LoginServiceImpl implements LoginService
{
	 /**
	 * Represents the LoginDao 
	 */
	@Autowired
	LoginDao loginDao;
	   
	  private static final Logger log = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	
	/* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.service.LoginService#addIntern(com.interndailyupdatesmanagement.model.Intern)
	 */
	public Intern addIntern(Intern intern) throws Exception
	{	Intern intern1 = null;
	if(intern.getEmail().equals("")||intern.getFullName().equals("")||intern.getPassword().equals("")||
			intern.getRole().equals("")||intern.getJoiningDate().equals("")||intern.getMentor().equals("")) {
		throw new Exception("The required field in request body is empty");
	}
	else
	{
		try
		{
		 intern1=this.loginDao.createIntern(intern);
	//	 return new ResponseEntity<>("Employee is created successfully with id " +intern.getId()+ ,HttpStatus.CREATED);
		}
		catch(Exception exception)
		{
			log.error("couldm't serialize response for content type application/json",exception);
			throw new Exception("Please check url or enter required field");
			
		}
	}
	return intern1;
	
	}
			
	
	/* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.service.LoginService#getAllInterns()
	 */
	public List<Intern> getAllInterns() {
		List<Intern> employees = this.loginDao.fetchAllInterns();
		return employees;
	}

	/* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.service.LoginService#getInternByEmail(java.lang.String)
	 */
	public Intern getInternByEmail(String email) {

		return this.loginDao.fetchInternByEmail(email);
	}
			
		
	/* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.service.LoginService#getInternById(java.lang.Long)
	 */
	public Intern getInternById(Long id) {

		Intern intern= this.loginDao.fetchInternById(id);
		if(intern!=null)
		{
		 	
	     //	return new ResponseEntity<>(intern, HttpStatus.OK);
		}
		else
		{
			throw new InternNotFoundException();
		}
		return intern;
	}
		   
	/* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.service.LoginService#findByInternFullName(java.lang.String, java.lang.String)
	 */
	@Override
	public Intern findByInternFullName(String email, String password) {
		Intern intern= loginDao.getInternByInternFullName(email, password);
		return intern;
	}
			

	/* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.service.LoginService#updateInterns(com.interndailyupdatesmanagement.model.Intern)
	 */
	@Override
	public void updateInterns(Intern intern)
	{
		if(intern!=null)
		{
			this.loginDao.updateIntern(intern);
			log.info("Daily Updates records Updated");
		//	return new ResponseEntity<>("Intern is updated successfully ",HttpStatus.OK);
		}
		else
		{
			throw new InternNotFoundException();
			}
	//	this.loginDao.updateIntern(intern);
	
	}
	
	
	/* (non-Javadoc)
	 * @see com.interndailyupdatesmanagement.service.LoginService#deleteInterns(java.lang.Long)
	 */
	
	public void deleteInterns(Long id) 
	{		
		if(id!=null)
		{
			this.loginDao.deleteIntern(id);
			log.info("Daily Updates records deleted");
		//	return new ResponseEntity<>("Intern is deleted successfully", HttpStatus.OK);
		}
		else
		{
			throw new InternNotFoundException();
		}
	//	this.loginDao.deleteIntern(id);
		log.info("Daily Updates records deleted");
	}

			
	
}
