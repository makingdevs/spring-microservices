import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../models/product';

@Injectable()
export class ProductService {
  url: string = 'http://localhost:8080/api/v1/products';

  constructor(private http: HttpClient) {}

  getProducts(): Observable<Product[]> {
    let url = this.url;
    return this.http.get<Product[]>(url);
  }

  addProductToCart(productId: number): Observable<void> {
    let url = this.url;
    url += `/${productId}/carts`;
    return this.http.post<void>(url, {});
  }
}
