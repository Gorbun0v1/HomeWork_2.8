package com.example.demo.entity;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private List<Integer> products = new ArrayList<>();

    public void addProducts(List<Integer> products) {
        products.addAll(products) ;
    }

    public List<Integer> getProducts(List<Integer> products) {
        return products;
    }
}
