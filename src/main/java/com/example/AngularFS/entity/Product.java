package com.example.AngularFS.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int mobileno;
    private String emailid;
    private int age;
    private String city;
    private String pancard;
    private int cibilscore;
    private String loantype;
    private int loanamount;
    private int netmonthlyincome;
    private String occupation;
    private String companyname;
    private int currentemi;
 
}




