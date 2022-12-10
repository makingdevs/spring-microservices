export class PageResponse<T> {
  data: Array<T>;
  pages: number;
  total: number;

  constructor(data: Array<T>, pages: number, total: number) {
    this.data = data;
    this.pages = pages;
    this.total = total;
  }
}