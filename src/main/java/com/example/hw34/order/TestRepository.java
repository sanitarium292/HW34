package com.example.hw34.order;

import java.util.Date;
import java.util.List;

public class TestRepository {

    public static OrderRepository get() {
        Product p1 = new Product(1, "product1", 10);
        Product p2 = new Product(2, "pruduct2", 12);
        Product p3 = new Product(3, "product3", 22);

        Order order = new Order(1, new Date(1212121212121L), 44, List.of(p1, p2, p3));
        Order order2 = new Order(2, new Date(1212121212121L), 10, List.of(p1));
        OrderRepository orderRepository = new OrderRepository();
        orderRepository.add(order);
        orderRepository.add(order2);

        return orderRepository;
    }
}
