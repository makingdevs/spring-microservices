package com.makingdevs.productservice.controller

import com.makingdevs.productservice.domain.Product
import com.makingdevs.productservice.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product")
class ProductController {

  @Autowired
  ProductRepository productRepository

  @PostMapping("/addOne")
  Product addProduct(@RequestBody Product product) {
    return productRepository.save(product)
  }

  @PostMapping("/addList")
  List<Product> addProductList (@RequestBody  List<Product> products) {
    println "adding list ${products}"
    return productRepository.saveAll(products)
  }

  @GetMapping("/getAll")
  List<Product> getAllProduct () {
    return productRepository.findAll()
  }

}
