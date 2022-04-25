package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ProductRepository;
import com.example.demo.entity.Product;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class MyProductServiceApplication implements CommandLineRunner{
	
	private final ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1, UUID.randomUUID().toString(), "Pen", 1.9));
		list.add(new Product(2, UUID.randomUUID().toString(), "Pencil", 2.9));
		list.add(new Product(3, UUID.randomUUID().toString(), "PenDrive", 12.9));
		list.add(new Product(4, UUID.randomUUID().toString(), "Laptop", 2119.0));
		list.add(new Product(5, UUID.randomUUID().toString(), "Camera", 399.9));
		productRepository.saveAll(list);
		
	}

}
