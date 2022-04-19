package com.example.AngularFS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.AngularFS.entity.Loan;
import com.example.AngularFS.service.LoanService;

import java.util.List;

@RestController
public class LoanController {

    @Autowired
    private LoanService service;

    @PostMapping("/addLoan")
    public Loan addProduct(@RequestBody Loan product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addLoans")
    public List<Loan> addProducts(@RequestBody List<Loan> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/Loans")
    public List<Loan> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/loansById/{id}")
    public Loan findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/loan/{name}")
    public Loan findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/updates")
    public Loan updateProduct(@RequestBody Loan product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/deletes/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
