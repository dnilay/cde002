package com.example.demo.controller;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CustomerController {
	
	private final CustomerService customerService;
	private final Environment environment;
	
	@RequestMapping
	public ResponseEntity<String> getStatus()
	{
		return ResponseEntity.ok("customer-service is up and running on port: "+environment.getProperty("local.server.port"));
	}
	@PostMapping("/customers")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(customerService.createCustomer(customer));
	}
	@GetMapping("/customers")
	public ResponseEntity<Iterable<Customer>> fetchAllData()
	{
		return ResponseEntity.ok(customerService.displayAllCustomers());
	}
	

}
