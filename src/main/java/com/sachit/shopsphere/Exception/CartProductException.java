package com.sachit.shopsphere.Exception;

public class CartProductException extends RuntimeException{
	public CartProductException() {
		
	}
	
	public CartProductException(String message) {
		super(message);
	}
}
