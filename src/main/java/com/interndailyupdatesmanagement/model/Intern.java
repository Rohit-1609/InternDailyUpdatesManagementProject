package com.interndailyupdatesmanagement.model;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Rohit T
 * @version 1.0
 * @since 1.0
 */

@Document(collection="rohitdata")
public class Intern
{
	@Transient
	public static final String SEQUENCE_NAME="intern_sequence";
	/**
	 * Represents Id of Intern
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    int id;
	
	/**
	 * Represent email of Intern
	 */
	@Indexed(unique=true)
	@Column(length=40,name="email")
	String email;
	
	/**
	 * Represents fullname of Intern
	 */
	@Indexed(unique=true)
	@Column(length=40,name="fullName")
	String fullName;
	
	/**
	 * Represents password of Intern
	 */
	@Column(length=20,name="password")
    String password;
	
	/**
	 * Represents role of Intern
	 */
	@Column(length=20,name="role")
    String role;
	
	/**
	 * Represents joining date of Intern
	 */
	@Column(length=40,name="joiningDate")
	String joiningDate;
	
	/**
	 * Represents mentor of Intern
	 */
	@Column(length=20,name="mentor")
    String mentor;
	
	
	
	
	/**
	 * get the intern id
	 * @return A integer representing the intern's id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * set the intern's id
	 * @param id A integer containing intern's id 
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * get the intern's email
	 * @return A string representing intern's email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * set the intern's email
	 * @param email A String containing intern's email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	/**
	 * get the intern's full name
	 * @return A String representing intern's full name
	 */
	public String getFullName() {
		return fullName;
	}
	
	/**
	 * set the intern's full name
	 * @param fullName A String containing full name of intern's
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	/**
	 * get the intern's password
	 * @return A String representing the password of intern
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * set the intern's password
	 * @param password A String containing intern's password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * get the intern's role
	 * @return A String representing the intern's role
	 */
	public String getRole() {
		return role;
	}
	
	/**
	 * set the intern's role
	 * @param role A String containing role of intern
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * get the joining date of intern
	 * @return A String representing the intern's joining date
	 */
	public String getJoiningDate() {
		return joiningDate;
	}
	
	/**
	 * get the intern's joining date
	 * @param joiningDate A String containing intern's joining date
	 */
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	/**
	 * get the intern's mentor
	 * @return A string representing mentor of intern
	 */
	public String getMentor() {
		return mentor;
	}
	
	/**
	 * set the intern's mentor
	 * @param mentor A string containing mentor of intern
	 */
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	
	
	/**
	 * Create a intern without any specific value
	 */
	public Intern()
	{
		
	}
	/**
	 * create an intern with specific email,password, full name, role, joining date, mentor.
	 * @param id The intern's id
	 * @param email The intern's email
	 * @param fullName The intern's full name
	 * @param password The intern's password
	 * @param role The intern's role
	 * @param joiningDate The intern's joining date
	 * @param mentor The intern's mentor
	 */
	public Intern(int id, String email, String fullName, String password, String role, String joiningDate,
			String mentor) {
		super();
		this.id=id;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.role = role;
		this.joiningDate = joiningDate;
		this.mentor = mentor;
	}
	
	
	
}
