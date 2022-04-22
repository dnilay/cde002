package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Coupon;
import com.example.demo.repo.couponRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class CouponServiceImpl implements CouponService{
private final couponRepository couponRepository;
	@Override
	public Coupon findCouponByCode(String code) {
		
		return couponRepository.findByCode(code);
	}

}
