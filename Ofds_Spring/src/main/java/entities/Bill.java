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
@Table(name="tbl_Bill")

public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String billId;
	@Column(name="bill_date", length=20)
	private LocalDateTime billDate;
	
	@OneToOne
	@JoinColumn(name="OrderId", referencedColumnName="OrderId")
	@Column(name="order", length=20)
	private OrderDetails order;
	@Column(name="total_item", length=20)
	private int totalItem;
	@Column(name="total_cost", length=20)
	private double totalCost;
	
	
}