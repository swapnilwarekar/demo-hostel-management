package com.open.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.learn.model.Hostel;
import com.open.learn.repository.HostelRepository;

@Service
public class HostelService {

	@Autowired
	private HostelRepository repository;
	
	public List<Hostel> findAllHostel() {
		return repository.findAll();
	}
}
