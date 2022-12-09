package com.makingdevs.cartservice.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "product")
class Product(

  @Id
  var id: Long,
  @Column(name = "name")
  var name: String,
  @Column(name = "price")
  var price: Double

)