package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Customer;
import com.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/create",method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE )
	public void create(@RequestBody Customer customer) {
		customerService.create(customer);
	}
	
	@RequestMapping(value = "/read/{id}",method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE )
	public Customer read(@PathVariable String id) {
		return customerService.read(id);
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE )
	public void update(@RequestBody Customer customer) {
		customerService.update(customer);
	}
	
	@RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		customerService.delete(id);
	}
	
}
