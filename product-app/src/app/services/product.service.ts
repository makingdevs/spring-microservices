import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class ProductService {
  url: string = 'http://localhost:8085/api/v1/product';

  constructor(private http: HttpClient) {}

  addProductToCart(productId: number) {
    let url = this.url;
    url += `/sendToCart/${productId}`;
    return this.http.post(url, {});
  }
}
