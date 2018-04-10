package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	public void create(Customer customer) {
		customerRepository.save(customer);
	}
	
	public Customer read(String id) {
		return customerRepository.findOneById(id);
	}
	
	public void update(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void delete(String id) {
		customerRepository.deleteById(id);
	}
}
