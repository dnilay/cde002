package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.OrderDao;
import com.example.demo.model.Order;

@SpringBootApplication
public class OrderServiceCiCdAwsDemoApplication {

	private final OrderDao orderDao;

	@Autowired
	public OrderServiceCiCdAwsDemoApplication(OrderDao orderDao) {

		this.orderDao = orderDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceCiCdAwsDemoApplication.class, args);
	}

	@PostConstruct
	public void loadData() {

		List<Order> list=Stream.of(new Order("Pen", 2, 4L,true),
				new Order("Desktop", 1, 999L,false),
				new Order("Laptop", 3, 8989L,true)).collect(Collectors.toList());
		
		orderDao.saveAll(list);
	}

}
