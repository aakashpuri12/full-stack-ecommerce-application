package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.model.Order;
import com.ecommerce.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/{cartId}")
    public Order placeOrder(@PathVariable Long cartId) {
        return orderService.placeOrder(cartId);
    }
}
