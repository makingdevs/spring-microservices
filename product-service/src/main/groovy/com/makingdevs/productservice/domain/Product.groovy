package com.makingdevs.productservice.domain

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Table(name = "PRODUCTS")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id
  String name
  String imageUrl
  Double price

}