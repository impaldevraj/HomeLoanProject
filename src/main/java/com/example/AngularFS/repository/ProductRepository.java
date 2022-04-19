package com.example.AngularFS.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AngularFS.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
