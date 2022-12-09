package com.makingdevs.cartservice.config

import org.springframework.amqp.core.Queue
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitMQConfig {

  @Value("\${queue.product}")
  lateinit var productQueue: String

  @Bean
  fun queue(): Queue {
    return Queue(productQueue)
  }

}