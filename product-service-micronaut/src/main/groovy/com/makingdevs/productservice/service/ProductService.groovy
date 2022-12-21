package com.makingdevs.productservice.service

import com.makingdevs.productservice.domain.Product

interface ProductService {

  Product sendToCart(Long productId)

}