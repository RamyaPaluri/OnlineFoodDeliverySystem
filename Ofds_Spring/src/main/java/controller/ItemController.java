package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entities.Category;
import entities.Item;
import entities.Restaurant;
import services.IItemService;

@RestController
@RequestMapping("/api")
public class ItemController {
	@Autowired
	private IItemService Repositories;
	@RequestMapping("/addItem")
	public Item addItem(@RequestBody Item item) {
		Item itm = Repositories.addItem(item);
		return itm;
	}
	@RequestMapping("/updateItem")
	public Item updateItem(@RequestBody Item item) {
		Item itm = Repositories.updateItem(item);
		return itm;
	}
	@RequestMapping("/viewItem")
	public Item viewItem(@RequestBody Item item) {
		Item itm = Repositories.viewItem(item);
		return itm;
	}
	@RequestMapping("/removeItem")
	public Item removeItem(@RequestBody Item item) {
		Item itm = Repositories.removeItem(item);
		return itm;
	}
	@GetMapping("/viewAllItems()")
	public List<Item> viewAllItems(Category cat){
		List<Item> itm = Repositories.viewAllItems(cat);
		return itm;
	}
	@GetMapping("/viewAllItems()")
	public List<Item> viewAllItems(Restaurant res){
		List<Item> itm = Repositories.viewAllItems(res);
		return itm;
	}
	@GetMapping("/viewAllItemsByName")
	public List<Item> viewAllItemsByName(@RequestParam String name) {
	    List<Item> itm = Repositories.viewAllItemsByName(name);
	return itm;
	}
}