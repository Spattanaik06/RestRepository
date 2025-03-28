package com.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor

@Table(name = "Customer_RestRepo")
public class Customer 
{
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerid;
	private String customerName;
	private Double customerSalary;
}
