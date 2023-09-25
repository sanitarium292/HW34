package com.example.hw34;

import com.example.hw34.controller.OrderController;
import com.example.hw34.order.Order;
import com.example.hw34.order.OrderRepository;
import com.example.hw34.order.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Hw34Application {

    public static void main(String[] args) {
        SpringApplication.run(Hw34Application.class, args);
    }

}
