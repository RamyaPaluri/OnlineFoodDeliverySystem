package services;
import java.util.List;

import entities.*;

public interface IRestaurantService {
	public Restaurant addRestaurant(Restaurant res);
	public Restaurant updateRestaurant(Restaurant res);
	public Restaurant removeRestaurant(Restaurant res);
	public Restaurant viewRestaurant(Restaurant res);
	public List<Restaurant> viewAllBearByRestaurant(String location);
	public List<Restaurant> viewRestaurantByItemName(String name);

}
