package org.lifehive.SpringWebApp.Demo.service;

import org.lifehive.SpringWebApp.Demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101, "Iphone", 50000), new Product(102, "Camper", 60000));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(-1, "Item Not Found", -1));
    }
}
