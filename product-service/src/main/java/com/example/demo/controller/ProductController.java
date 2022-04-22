package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.CouponProxy;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ProductController {
	
	private final RestTemplate restTemplate;

	private final ProductService productService;
	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody Product product)
	{
		CouponProxy couponProxy=restTemplate.getForObject("http://localhost:8888/COUPON-WS/coupons/"+product.getCouponCode(), CouponProxy.class);
		
		product.setPrice(product.getPrice()-couponProxy.getDiscount());
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(product));
	}
	
}
