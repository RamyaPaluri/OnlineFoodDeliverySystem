package entities;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name="tbl_Customer")

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String customerId;
	@Column(name="first_name", length=20)
	private String firstName;
	@Column(name="last_name", length=20)
	private String lastName;
	@Column(name="age", length=20)
	private int age;
	@Column(name="gender", length=20)
	private String gender;
	@Column(name="mobile_number", length=20)
	private String mobileNumber;
	
	@OneToOne
	@JoinColumn(name="AddressId", referencedColumnName="AddressId")
	@Column(name="address", length=20)
	private Address address;
	@Column(name="email", length=20)
	private String email;
	
	
}