import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/models/product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'product-component',
  templateUrl: './product.component.html',
})
export class ProductComponent implements OnInit {
  products: Product[] = [];

  constructor(private productService: ProductService) {}

  ngOnInit(): void {
    this.getProducts();
  }

  private getProducts(): void {
    this.productService
      .getProducts()
      .subscribe((products: Product[]) => (this.products = products));
  }

  onAddProduct(productId: number): void {
    this.productService.addProductToCart(productId).subscribe();
  }
}
