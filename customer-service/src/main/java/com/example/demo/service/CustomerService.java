package com.example.demo.service;

import com.example.demo.model.Customer;

public interface CustomerService {
	
	public Customer createCustomer(Customer customer);
	
	public Iterable<Customer> displayAllCustomers();

}
