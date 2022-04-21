package com.example.demo;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
@EnableEurekaClient
@AllArgsConstructor
public class CustomerServiceApplication implements CommandLineRunner {
	private final CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerRepository.save(new Customer(1, UUID.randomUUID().toString(), "John", "Hyd", "john@email.com"));
		customerRepository.save(new Customer(2, UUID.randomUUID().toString(), "Marry", "Banglore", "marry@email.com"));
		customerRepository.save(new Customer(3, UUID.randomUUID().toString(), "Sachin", "Mum", "sachin@email.com"));
		customerRepository.save(new Customer(4, UUID.randomUUID().toString(), "Rahul", "Banglore", "rahul@email.com"));

	}

}