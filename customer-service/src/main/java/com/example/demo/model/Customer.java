package com.example.demo.model;

import javax.persistence.Column;
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
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "customer_id",unique = true,nullable = false)
	private String customerId;
	@Column(name = "customer_name",nullable = false)
	private String customerName;
	@Column(name = "customer_address",nullable = false)
	private String cutomerAddress;
	@Column(name = "customer_email",unique = true,nullable = false)
	private String customerEmail;

}
