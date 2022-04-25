package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.CouponProxy;

@FeignClient("COUPON-WS")
public interface CouponClient {
	@GetMapping("/coupons/{code}")
	public CouponProxy getCouponByCode(@PathVariable("code") String code);

}
