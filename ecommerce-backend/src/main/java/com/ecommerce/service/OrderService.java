package com.ecommerce.service;

import com.ecommerce.model.Order;

public interface OrderService {

    Order placeOrder(Long cartId);
}
