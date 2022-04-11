package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Customer;
import entities.OrderDetails;
import entities.Restaurant;
import services.IOrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
	@Autowired
	private IOrderService Repositories;
	@RequestMapping("/addOrder")
	public OrderDetails addOrder(@RequestBody OrderDetails order) {
		OrderDetails ord = Repositories.addOrder(order);
		return ord;
	}
	@RequestMapping("/updateOrder")
	public OrderDetails updateOrder(@RequestBody OrderDetails order) {
		OrderDetails ord = Repositories.updateOrder(order);
		return ord;
	}
	@RequestMapping("/removeOrder")
	public OrderDetails removeOrder(@RequestBody OrderDetails order) {
		OrderDetails ord = Repositories.removeOrder(order);
		return ord;
	}
	@RequestMapping("/viewOrder")
	public OrderDetails viewOrder(@RequestBody OrderDetails order) {
		OrderDetails ord = Repositories.viewOrder(order);
		return ord;
	}
	@GetMapping("/viewAllOrders()")
	public List<OrderDetails> viewAllOrders(Restaurant rest){
		List<OrderDetails> ord = Repositories.viewAllOrders(rest);
		return ord;
	}
	@GetMapping("/viewAllOrders()")
	public List<OrderDetails> viewAllOrders(Customer customer){
		List<OrderDetails> ord = Repositories.viewAllOrders(customer);
		return ord;
	}
}