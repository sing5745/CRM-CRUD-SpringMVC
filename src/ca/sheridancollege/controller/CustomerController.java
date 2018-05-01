package ca.sheridancollege.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ca.sheridancollege.Entity.Customer;
import ca.sheridancollege.dao.CustomerDAO;
import ca.sheridancollege.dao.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		List<Customer> theCustomers = customerDAO.getCustomers();
		
	   model.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
	
	@RequestMapping("/")
	public String welcome(Model model) {
		
		return "welcome";
	}
}
