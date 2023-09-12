package com.prowings.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.dao.CustomerDao;
import com.prowings.model.Customer;
import com.prowings.model.cibilComparator;

@Service
public class ServiceImpl implements CustomerService {

	@Autowired
	CustomerDao dao;

	@Override
	public Customer saveCustomer(Customer customer) {
		return dao.save(customer);
	}

	@Override
	public List<Customer> getCustomer() {
		return dao.findAll();
	}

	@Override
	public Customer getByID(int id) {
		return dao.findById(id).get();
	}

	@Override
	public void deleteByID(int id) {
		dao.deleteById(id);
	}

	@Override
	public List<Customer> cibilScoreOrder() {

		List<Customer> findAll = dao.findAll();
		Collections.sort(findAll, new cibilComparator());

		return findAll;
	}

}
