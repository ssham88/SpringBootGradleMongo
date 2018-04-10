package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer,String> {
	public Customer findOneById(String Id);
}
