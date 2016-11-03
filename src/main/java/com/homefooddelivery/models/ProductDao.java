package com.homefooddelivery.models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ProductDao extends CrudRepository<Product, Integer> {
	
	Iterable<Product> findAll();
	
}
