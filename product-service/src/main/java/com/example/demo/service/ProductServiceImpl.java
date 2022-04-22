package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

	private final ProductRepository productRepository;
	@Override
	public Product createProduct(Product product) {
		
		return productRepository.save(product);
	}

}
