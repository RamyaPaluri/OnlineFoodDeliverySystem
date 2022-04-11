package services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import entities.Category;
import repositories.ICategoryRepository;

public class ICategoryServiceImpl implements ICategoryService {
	@Autowired
	ICategoryRepository repositories;

	@Override
	@Transactional
	public Category addCategory(Category cat) {
		Category cate=null;
		cate=repositories.addCategory(cat);
		return cate;
	}

	@Override
	@Transactional
	public Category updateCategory(Category cat) {
		Category cate=null;
		cate=repositories.updateCategory(cat);
		return cate;
	}

	@Override
	@Transactional
	public Category removeCategory(Category cat) {
		Category cate=null;
		cate=repositories.removeCategory(cat);
		return cate;
	}

	@Override
	@Transactional
	public Category viewCategory(Category cat) {
		Category cate=null;
		cate=repositories.viewCategory(cat);
		return cate;
	}

	@Override
	@Transactional
	public List<Category> viewAllCategory() {
		List<Category> cate=repositories.viewAllCategory();
		return cate;
	}

}
