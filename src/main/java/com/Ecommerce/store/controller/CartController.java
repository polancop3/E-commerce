package com.Ecommerce.store.controller;

import com.Ecommerce.store.model.Cart;
import com.Ecommerce.store.model.Items;
import com.Ecommerce.store.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/cart")
public class CartController {
    @Autowired
    CartRepository cartRepository;

    @GetMapping
    public @ResponseBody Iterable<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    @PostMapping
    public Cart addToCart(@RequestBody Cart cart) {
        return cartRepository.save(cart);
    }
}
