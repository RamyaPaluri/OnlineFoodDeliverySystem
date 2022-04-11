package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import entities.Category;
import entities.Item;
import entities.Restaurant;

@Repository
public interface IItemRepository extends JpaRepository<Item,String>{
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item viewItem(Item item);
	@Query("Remove from Item where item=:item")
	public Item removeItem(Item item);
	public List<Item> viewAllItems(Category cat);
	public List<Item> viewAllItems(Restaurant res);
	public List<Item> viewAllItemsByName(String name);
	
}
