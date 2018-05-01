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
		
//		List<Student> theStudents = 
//		
	Query<Customer> theQuery = 
			currentSession.createQuery("from Customer", Customer.class);
//		
		List<Customer> customers = theQuery.getResultList();;
		
		return customers;
	}

}
