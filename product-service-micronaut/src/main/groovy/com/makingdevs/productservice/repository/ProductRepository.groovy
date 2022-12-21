package com.makingdevs.productservice.repository

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import com.makingdevs.productservice.domain.Product

@Repository
interface ProductRepository extends CrudRepository<Product, Long>{
}