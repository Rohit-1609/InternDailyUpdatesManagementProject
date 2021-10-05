package com.interndailyupdatesmanagement.model;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Rohit T
 * @version 1.0
 * @since 1.0
 */
@Document(collection="rohitdata1")
public class DailyUpdates 
{
	/**
	 * Represents the dailyUpdates's id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    int id;
	
	/**
	 * Represents the dailyUpdates's topic name
	 */
	@Column(length=40,name="topicName")
	String topicName;
	
	/**
	 * Represents the description of daily updates
	 */
	@Column(length=40,name="description")
	String description;
	
	/**
	 * Represents the name of the issue
	 */
	@Column(length=40,name="nameOfTheIssue")
	String nameOfTheIssue;

	/**
	 * Represents solution tried
	 */
	@Column(length=40,name="solutionTried")
	String solutionTried;
	
	/**
	 * Represents solution worked
	 */
	@Column(length=40,name="solutionWorked")
	String solutionWorked;
	
	/**
	 * Represents the reference urls
	 */
	@Column(length=40,name="referenceUrls")
	String referenceUrls;
	
	/**
	 * Represents the hours
	 */
	@Column(length=40,name="hours")
	String hours;
	
	/**
	 * Represents date of daily updates
	 */
	@Column(length=40,name="date")
	String date;
	
	/**
	 * Represents assignment details
	 */
	@Column(length=40,name="assignmentDetails")
	String assignmentDetails;
	
	
	
	
	/**get the daily updates id
	 * @return A integer representing the id of daily updates
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * set the daily updates id 
	 * @param id A integer containing id of daily updates
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * get the daily updates topics name
	 * @return A String representing daily update's topic name
	 */
	public String getTopicName() {
		return topicName;
	}
	
	/**
	 * set the daily updates topic name
	 * @param topicName A String containing topic name of daily updates
	 */
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
	/**
	 * get the description of daily updates topics
	 * @return A String representing description of topic
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * set the description of topics
	 * @param description A String containing description of topic
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * get the name of the issue in an assignment 
	 * @return A String representing name of the issue faced in assignment
	 */
	public String getNameOfTheIssue() {
		return nameOfTheIssue;
	}
	
	/**
	 * set the name of the issue faced in an assignment
	 * @param nameOfTheIssue A String containing name of the issue faced in an assignment
	 */
	public void setNameOfTheIssue(String nameOfTheIssue) {
		this.nameOfTheIssue = nameOfTheIssue;
	}
	
	/**
	 * get the solution tried to solve the issue
	 * @return A string representing solution tried to solve the issue
	 */
	public String getSolutionTried() {
		return solutionTried;
	}
	
	/**
	 * set the solution tried to solve the issue
	 * @param solutionTried A string containing solution tried to solve the issue
	 */
	public void setSolutionTried(String solutionTried) {
		this.solutionTried = solutionTried;
	}
	
	/**
	 * get the solution worked to solve the issue
	 * @return A string representing solution worked to solve the issue
	 */
	public String getSolutionWorked() {
		return solutionWorked;
	}
	
	/**
	 * set the solution worked to solve the issue
	 * @param solutionWorked A string containing solution worked to solve the issue
	 */
	public void setSolutionWorked(String solutionWorked) {
		this.solutionWorked = solutionWorked;
	}
	
	/**
	 * get the reference url
	 * @return A String representing reference urls 
	 */
	public String getReferenceUrls() {
		return referenceUrls;
	}
	
	/**
	 * set the reference urls
	 * @param referenceUrls A string containinf reference urls
	 */
	public void setReferenceUrls(String referenceUrls) {
		this.referenceUrls = referenceUrls;
	}
	
	/**
	 * get the total hours to study the topic
	 * @return A integer representing total hour to study the topic
	 */
	public String getHours() {
		return hours;
	}
	
	/**
	 * set the total hours to study the topic
	 * @param hours A integer representing hour to study the topic
	 */
	public void setHours(String hours) {
		this.hours = hours;
	}
	
	/**
	 * get the date of daily updates
	 * @return A String representing date of the daily updates
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * set the date of the daily updates
	 * @param date A string containing date of the daily updates
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/**
	 * get the assignment details of topic
	 * @return A string representing assignment details of the topics
	 */
	public String getAssignmentDetails() {
		return assignmentDetails;
	}
	
	/**
	 * set the assignment details of topic
	 * @param assignmentDetails A string containing assignment details of topic
	 */
	public void setAssignmentDetails(String assignmentDetails) {
		this.assignmentDetails = assignmentDetails;
	}
	
	/**
	 * 
	 */
	public DailyUpdates()
	{
		
	}
	
	/**
	 * creating the daily updates with the specific id, topic name, description, nameof the issue, solution tried, solution worked,
	 * ,reference urls, hours, date, assignment details.
	 * @param id The daily updates's id
	 * @param topicName The daily updates's topic name
	 * @param description The daily updates's topics description
	 * @param nameOfTheIssue The name of the issues occur in assignment
	 * @param solutionTried The solution tried to solve the issue
	 * @param solutionWorked The solution worked to solve issue
	 * @param referenceUrls The topics information reference urls
	 * @param hours The daily updates total hours
	 * @param date The daily updates date
	 * @param assignmentDetails The daily updates's assignment details of topics
	 */
	public DailyUpdates(int id, String topicName, String description, String nameOfTheIssue, String solutionTried,
			String solutionWorked, String referenceUrls, String hours, String date, String assignmentDetails) {
		super();
		this.id = id;
		this.topicName = topicName;
		this.description = description;
		this.nameOfTheIssue = nameOfTheIssue;
		this.solutionTried = solutionTried;
		this.solutionWorked = solutionWorked;
		this.referenceUrls = referenceUrls;
		this.hours = hours;
		this.date = date;
		this.assignmentDetails = assignmentDetails;
	}
	
	
	
	
	
}
