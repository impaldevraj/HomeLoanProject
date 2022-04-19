package com.example.AngularFS.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AngularFS.entity.Loan;
import com.example.AngularFS.repository.LoanRepository;

import java.util.List;

@Service
public class LoanService {
   @Autowired
   private LoanRepository repository;

   public Loan saveProduct(Loan product) {
       return repository.save(product);
   }

   public List<Loan> saveProducts(List<Loan> products) {
       return repository.saveAll(products);
   }

   public List<Loan> getProducts() {
       return repository.findAll();
   }

   public Loan getProductById(int id) {
       return repository.findById(id).orElse(null);
   }

   public Loan getProductByName(String name) {
       return repository.findByName(name);
   }

   public String deleteProduct(int id) {
       repository.deleteById(id);
       return "product removed !! " + id;
   }

   public Loan updateProduct(Loan product) {
	   Loan existingProduct = repository.findById(product.getId()).orElse(null);
       existingProduct.setCibilscore(product.getCibilscore());
       existingProduct.setGrosssalary(product.getGrosssalary());
       existingProduct.setNetsalary(product.getNetsalary());
       existingProduct.setCurrentemi(product.getCurrentemi());
      
       return repository.save(existingProduct);
   }


}
