package com.travelwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travelwebservice.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
