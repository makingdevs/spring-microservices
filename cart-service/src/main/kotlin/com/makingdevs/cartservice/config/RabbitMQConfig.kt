package com.makingdevs.cartservice.config

import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitMQConfig {

  @Bean
  fun queue(): Queue {
    return Queue("product")
  }

  @Bean
  fun messageConverter(): Jackson2JsonMessageConverter {
    return Jackson2JsonMessageConverter()
  }

  @Bean
  fun rabbitTemplate(
    messageConverter: Jackson2JsonMessageConverter,
    connectionFactory: ConnectionFactory
  ): RabbitTemplate {
    val template = RabbitTemplate(connectionFactory)
    template.messageConverter = messageConverter
    return template
  }

}