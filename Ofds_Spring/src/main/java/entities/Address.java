package entities;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="tbl_Address")

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String addressId;
	@Column(name="building_name", length=20)
	private String buildingName;
	@Column(name="street_no", length=20)
	private String streetNo;
	@Column(name="area_name", length=20)
	private String area;
	@Column(name="city_name", length=20)
	private String city;
	@Column(name="state_name", length=20)
	private String state;
	@Column(name="country_name", length=20)
	private String country;
	@Column(name="pincode", length=20)
	private String pincode;
	
	
}