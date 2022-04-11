package entities;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="tbl_Item")

public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String itemId;
	@Column(name="item_name", length=20)
	private String itemName;
	
	@OneToMany
	@JoinColumn(name="CatId", referencedColumnName="CatId")
	@Column(name="category", length=20)
	private Category category;
	@Column(name="quantity", length=20)
	private int quantity;
	@Column(name="cost", length=20)
	private double cost;
	
	@ManyToMany
	@JoinColumn(name="RestaurantId", referencedColumnName="RestaurantId")
	@Column(name="restaurants", length=20)
	private List<Restaurant> restaurants;
	
}