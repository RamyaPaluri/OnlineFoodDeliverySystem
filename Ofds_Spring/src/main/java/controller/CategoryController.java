package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Category;
import services.ICategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {
	@Autowired
	private ICategoryService Repositories;
	@RequestMapping("/addCategory")
	public Category addCategory(@RequestBody Category cat) {
		Category c = Repositories.addCategory(cat);
		return c;
	}
	@RequestMapping("/updateCategory")
	public Category updateCategory(@RequestBody Category cat) {
		Category c = Repositories.updateCategory(cat);
		return c;
	}
	@RequestMapping("/removeCategory")
	public Category removeCategory(@RequestBody Category cat) {
		Category c = Repositories.removeCategory(cat);
		return c;
	}
	@RequestMapping("/viewCategory")
	public Category viewCategory(@RequestBody Category cat) {
		Category c = Repositories.viewCategory(cat);
		return c;
	}
	@GetMapping("/viewAllCategory")
	public List<Category> viewAllCategory() {
		List<Category> c = Repositories.viewAllCategory();
		return c;
	}
	
}