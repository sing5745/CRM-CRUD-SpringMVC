package ca.sheridancollege.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ca.sheridancollege.Entity.Customer;


@Repository
public class CustomerDAOImpl implements CustomerDAO {

	//need to inject the session factory
	
	//getting from xml bean sessionFactory
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		 
		Session currentSession = sessionFactory.getCurrentSession();
				
	Query<Customer> theQuery = 
			currentSession.createQuery("from Customer order by lastName", Customer.class);
	
		List<Customer> customers = theQuery.getResultList();;
		
		return customers;
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(customer);
	}
	
	@Override
	@Transactional
	public Customer getCustomer(int id) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Customer.class, id);
	}

	@Override
	@Transactional
	public void deleteCustomer(int customerID) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		 Customer customer = currentSession.get(Customer.class, customerID);
		 currentSession.delete(customer);
		 
	}
	
	
	

}
