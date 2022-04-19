package com.example.AngularFS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.AngularFS.entity.Customer;
import com.example.AngularFS.service.CustomerService;

@CrossOrigin("http://localhost:4200")
@RestController
public class CustomerController {

    @Autowired
    private  CustomerService service;

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.saveCustomer(customer);
    }

    @PostMapping("/addcustomers")
    public List<Customer> addCustomers(@RequestBody List<Customer> customers) {
        return service.saveCustomers(customers);
    }

    @GetMapping("/customer")
    public List<Customer> findAllCustomers() {
        return service.getCustomers();
    }

    @GetMapping("/customerById/{cid}")
    public Customer findCustomerById(@PathVariable int cid) {
        return service.getCustomerById(cid);
    }

    @GetMapping("/customerById/{name}")
    public Customer findCustomertByEmail(@PathVariable String email) {
        return service.getCustomerByemail(email);
    }

    @PutMapping("/updatecustomer/{cid}")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return service.updateCustomer(customer);
    }

    @DeleteMapping("/deletecustomer/{cid}")
    public String deleteCustomer(@PathVariable int cid) {
        return service.deleteCustomer(cid);
    }
}