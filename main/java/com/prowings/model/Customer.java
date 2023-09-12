package com.prowings.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer {
 
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	Integer id; 
	
	String name;  
	String city;
	String sex;
	int loanAmmount;
	Integer cibilScore;
	String businessType;
	String aadharNumber;
	String panNumber;
}
