package com.makingdevs.productservice.repository

import com.makingdevs.productservice.domain.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository extends JpaRepository<Product, Long> {
}
