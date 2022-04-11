package services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import entities.Customer;
import entities.Restaurant;
import repositories.ICustomerRepository;

public class ICustomerServiceImpl implements ICustomerService {
	@Autowired
	ICustomerRepository repositories;

	@Override
	@Transactional
	public Customer addCustomer(Customer customer) {
		Customer cust=null;
		cust=repositories.addCustomer(customer);
		return cust;
	}

	@Override
	@Transactional
	public Customer updateCustomer(Customer customer) {
		Customer cust=null;
		cust=repositories.updateCustomer(customer);
		return cust;
	}

	@Override
	@Transactional
	public Customer removeCustomer(Customer customer) {
		Customer cust=null;
		cust=repositories.removeCustomer(customer);
		return cust;
	}

	@Override
	@Transactional
	public Customer viewCustomer(Customer customer) {
		Customer cust=null;
		cust=repositories.viewCustomer(customer);
		return cust;
	}

	@Override
	@Transactional
	public List<Customer> viewAllCustomers(Restaurant rest) {
		List<Customer> cust=repositories.viewAllCustomers(rest);
		return cust;
	}

}
