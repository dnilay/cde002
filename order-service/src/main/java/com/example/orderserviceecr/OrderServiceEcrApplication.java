package com.example.orderserviceecr;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.orderserviceecr.model.Order;
import com.example.orderserviceecr.repo.OrderRepository;

@SpringBootApplication

public class OrderServiceEcrApplication {
	private final OrderRepository orderRepository;

	public OrderServiceEcrApplication(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceEcrApplication.class, args);
	}

	@PostConstruct
	public void loadData() {
		List<Order> list = Stream.of(new Order("Pencil", 2, 12), new Order("Pen", 3, 6), new Order("Book", 1, 700))
				.collect(Collectors.toList());

		orderRepository.saveAll(list);

	}

}
