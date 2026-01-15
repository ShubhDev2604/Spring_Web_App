package org.lifehive.SpringWebApp.Demo.controller

import org.lifehive.SpringWebApp.Demo.model.Product
import org.lifehive.SpringWebApp.Demo.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController @Autowired constructor(
    private val service: ProductService
) {
    @GetMapping("/products")
    fun getProducts() : List<Product> {
        return service.getProducts()
    }

    @GetMapping("/products/{prodId}")
    fun getProductById(@PathVariable prodId: Int): Product {
        return service.getProductById(prodId)
    }

    @PostMapping("/products")
    fun insertProducts(@RequestBody product: Product): String {
        return service.insertProduct(product)
    }

    @GetMapping("/products/{prodId}/{subId}")
    fun getProductByIdAndSubId(@PathVariable prodId: Int, @PathVariable subId: Boolean): String {
        return "You are getting two path variables  $subId    $prodId"
    }

    @PutMapping("/products")
    fun updateProduct(@RequestBody product: Product): String {
        return service.updateProduct(product)
    }
}