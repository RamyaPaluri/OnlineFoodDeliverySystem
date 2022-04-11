package entities;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
@Table(name="tbl_Restaurant")

public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String restaurantId;
	@Column(name="restaurant_name", length=20)
	private String restaurantName;
	
	@OneToOne
	@JoinColumn(name="AddressId", referencedColumnName="AddressId")
	@Column(name="address", length=20)
	private Address address;
	
	@ManyToMany
	@JoinColumn(name="ItemId", referencedColumnName="ItemId")
	@Column(name="item_list", length=20)
	private List<Item> itemList;
	
	@Column(name="manager_name", length=20)
	private String managerName;
	@Column(name="contact_number", length=20)
	private String contactNumber;
	
}