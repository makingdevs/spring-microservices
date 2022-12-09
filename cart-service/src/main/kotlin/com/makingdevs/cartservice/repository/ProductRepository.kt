package com.makingdevs.cartservice.repository

import com.makingdevs.cartservice.domain.Product
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<Product, Long> {

  override fun findAll(pageable: Pageable): Page<Product>

}