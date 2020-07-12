package com.tts.eCommerce.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tts.eCommerce.model.Cart;
import com.tts.eCommerce.model.Product;

@Service
public class CartService {

	public Cart addLineItemToCart(Cart cart, Product productId, Integer quantity) {		 
		  HashMap<Product, Integer> lineItemToAdd = new HashMap<>();
		  lineItemToAdd.put(productId, quantity);
		  List<HashMap<Product, Integer>> cartItems = cart.getLineItems();
		  cartItems.add(lineItemToAdd);
		  cart.setLineItems(cartItems);
		  return cart;
		}

		public Cart updateLineItemQuantity(Cart cart, Product product, Integer quantity){
		  if (quantity > 0) {
		    ((HashMap<Product, Integer>) cart.lineItems).put(product, quantity);
		  } else {
		    cart.lineItems.remove(product);
		  }
		  return cart;
		}
}
