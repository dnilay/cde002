package com.example.orderserviceecr.controller;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderserviceecr.model.Order;
import com.example.orderserviceecr.service.OrderService;

@RestController

public class OrderController {
	private final OrderService orderService;
	private final Environment environment;

	public OrderController(OrderService orderService, Environment environment) {
		super();
		this.orderService = orderService;
		this.environment = environment;
	}

	@RequestMapping("/status")
	public ResponseEntity<String> getStatus() {
		return ResponseEntity
				.ok("order-service is up and running on port:" + environment.getProperty("local.server.port"));
	}

	@PostMapping("/orders")
	public ResponseEntity<Order> createOrder(@RequestBody Order order) {
		return ResponseEntity.status(HttpStatus.CREATED).body(orderService.createOrder(order));
	}

	@GetMapping("/orders")
	public ResponseEntity<List<Order>> fetchAllOrders() {
		return ResponseEntity.ok(orderService.fetchAllOrders());
	}
}
