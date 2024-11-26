package com.travelwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travelwebservice.entity.NewsEntity;

public interface NewRepository extends JpaRepository<NewsEntity, Long> {
//	NewsEntity findOne(Long id);
}
