package com.interndailyupdatesmanagement.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.interndailyupdatesmanagement.model.DailyUpdates;

@Repository
public interface DailyUpdatesRepository extends MongoRepository<DailyUpdates,String>{

	DailyUpdates findAllById(Long id);

}
