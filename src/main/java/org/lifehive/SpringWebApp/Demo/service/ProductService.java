package org.lifehive.SpringWebApp.Demo.service;

import org.lifehive.SpringWebApp.Demo.model.Product;
import org.lifehive.SpringWebApp.Demo.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(Long prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public String insertProduct(Product product) {
        repo.save(product);
        return "Product Added in the list";
    }

    public String updateProduct(Product product) {
        repo.save(product);
        return "Product updated successfully";
    }

    public String deleteProductById(Long prodId) {
        repo.deleteById(prodId);
        return "Product removed successfully";
    }
}
