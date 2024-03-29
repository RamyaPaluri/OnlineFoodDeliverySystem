package services;

import java.util.List;

import entities.*;

public interface IItemService {
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item viewItem(Item item);
	public Item removeItem(Item item);
	public List<Item> viewAllItems(Category cat);
	public List<Item> viewAllItems(Restaurant res);
	public List<Item> viewAllItemsByName(String name);

}
