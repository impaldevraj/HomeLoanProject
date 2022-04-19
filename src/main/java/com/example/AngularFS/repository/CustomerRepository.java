package com.example.AngularFS.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AngularFS.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	 Customer findByEmail(String email);
	 

}