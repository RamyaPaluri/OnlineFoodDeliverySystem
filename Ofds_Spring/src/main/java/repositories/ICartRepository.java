package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import entities.FoodCart;
import entities.Item;

@Repository
public interface ICartRepository extends JpaRepository<FoodCart,Integer>{
	public FoodCart addItemToCart(FoodCart cart, Item item);
	public FoodCart increaseQuantity(FoodCart cart, Item item, int quantity);
	public FoodCart reduceQuantity(FoodCart cart, Item item, int quantity);
	@Query("Remove from FoodCart where item=:item")
	public FoodCart removeItem(FoodCart cart, Item item);
	public FoodCart clearCart(FoodCart cart);

}
