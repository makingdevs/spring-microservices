package com.makingdevs.cartservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class CartServiceApplication

fun main(args: Array<String>) {
  runApplication<CartServiceApplication>(*args)
}
