package Buoi5.Bai2;

public class Document {
//  Viết chương trình quản lý một danh sách books của một thư viện
//  Yêu cầu: Tạo class (1đ)
//  Tạo class Document, Book gồm các thuộc tính như hình và các phương thức cần thiết khác
//      Class Book được kế thừa từ class Document
//Tạo menu thực hiện các chức năng sau:
//      +) Add book (1đ)
//+) Edit book by id (1đ)
//+) Delete book by id (1đ)
//+) Sort books by name (ascending) (1đ)
//      +) Sort books by price (descending) (1đ)
//      +) Show all books (1đ)
//		+) Exit.
  protected String id;
  protected String name;
  protected String publisher;
  protected float price;

  public Document(String id, String name, String publisher, float price) {
    this.id = id;
    this.name = name;
    this.publisher = publisher;
    this.price = price;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }
}
