package services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import entities.Customer;
import entities.OrderDetails;
import entities.Restaurant;
import repositories.IOrderRepository;

public class IOrderServiceImpl implements IOrderService {
	@Autowired
	IOrderRepository repositories;

	@Override
	@Transactional
	public OrderDetails addOrder(OrderDetails order) {
		OrderDetails od=null;
		od=repositories.addOrder(order);
		return od;
	}

	@Override
	@Transactional
	public OrderDetails updateOrder(OrderDetails order) {
		OrderDetails od=null;
		od=repositories.updateOrder(order);
		return od;
	}

	@Override
	@Transactional
	public OrderDetails removeOrder(OrderDetails order) {
		OrderDetails od=null;
		od=repositories.removeOrder(order);
		return od;
	}

	@Override
	@Transactional
	public OrderDetails viewOrder(OrderDetails order) {
		OrderDetails od=null;
		od=repositories.viewOrder(order);
		return od;
	}

	@Override
	@Transactional
	public List<OrderDetails> viewAllOrders(Restaurant res) {
		List<OrderDetails> od=repositories.viewAllOrders(res);
		return od;
	}

	@Override
	@Transactional
	public List<OrderDetails> viewAllOrders(Customer customer) {
		List<OrderDetails> od=repositories.viewAllOrders(customer);
		return od;
	}

}
