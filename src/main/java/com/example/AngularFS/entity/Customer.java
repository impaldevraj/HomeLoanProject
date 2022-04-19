package com.example.AngularFS.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.criteria.Order;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER")
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    private String fullname;
    private String email;
    private String password;
    private long phone;
    private String address;
    
   
}

