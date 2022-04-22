package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String code;
	private double discount;
	private String expDate;

}
