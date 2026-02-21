package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.model.Cart;
import com.ecommerce.service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/{userId}")
    public Cart createCart(@PathVariable Long userId) {
        return cartService.createCart(userId);
    }
    
    @PostMapping("/add")
    public Cart addItem(
            @RequestParam Long cartId,
            @RequestParam Long productId,
            @RequestParam Integer quantity) {

        return cartService.addItemToCart(cartId, productId, quantity);
    }

}
