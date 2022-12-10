import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../models/product';
import { Observable } from 'rxjs';
import { PageReponse } from '../models/page-response';

@Injectable()
export class CartService {
  url: string = 'http://localhost:8050/api/v1/carts';

  constructor(private http: HttpClient) {}

  getProducts(page?: number, size?: number): Observable<PageReponse<Product>> {
    let url = this.url;
    if (page && size) {
      url += '?page=' + page + '&size=' + size;
    }
    return this.http.get<PageReponse<Product>>(url);
  }
}
