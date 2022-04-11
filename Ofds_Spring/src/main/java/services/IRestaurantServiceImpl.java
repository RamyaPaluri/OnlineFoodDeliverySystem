package services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import entities.Restaurant;
import repositories.IRestaurantRepository;

public class IRestaurantServiceImpl implements IRestaurantService {
	@Autowired
	IRestaurantRepository repositories;

	@Override
	@Transactional
	public Restaurant addRestaurant(Restaurant res) {
		Restaurant rest=null;
		rest=repositories.addRestaurant(res);
		return rest;
	}

	@Override
	@Transactional
	public Restaurant updateRestaurant(Restaurant res) {
		Restaurant rest=null;
		rest=repositories.updateRestaurant(res);
		return rest;
	}

	@Override
	@Transactional
	public Restaurant removeRestaurant(Restaurant res) {
		Restaurant rest=null;
		rest=repositories.removeRestaurant(res);
		return rest;
	}

	@Override
	@Transactional
	public Restaurant viewRestaurant(Restaurant res) {
		Restaurant rest=null;
		rest=repositories.viewRestaurant(res);
		return rest;
	}

	@Override
	@Transactional
	public List<Restaurant> viewAllBearByRestaurant(String location) {
		List<Restaurant> rest=repositories.viewAllBearByRestaurant(location);
		return rest;
	}

	@Override
	@Transactional
	public List<Restaurant> viewRestaurantByItemName(String name) {
		List<Restaurant> rest=repositories.viewRestaurantByItemName(name);
		return rest;
	}

}
