package org.lifehive.SpringWebApp.Demo.controller

import org.lifehive.SpringWebApp.Demo.model.Product
import org.lifehive.SpringWebApp.Demo.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController @Autowired constructor(
    private val service: ProductService
) {
    @RequestMapping("/products")
    fun getProducts() : List<Product> {
        return service.getProducts()
    }
}