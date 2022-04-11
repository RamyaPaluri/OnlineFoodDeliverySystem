package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import entities.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,String>{
	public Category addCategory(Category cat);
	public Category updateCategory(Category cat);
	@Query("Remove from Category where category=:category")
	public Category removeCategory(Category cat);
	public Category viewCategory(Category cat);
	public List<Category> viewAllCategory();

}
