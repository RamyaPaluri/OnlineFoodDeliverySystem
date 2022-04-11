package entities;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name="tbl_FoodCart")

public class FoodCart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public String cartId;
	
	@OneToOne
	@JoinColumn(name="CustomerId", referencedColumnName="CustomerId")
	@Column(name="customer", length=20)
	private Customer customer;
	
	@OneToMany
	@JoinColumn(name="ItemId", referencedColumnName="ItemId")
	@Column(name="item_list", length=20)
	private List<Item> itemList;
	
	
}