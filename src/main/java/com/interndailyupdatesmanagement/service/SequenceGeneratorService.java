package com.interndailyupdatesmanagement.service;
import  org.springframework.data.mongodb.core.*;


import java.util.Objects;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.interndailyupdatesmanagement.model.InternDbSequence;

@Service
public class SequenceGeneratorService
{
   @Autowired
	private MongoOperations mongoOperations;
	
	public int getSequenceNumber(String sequenceName)
	{
		Query query = new Query(Criteria.where("id").is(sequenceName));
		Update update= new Update().inc(sequenceName, 1);
		InternDbSequence counter= mongoOperations.findAndModify(query, update, options().returnNew(true).upsert(true), InternDbSequence.class);
		
		return !Objects.isNull(counter)? counter.getSequenceNumber():1;
		
	}
}
