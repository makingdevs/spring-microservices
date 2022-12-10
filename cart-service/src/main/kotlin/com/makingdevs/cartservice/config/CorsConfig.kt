package com.makingdevs.cartservice.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class CorsConfig : WebMvcConfigurer {

  override fun addCorsMappings(corsRegistry: CorsRegistry) {
    corsRegistry.addMapping("/**")
      .allowedOrigins("http://localhost:4200")
      .allowedMethods("*")
      .allowedHeaders("*")
  }

}