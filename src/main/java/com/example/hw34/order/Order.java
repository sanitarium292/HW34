package com.example.hw34.order;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

public class Order {

    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private Date date;
    @Getter
    @Setter
    private int cost;
    @Getter
    @Setter
    private List<Product> products;

    public Order(int id, Date date, int cost, List<Product> products) {
        this.id = id;
        this.date = date;
        this.cost = cost;
        this.products = products;
    }
}
