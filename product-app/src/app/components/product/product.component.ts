import { Component, OnInit } from '@angular/core';
import { PageResponse } from 'src/app/models/page-response';
import { Product } from 'src/app/models/product';
import { CartService } from 'src/app/services/cart.service';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'product-component',
  templateUrl: './product.component.html',
})
export class ProductComponent implements OnInit {
  products: Product[] = [];
  productsInCart: Product[] = [];
  totalProductsInCart: number = 0;

  constructor(
    private productService: ProductService,
    private cartService: CartService
  ) {}

  ngOnInit(): void {
    this.getProducts();
    this.getProductsInCart();
  }

  private getProducts(): void {
    this.productService
      .getProducts()
      .subscribe((products: Product[]) => (this.products = products));
  }

  private getProductsInCart(): void {
    this.cartService
      .getProductsInCart()
      .subscribe((response: PageResponse<Product>) => {
        this.productsInCart = response.data;
        this.totalProductsInCart = response.total;
      });
  }

  onAddProduct(productId: number): void {
    this.productService.addProductToCart(productId).subscribe();
  }
}
