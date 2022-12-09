package com.makingdevs.cartservice.listener

import com.makingdevs.cartservice.domain.Product
import com.makingdevs.cartservice.service.impl.ProductService
import org.apache.logging.log4j.kotlin.Logging
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class ProductListener(
  private val productService: ProductService
) : Logging {

  @RabbitListener(queues = ["\${queue.product}"])
  fun onProductRegistration(product: Product) {
    logger.info("Product registration event received (ID): ${product.id}")
    productService.saveProduct(product)
  }

}