package com.travelwebservice.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.travelwebservice.dto.NewDTO;



public interface INewService {
	NewDTO save(NewDTO newDTO);
//	NewDTO update(NewDTO newDTO);
	void delete(long[] ids);
	List<NewDTO> findAll(Pageable pageable);
	int totalItem();
}
