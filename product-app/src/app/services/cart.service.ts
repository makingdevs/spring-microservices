import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../models/product';
import { Observable } from 'rxjs';
import { PageResponse } from '../models/page-response';

@Injectable()
export class CartService {
  url: string = 'http://localhost:8080/api/v1/carts';

  constructor(private http: HttpClient) {}

  getProductsInCart(page?: number, size?: number): Observable<PageResponse<Product>> {
    let url = this.url;
    if (page && size) {
      url += `?page=${page}&size=${size}`;
    }
    return this.http.get<PageResponse<Product>>(url);
  }

  deleteProduct(id: number): Observable<void> {
    let url = this.url;
    url += `/${id}`;
    return this.http.delete<void>(url);
  }
}
