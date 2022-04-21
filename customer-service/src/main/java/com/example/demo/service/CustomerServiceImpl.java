package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService{
	private final CustomerRepository customerRepository;
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Iterable<Customer> displayAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

}
