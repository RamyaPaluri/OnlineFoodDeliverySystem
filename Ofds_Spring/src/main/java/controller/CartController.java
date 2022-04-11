package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.FoodCart;
import services.ICartService;

@RestController
@RequestMapping("/api")
public class CartController {
	@Autowired
	private ICartService Repositories;
	@RequestMapping("/addItemToCart")
	public FoodCart addItemToCart(@RequestBody FoodCart food) {
		FoodCart fc = Repositories.addItemToCart(food, null);
		return fc;
	}
	@RequestMapping("/increaseQuantity")
	public FoodCart increaseQuantity(@RequestBody FoodCart food) {
		FoodCart fc = Repositories.increaseQuantity(food, null, 0);
		return fc;
	}
	@RequestMapping("/reduceQuantity")
	public FoodCart reduceQuantity(@RequestBody FoodCart food) {
		FoodCart fc = Repositories.reduceQuantity(food, null, 0);
		return fc;
	}
	@RequestMapping("/removeItem")
	public FoodCart removeItem(@RequestBody FoodCart food) {
		FoodCart fc = Repositories.removeItem(food, null);
		return fc;
	}
	@RequestMapping("/clearCart")
	public FoodCart clearCart(@RequestBody FoodCart food) {
		FoodCart fc = Repositories.clearCart(food);
		return fc;
	}
}