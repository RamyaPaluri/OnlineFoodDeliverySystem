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
@Table(name="tbl_Category")

public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String catId;
	@Column(name="category_name", length=20)
	private String categoryName;
	
}