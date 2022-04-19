package com.example.AngularFS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AngularFS.entity.Loan;

 
 public interface LoanRepository extends JpaRepository<Loan,Integer> {
	Loan findByName(String name);
}
