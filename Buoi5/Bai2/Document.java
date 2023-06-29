package Buoi5.Bai2;

public class Document {
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
