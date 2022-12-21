import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'toast-component',
  templateUrl: './toast.component.html',
})
export class ToastComponent implements OnInit {
  @Input() message: string = '';
  @Input() isOpen: boolean = false;

  constructor() {}

  ngOnInit(): void {}

  onClose(): void {
    this.isOpen = false;
  }
}
