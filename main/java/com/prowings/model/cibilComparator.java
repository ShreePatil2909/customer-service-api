package com.prowings.model;

import java.util.Comparator;

public class cibilComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getCibilScore().compareTo(o2.getCibilScore());
	}

}
