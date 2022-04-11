package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import entities.Customer;
import entities.Restaurant;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,String>{
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	@Query("Remove from Customer where customer=:customer")
	public Customer removeCustomer(Customer customer);
	public Customer viewCustomer(Customer customer);
	public List<Customer> viewAllCustomers(Restaurant rest);

}
