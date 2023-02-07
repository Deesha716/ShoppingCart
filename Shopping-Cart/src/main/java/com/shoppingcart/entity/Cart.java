package com.shoppingcart.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue
	private int cartId;

	public Cart() {
		super();
	}

	public Cart(Integer cartId) {
		super();
		this.cartId = cartId;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	
}