package com.example.orderserviceecr.service;

import com.example.orderserviceecr.model.Order;
import com.example.orderserviceecr.repo.OrderRepository;

import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OrderServiceImpl implements OrderService{
    private final OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> fetchAllOrders() {
        return orderRepository.findAll();
    }

	public OrderServiceImpl(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}
    
}
