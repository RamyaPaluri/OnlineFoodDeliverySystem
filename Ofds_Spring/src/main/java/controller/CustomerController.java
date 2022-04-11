package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Customer;
import services.ICustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private ICustomerService Repositories;
	@RequestMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		Customer c = Repositories.addCustomer(customer);
		return c;
	}
	@RequestMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		Customer c = Repositories.updateCustomer(customer);
		return c;
	}
	@RequestMapping("/removeCustomer")
	public Customer removeCustomer(@RequestBody Customer customer) {
		Customer c = Repositories.removeCustomer(customer);
		return c;
	}
	@RequestMapping("/viewCustomer")
	public Customer viewCustomer(@RequestBody Customer customer) {
		Customer c = Repositories.viewCustomer(customer);
		return c;
	}
	@GetMapping("/viewAllCustomers()")
	public List<Customer> viewAllCustomers() {
		List<Customer> c = Repositories.viewAllCustomers(null);
		return c;
	}

}