package com.makingdevs.cartservice.controller

import com.makingdevs.cartservice.dto.PageDto
import com.makingdevs.cartservice.service.IProductService
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/carts")
class CartsController constructor(
  private val productService: IProductService
) {

  @GetMapping
  fun getAllProducts(pageable: Pageable): PageDto {
    return productService.getAllProducts(pageable)
  }

  @DeleteMapping("/{id}")
  fun deleteProduct(@PathVariable id: Long) {
    productService.deleteProduct(id);
  }

}