package com.foodie.app.repository;

import java.util.List;

import com.foodie.app.model.Customer;
import com.foodie.app.util.CsvReader;

public class CustomerRepository {
	private List<Customer> customersList;

	public CustomerRepository() {
		CsvReader csvReader = new CsvReader();
		this.customersList = csvReader.readcustomersFromCsv();
	}
	public List<Customer> getAllCustomers(){
		return this.customersList;
	}
	public Customer save(Customer customer) {
		this.customersList.add(customer);
		return customer;
	}
	

}
