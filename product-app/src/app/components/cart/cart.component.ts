import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/models/product';
import { PageResponse } from 'src/app/models/page-response';
import { CartService } from 'src/app/services/cart.service';

@Component({
  selector: 'cart-component',
  templateUrl: './cart.component.html',
})
export class CartComponent implements OnInit {
  products: Product[] = [];
  pages: number = 0;
  total: number = 0;

  constructor(private cartService: CartService) {}

  ngOnInit(): void {
    this.getProducts();
  }

  private getProducts(): void {
    this.cartService
      .getProducts()
      .subscribe((response: PageResponse<Product>) => {
        this.products = response.data;
        this.pages = response.pages;
        this.total = response.total;
      });
  }
}
