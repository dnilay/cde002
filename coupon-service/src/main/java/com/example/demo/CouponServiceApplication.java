package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.demo.model.Coupon;
import com.example.demo.repo.couponRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
@EnableEurekaClient
public class CouponServiceApplication implements CommandLineRunner{
private final couponRepository couponRepository;
	public static void main(String[] args) {
		SpringApplication.run(CouponServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Coupon> list=new ArrayList<>();
		list.add(new Coupon(1, "code-1", 10.0, "30th April'22"));
		list.add(new Coupon(2, "code-2", 9.6, "30th April'22"));
		list.add(new Coupon(3, "code-3", 10.1, "30th April'22"));
		list.add(new Coupon(4, "code-4", 11.9, "30th April'22"));
		list.add(new Coupon(5, "code-5", 1.2, "30th April'22"));
		couponRepository.saveAll(list);
	}

}
