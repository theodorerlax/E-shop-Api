package com.example.electronicsapi.services;

import com.example.electronicsapi.entities.Category;
import com.example.electronicsapi.entities.Discount;
import com.example.electronicsapi.entities.Order;
import com.example.electronicsapi.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getProducts();

    List<Discount> getDiscounts();

    Optional<Product> getProduct(int productId);

    String addProduct(Product product);

    List<Category> getCategories();

    List<Product> getCategoryProducts(String category);

    Optional<Discount> getDiscount(String coupon);

    boolean removeDiscount(String id);

    int addOrders(Order order);

    List<Order> getOrders();

}
