package com.makingdevs.productservice.service

import io.micronaut.rabbitmq.annotation.Binding
import io.micronaut.rabbitmq.annotation.RabbitClient
import com.makingdevs.productservice.domain.Product

@RabbitClient
public interface ProductProducerService {

  @Binding("product")
  void send(Product product)
}