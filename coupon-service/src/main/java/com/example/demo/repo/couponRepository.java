package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Coupon;
@Repository
public interface couponRepository extends JpaRepository<Coupon, Integer>{
	
	@Query
	public Coupon findByCode(String code);

}
