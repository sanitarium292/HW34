package com.example.hw34.order;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


public class OrderRepository {

    @Getter
    private List<Order> orders;

    public OrderRepository(List<Order> orders) {
        this.orders = orders;
    }

    public OrderRepository() {
        orders = new ArrayList<>();
    }

    public boolean add(Order inputOrder) {
        for (Order o : orders) {
            if (inputOrder.getId() == o.getId()) return false;
        }

        orders.add(inputOrder);
        return true;
    }

    public Order getOrderById(int id) {
        for (Order o : orders) {
            if (o.getId() == id) return o;
        }
        return null;
    }
}
