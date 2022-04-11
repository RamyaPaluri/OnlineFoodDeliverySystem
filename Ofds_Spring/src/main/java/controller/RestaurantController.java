package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entities.Restaurant;
import services.IRestaurantService;

@RestController
@RequestMapping("/api")
public class RestaurantController {
	@Autowired
	private IRestaurantService Repositories;
	@RequestMapping("/addRestaurant")
	public Restaurant addRestaurant(@RequestBody Restaurant res) {
		Restaurant rest = Repositories.addRestaurant(res);
		return rest;
	}@RequestMapping("/updateRestaurant")
	public Restaurant updateRestaurant(@RequestBody Restaurant res) {
		Restaurant rest = Repositories.updateRestaurant(res);
		return rest;
	}
	@RequestMapping("/removeRestaurant")
	public Restaurant removeRestaurant(@RequestBody Restaurant res) {
		Restaurant rest = Repositories.removeRestaurant(res);
		return rest;
	}
	@RequestMapping("/viewRestaurant")
	public Restaurant viewRestaurant(@RequestBody Restaurant res) {
		Restaurant rest = Repositories.viewRestaurant(res);
		return rest;
	}
	@GetMapping("/viewAllBearByRestaurant")
	public List<Restaurant> viewAllBearByRestaurant(@RequestParam String location) {
	    List<Restaurant> rest = Repositories.viewAllBearByRestaurant(location);
	return rest;
	}
	@GetMapping("/viewRestaurantByItemName")
	public List<Restaurant> viewRestaurantByItemName(@RequestParam String name) {
	    List<Restaurant> rest = Repositories.viewRestaurantByItemName(name);
	return rest;
	}
}