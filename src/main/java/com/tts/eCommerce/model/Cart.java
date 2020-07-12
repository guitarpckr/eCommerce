package com.tts.eCommerce.model;

import java.util.HashMap;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cart {
	
	public List<HashMap<Product, Integer>> lineItems;
	private Double subTotal;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_id")
	private Long id;

	public void setLineItems(List<HashMap<Product, Integer>> cartItems) {
		// TODO Auto-generated method stub
		
	}

	public List<HashMap<Product, Integer>> getLineItems() {
		// TODO Auto-generated method stub
		return null;
	}
}
