package com.example.hw34.controller;

import com.example.hw34.order.Order;
import com.example.hw34.order.OrderRepository;
import com.example.hw34.order.TestRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository orderRepository = TestRepository.get();

    @GetMapping
    @ResponseBody
    public List<Order> getAllOrders() {
        return orderRepository.getOrders();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Order getById(@PathVariable int id) {
        return orderRepository.getOrderById(id);
    }
}
