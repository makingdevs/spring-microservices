package com.makingdevs.productservice.config

import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitMQConfig {

  @Bean
  Queue queue() {
    new Queue("product")
  }

  @Bean
  Jackson2JsonMessageConverter messageConverter() {
    new Jackson2JsonMessageConverter()
  }

  @Bean
  RabbitTemplate rabbitTemplate(
    Jackson2JsonMessageConverter messageConverter,
    ConnectionFactory connectionFactory
  ) {
    RabbitTemplate template = new RabbitTemplate(connectionFactory)
    template.messageConverter = messageConverter
    template
  }

}