package org.lifehive.SpringWebApp.Demo.service;

import org.lifehive.SpringWebApp.Demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000), new Product(102, "Camper", 60000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(-1, "Item Not Found", -1));
    }

    public String insertProduct(Product product) {
        if (
                products.stream()
                        .anyMatch(p -> p.getProdId() == product.getProdId())
        ) {
            return "Product Already Present in the list";
        } else {
            products.add(product);
            return "Product Added in the list";
        }
    }

    public String updateProduct(Product product) {
        int index = -1;
        for(int i=0; i<products.size(); i++) {
            if(products.get(i).getProdId() == product.getProdId()) {
                index = i;
                break;
            }
        }
        if(index == -1) return "Unable to locate the product";
        products.set(index, product);
        return "Product updated successfully";
    }

    public String deleteProductById(int prodId) {
        int index = -1;
        for(int i=0; i<products.size(); i++) {
            if(products.get(i).getProdId() == prodId) {
                index = i;
                break;
            }
        }
        if(index == -1) return "Unable to locate the product";
        products.remove(index);
        return "Product removed successfully";
    }
}
