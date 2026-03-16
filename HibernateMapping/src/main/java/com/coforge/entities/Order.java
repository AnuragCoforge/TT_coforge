package com.coforge.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="ordertable")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ordId;
	private String prodName;
	private double amount;
	
	public Order(String prodName, double amount) {
		super();
		this.prodName = prodName;
		this.amount = amount;
	}
	
	
}
