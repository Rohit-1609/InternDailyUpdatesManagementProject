package com.interndailyupdatesmanagement.model;

import javax.persistence.Id;
import javax.persistence.Transient;

public class InternDbSequence
{
	@Transient
	private static final String SEQUENCE_NAME= "intern_sequence";
   @Id
   private String id;
   private int sequenceNumber;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getSequenceNumber() {
	return sequenceNumber;
}
public void setSequenceNumber(int sequenceNumber) {
	this.sequenceNumber = sequenceNumber;
}

public InternDbSequence()
{
	
}
public InternDbSequence(String id, int sequenceNumber) {
	super();
	this.id = id;
	this.sequenceNumber = sequenceNumber;
}
   
   

}
