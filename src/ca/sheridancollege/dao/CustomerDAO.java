package ca.sheridancollege.dao;

import java.util.List;

import ca.sheridancollege.Entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);
	
	
}
