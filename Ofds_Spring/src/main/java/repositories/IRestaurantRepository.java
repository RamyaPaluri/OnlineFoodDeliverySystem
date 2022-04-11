package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import entities.Restaurant;

@Repository
public interface IRestaurantRepository extends JpaRepository<Restaurant, Integer> {
	public Restaurant addRestaurant(Restaurant res);
	public Restaurant updateRestaurant(Restaurant res);
	@Query("Remove from Restaurant where restautant=:restaurant")
	public Restaurant removeRestaurant(Restaurant res);
	public Restaurant viewRestaurant(Restaurant res);
	public List<Restaurant> viewAllBearByRestaurant(String location);
	public List<Restaurant> viewRestaurantByItemName(String name);

}
