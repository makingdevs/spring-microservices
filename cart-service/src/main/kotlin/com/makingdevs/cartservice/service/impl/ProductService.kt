package com.makingdevs.cartservice.service.impl

import com.makingdevs.cartservice.domain.Product
import com.makingdevs.cartservice.dto.PageDto
import com.makingdevs.cartservice.repository.ProductRepository
import com.makingdevs.cartservice.service.IProductService
import java.util.*
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class ProductService constructor(
  private val productRepository: ProductRepository
) : IProductService {

  override fun saveProduct(product: Product): Product {
    return productRepository.save(product)
  }

  override fun getAllProducts(pageable: Pageable): PageDto {
    val pageProduct: Page<Product> = productRepository.findAll(pageable)
    return PageDto.toPageDto(pageProduct);
  }

  override fun deleteProduct(id: Long) {
    val product: Optional<Product> = productRepository.findById(id)
    if (product.isPresent) {
      productRepository.delete(product.get())
    }
  }

}