package com.makingdevs.productservice.domain

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Table(name = "PRODUCTS")
class Product {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  Long id
  String name
  String imageUrl
  Double price

}