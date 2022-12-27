package com.makingdevs.productservice.service

import com.makingdevs.productservice.domain.Product
import com.makingdevs.productservice.repository.ProductRepository
import javax.inject.Singleton
import javax.inject.Inject

@Singleton
class ProductServiceImp implements ProductService{

  @Inject
  ProductProducerService productProducerService

  @Inject
  ProductRepository productRepository

  Product sendToCart(Long productId) {
    Product product = productRepository.findById(productId).get()
    productProducerService.send(product)
    product
  }

}