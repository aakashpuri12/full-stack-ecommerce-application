package com.ecommerce.service;

import com.ecommerce.model.Cart;

public interface CartService {

    Cart createCart(Long userId);
    Cart addItemToCart(Long cartId, Long productId, Integer quantity);

}
