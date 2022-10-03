package com.hermesHR.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hermesHR.dsmeta.entities.Sale;
import com.hermesHR.dsmeta.repositories.SaleRepository;

@Service
public class SalesService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
