package com.makingdevs.cartservice.service

import com.makingdevs.cartservice.domain.Product
import com.makingdevs.cartservice.dto.PageDto
import org.springframework.data.domain.Pageable

interface IProductService {

  fun saveProduct(product: Product): Product

  fun getAllProducts(pageable: Pageable): PageDto

  fun deleteProduct(id: Long)

}