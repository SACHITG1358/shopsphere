package com.sachit.shopsphere.Service;

import java.util.List;

import com.sachit.shopsphere.DTO.AddProductToCartDTO;
import com.sachit.shopsphere.Entity.Cart;
import com.sachit.shopsphere.Entity.CartProduct;
import com.sachit.shopsphere.Entity.Product;
import com.sachit.shopsphere.Exception.CartException;
import com.sachit.shopsphere.Exception.CustomerException;
import com.sachit.shopsphere.Exception.ProductException;

public interface CartService {
	public CartProduct addProductToCart(AddProductToCartDTO dto, String key) throws CartException,ProductException;
	public CartProduct removeProductFromCart(Integer cartProductId, String key) throws CartException;
	public CartProduct updateProductQuantityInCart(Integer cartProductId, Integer newQuantity, String key);
	public List<CartProduct> removeAllProductsInCart(Integer customerId, String key) throws CartException,CustomerException;
	public List<CartProduct> viewAllProductsInCart(Integer customerId) throws CartException,CustomerException;
	public Double findTotalCartPriceByCustomerId(Integer customerId) throws CartException;
}
