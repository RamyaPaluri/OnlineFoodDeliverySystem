package entities;

import javax.persistence.Entity;

import java.time.LocalDateTime;

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
@Table(name="tbl_OrderDetails")

public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	@Column(name="order_date", length=20)
	private LocalDateTime orderDate;
	
	@OneToOne
	@JoinColumn(name="CartId", referencedColumnName="CartId")
	@Column(name="cart", length=20)
	private FoodCart cart;
	@Column(name="order_status", length=20)
	private String orderStatus;
	
}