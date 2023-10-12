package com.example.demo.service;

import java.util.List;

public interface StoreService {
    void addProducts(List<Integer> products);

    List<Integer> getProducts(List<Integer> products);
}
