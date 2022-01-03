package com.Ecommerce.store.repository;

import com.Ecommerce.store.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
