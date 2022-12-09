package com.makingdevs.cartservice.dto

import com.makingdevs.cartservice.domain.Product
import org.springframework.data.domain.Page

data class PageDto(
  val data: List<Product>,
  val pages: Int,
  val total: Long
) {
  companion object {

    fun toPageDto(page: Page<Product>): PageDto {
      return PageDto(
        data = page.content,
        pages = page.totalPages,
        total = page.totalElements
      )
    }

  }
}