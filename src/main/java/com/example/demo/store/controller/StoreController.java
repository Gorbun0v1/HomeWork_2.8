package com.example.demo.store.controller;

import com.example.demo.service.StoreService;
import com.example.demo.service.StoreServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void addProduct(@PathVariable("products")List<Integer> products) {
     storeService.addProducts(products);
    }


    @GetMapping("/get")
    public List<Integer> getProduct(@PathVariable("products")List<Integer> products) {
        return storeService.getProducts(products);
    }


}
