package com.makingdevs.productservice.service

import com.makingdevs.productservice.domain.Product
import javax.inject.Singleton

@Singleton
class ProductServiceImp implements ProductService{

  Product sendToCart(Long productId) {
    println("sending product to queue...")
    new Product()
  }

}