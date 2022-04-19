package com.example.AngularFS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AngularFS.entity.Customer;
import com.example.AngularFS.repository.CustomerRepository;

@Service
public class CustomerService {
	//post/create
    @Autowired
    private CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> saveCustomers(List<Customer> customers) {
        return repository.saveAll(customers);
    }
    
    //get/read

    public List<Customer> getCustomers() {
        return repository.findAll();
    }

    public Customer getCustomerById(int cid) {
        return repository.findById(cid).orElse(null);
    }

    public Customer getCustomerByemail(String email) {
        return repository.findByEmail(email);
    }
    
    //delete

    public String deleteCustomer(int cid) {
        repository.deleteById(cid);
        return "Customer removed !! " + cid;
    }
    
    //update

    public Customer updateCustomer(Customer customer) {
    	Customer existingCustomer = repository.findById(customer.getCid()).orElse(null);
        existingCustomer.setFullname(customer.getFullname());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setPassword(customer.getPassword());
        existingCustomer.setPhone(customer.getPhone());
        existingCustomer.setAddress(customer.getAddress());
        return repository.save(existingCustomer);
    }
}

