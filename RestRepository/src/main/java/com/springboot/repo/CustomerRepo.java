package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springboot.entity.Customer;


@RepositoryRestResource(path = "customer")
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
