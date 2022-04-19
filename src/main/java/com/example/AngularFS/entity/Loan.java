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
@Table(name = "LOAN_TBL")
public class Loan {

    @Id
    @GeneratedValue
    private String name; 
    private int id;
    private int cibilscore;
    private int grosssalary;
    private int netsalary;
    private int currentemi;
 
}
