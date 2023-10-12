package com.example.demo.service;

import com.example.demo.entity.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }
    @Override
    public void addProducts(List<Integer> products) {
        basket.addProducts(products);
    }

    @Override
    public List<Integer> getProducts(List<Integer> products) {
        return products;
    }

}
