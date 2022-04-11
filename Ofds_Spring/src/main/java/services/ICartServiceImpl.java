package services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import entities.FoodCart;
import entities.Item;
import repositories.ICartRepository;

public class ICartServiceImpl implements ICartService {
	@Autowired
	ICartRepository repositories;

	@Override
	@Transactional
	public FoodCart addItemToCart(FoodCart cart, Item item) {
		FoodCart food=null;
		food=repositories.addItemToCart(cart, item);
		return food;
	}

	@Override
	@Transactional
	public FoodCart increaseQuantity(FoodCart cart, Item item, int quantity) {
		FoodCart food=null;
		food=repositories.increaseQuantity(cart, item, quantity);
		return food;
	}

	@Override
	@Transactional
	public FoodCart reduceQuantity(FoodCart cart, Item item, int quantity) {
		FoodCart food=null;
		food=repositories.reduceQuantity(cart, item, quantity);
		return food;
	}

	@Override
	@Transactional
	public FoodCart removeItem(FoodCart cart, Item item) {
		FoodCart food=null;
		food=repositories.removeItem(cart, item);
		return food;
	}

	@Override
	@Transactional
	public FoodCart clearCart(FoodCart cart) {
		FoodCart food=null;
		food=repositories.clearCart(cart);
		return food;
	}

}
