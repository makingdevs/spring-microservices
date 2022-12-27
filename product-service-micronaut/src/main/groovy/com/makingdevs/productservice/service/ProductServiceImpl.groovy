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

  @Override
  Product sendToCart(Long productId) {
    Optional<Product> product = productRepository.findById(productId)

    if(product.isPresent()){
      productProducerService.send(product.get())
      product.get()
    }
  }

}