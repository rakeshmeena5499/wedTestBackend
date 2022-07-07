package com.wedtestbackend.repository;

import java.util.Optional;

import com.wedtestbackend.entity.UserEntity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {

    Optional<UserEntity> findByEmail(String email);
	Optional<UserEntity> findByPhoneNumber(String phoneNumber);
	
    
}
