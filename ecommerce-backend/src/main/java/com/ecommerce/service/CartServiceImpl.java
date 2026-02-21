package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Cart;
import com.ecommerce.model.CartItem;
import com.ecommerce.model.Product;
import com.ecommerce.model.User;
import com.ecommerce.repository.CartItemRepository;
import com.ecommerce.repository.CartRepository;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.repository.UserRepository;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Cart createCart(Long userId) {

        User user = userRepository.findById(userId).orElseThrow();

        Cart cart = new Cart();
        cart.setUser(user);

        return cartRepository.save(cart);
    }
    
    @Override
    public Cart addItemToCart(Long cartId, Long productId, Integer quantity) {

        Cart cart = cartRepository.findById(cartId).orElseThrow();

        Product product = productRepository.findById(productId).orElseThrow();

        CartItem item = new CartItem();
        item.setCart(cart);
        item.setProduct(product);
        item.setQuantity(quantity);

        cartItemRepository.save(item);

        return cart;
    }

}
