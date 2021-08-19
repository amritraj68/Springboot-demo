package com.practice.aiq.dao;

import org.springframework.data.repository.CrudRepository;

import com.practice.aiq.model.UserRegistration;

public interface UserRepo extends CrudRepository<UserRegistration,Integer>
{

}
