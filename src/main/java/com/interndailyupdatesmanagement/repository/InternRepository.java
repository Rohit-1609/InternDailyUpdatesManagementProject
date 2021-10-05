package com.interndailyupdatesmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.interndailyupdatesmanagement.model.Intern;


@Repository
public interface InternRepository extends MongoRepository<Intern,String>{
 public Intern findInternByEmail(String email);
 public Intern findInternById(Long id);
 public Intern findInternByEmail(String email,String password);
 public Intern findByEmail(String email);
 public Intern findByEmailAndPassword(String email,String password);
 
 
}
