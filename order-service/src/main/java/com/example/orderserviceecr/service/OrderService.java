package com.example.orderserviceecr.service;

import com.example.orderserviceecr.model.Order;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public interface OrderService {

   Order createOrder(Order order);
   List<Order> fetchAllOrders();
}
