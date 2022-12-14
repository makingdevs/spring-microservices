import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ToastComponent } from './shared/toast/toast.component';
import { CartComponent } from './components/cart/cart.component';
import { ProductComponent } from './components/product/product.component';
import { CartService } from './services/cart.service';
import { ProductService } from './services/product.service';

@NgModule({
  declarations: [
    AppComponent,
    CartComponent,
    ProductComponent,
    ToastComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    CartService,
    ProductService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
