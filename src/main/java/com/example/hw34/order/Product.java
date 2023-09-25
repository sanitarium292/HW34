package com.example.hw34.order;

import lombok.Getter;
import lombok.Setter;

public class Product {

    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int cost;

    public Product(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
