package com.sachit.shopsphere.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sachit.shopsphere.Entity.CartProduct;

@Repository
public interface CartProductDao extends JpaRepository<CartProduct, Integer>{

}
