package com.makingdevs.productservice.service

import com.makingdevs.productservice.domain.Product
import com.makingdevs.productservice.repository.ProductRepository
import groovy.json.JsonBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl implements ProductService {

  @Autowired
  ProductRepository productRepository

  @Autowired
  RabbitTemplate rabbitTemplate

  @Value('${application.rabbitmq.destination}')
  String rabbitmqQueue

  @Override
  Product sendToCart(Long productId) {
    Optional<Product> product = productRepository.findById(productId)
    if (product.isPresent()) {
      rabbitTemplate.convertAndSend(rabbitmqQueue, product.get())
      product.get()
    }
    null
  }

}
