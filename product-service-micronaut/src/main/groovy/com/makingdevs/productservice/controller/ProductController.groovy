package com.makingdevs.productservice

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.HttpResponse
import com.makingdevs.productservice.domain.Product
import com.makingdevs.productservice.repository.ProductRepository
import com.makingdevs.productservice.service.ProductService
import javax.inject.Inject

@CompileStatic
@Controller("/api/v1/products")
class ProductController {

  @Inject
  ProductRepository productRepository

  @Inject
  ProductService productService

  @Post
  Product addProduct(@Body Product product) {
    return productRepository.save(product)
  }

  @Get
  List<Product> getAllProduct () {
    return productRepository.findAll().toList()
  }
  
  @Post("/{productId}/carts")
  HttpResponse sendToCart(@PathVariable Long productId) {
    Product product = productService.sendToCart(productId)
    product
      ? HttpResponse.ok(product)
      : HttpResponse.notFound("Product not sent")
  }
}