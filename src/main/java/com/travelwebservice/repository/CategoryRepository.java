package com.travelwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travelwebservice.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findOneByCode(String code);
}
