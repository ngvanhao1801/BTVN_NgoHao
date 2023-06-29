package Buoi5.Bai2;

public class Book extends Document {
  protected int numberOfPage;
  protected String author;

  public Book(String id, String name, String publisher, float price, int numberOfPage, String author) {
    super(id, name, publisher, price);
    this.numberOfPage = numberOfPage;
    this.author = author;
  }

  public int getNumberOfPage() {
    return numberOfPage;
  }

  public void setNumberOfPage(int numberOfPage) {
    this.numberOfPage = numberOfPage;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
