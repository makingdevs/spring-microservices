package com.makingdevs.productservice.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class CorsConfig implements WebMvcConfigurer {

  @Override
  void addCorsMappings(CorsRegistry corsRegistry) {
    corsRegistry.addMapping("/**")
      .allowedOrigins("http://localhost:4200")
      .allowedMethods("*")
      .allowedHeaders("*")
  }

}