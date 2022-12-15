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
    this.getProductsInCart();
  }

  private getProductsInCart(): void {
    this.cartService
      .getProductsInCart()
      .subscribe((response: PageResponse<Product>) => {
        this.products = response.data;
        this.pages = response.pages;
        this.total = response.total;
      });
  }

  onDeleteProduct(productId: number): void {
    this.cartService
      .deleteProduct(productId)
      .subscribe(() => this.getProductsInCart());
  }
}
