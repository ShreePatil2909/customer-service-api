package com.prowings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.Customer;
import com.prowings.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;

	@PostMapping("/create")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
		Customer saveCustomer = service.saveCustomer(customer);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveCustomer);
	}

	@GetMapping("/get")
	public List<Customer> getCustomer() {
		return service.getCustomer();
	}

	@GetMapping("/id/{id}")
	public Customer getByID(@PathVariable int id) {
		return service.getByID(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteByID(@PathVariable int id) {
		service.deleteByID(id);

		return "Delete Successfully this id " + id + " Customer !!";
	}
	
	@GetMapping("/cibil")
	public List<Customer> cibilScoreOrder(){
		return service.cibilScoreOrder();
	}
}
