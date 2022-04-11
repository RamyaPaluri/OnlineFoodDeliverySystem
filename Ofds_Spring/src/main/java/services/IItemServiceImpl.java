package services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import entities.Category;
import entities.Item;
import entities.Restaurant;
import repositories.IItemRepository;

public class IItemServiceImpl implements IItemService {
	@Autowired
	IItemRepository repositories;

	@Override
	@Transactional
	public Item addItem(Item item) {
		Item itm=null;
		itm=repositories.addItem(item);
		return itm;
	}

	@Override
	@Transactional
	public Item updateItem(Item item) {
		Item itm=null;
		itm=repositories.updateItem(item);
		return itm;
	}

	@Override
	@Transactional
	public Item viewItem(Item item) {
		Item itm=null;
		itm=repositories.viewItem(item);
		return itm;
	}

	@Override
	@Transactional
	public Item removeItem(Item item) {
		Item itm=null;
		itm=repositories.removeItem(item);
		return itm;
	}

	@Override
	@Transactional
	public List<Item> viewAllItems(Category cat) {
		List<Item> itm=repositories.viewAllItems(cat);
		return itm;
	}

	@Override
	@Transactional
	public List<Item> viewAllItems(Restaurant res) {
		List<Item> itm=repositories.viewAllItems(res);
		return itm;
	}

	@Override
	@Transactional
	public List<Item> viewAllItemsByName(String name) {
		List<Item> itm=repositories.viewAllItemsByName(name);
		return itm;
	}

}
