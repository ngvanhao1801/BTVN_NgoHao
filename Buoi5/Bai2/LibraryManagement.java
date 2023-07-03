package Buoi5.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LibraryManagement {
//  Viết chương trình quản lý một danh sách books của một thư viện
//  Yêu cầu: Tạo class (1đ)
//  Tạo class Document, Book gồm các thuộc tính như hình và các phương thức cần thiết khác
//      Class Book được kế thừa từ class Document
//Tạo menu thực hiện các chức năng sau:
//  1.Add book: cho phép người dùng add thêm 1 đối tượng book vào danh sách books của thư viện(Các đối tượng không được trùng id).
//  2.Edit book by id: Cho phép người dùng chọn edit 1 trong các thuộc tính của book theo id
//  3.Delete book by id: Cho phép người dùng xóa một đối tượng book ra khỏi danh sách
//  4.Sort books by name (ascending): Cho phép người dùng sắp xếp sách theo tên sách của thứ tự trong bảng chữ cái
//  5.Sort books by price (descending): Cho phép người dùng sắp xếp sách theo giá giảm dần.
//  6.Show all books: Hiển thị danh sách books có trong thư viện
//  7.Exit: Cho phép thoát chương trình

  private ArrayList<Book> books;
  private Scanner scanner;

  public LibraryManagement() {
    books = new ArrayList<>();
    scanner = new Scanner(System.in);
  }

  public void addBook() {
    System.out.println("Enter book details:");
    System.out.print("ID: ");
    String id = scanner.nextLine();
    if (findBookById(id) != null) {
      System.out.println("A book with this ID already exists!");
      return;
    }
    System.out.print("Name: ");
    String name = scanner.nextLine();
    System.out.print("Publisher: ");
    String publisher = scanner.nextLine();
    System.out.print("Price: ");
    float price = scanner.nextFloat();
    scanner.nextLine(); // consume the newline character
    System.out.print("Number of pages: ");
    int numberOfPage = scanner.nextInt();
    scanner.nextLine(); // consume the newline character
    System.out.print("Author: ");
    String author = scanner.nextLine();

    Book book = new Book(id, name, publisher, price, numberOfPage, author);
    books.add(book);
    System.out.println("Book added successfully!");
  }

  public void editBookById() {
    System.out.print("Enter book ID to edit: ");
    String id = scanner.nextLine();
    Book book = findBookById(id);
    if (book == null) {
      System.out.println("Book not found!");
      return;
    }

    System.out.println("Choose the attribute to edit:");
    System.out.println("1. Name");
    System.out.println("2. Publisher");
    System.out.println("3. Price");
    System.out.println("4. Number of pages");
    System.out.println("5. Author");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();
    scanner.nextLine(); // consume the newline character

    switch (choice) {
      case 1:
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        book.setName(name);
        break;
      case 2:
        System.out.print("Enter new publisher: ");
        String publisher = scanner.nextLine();
        book.setPublisher(publisher);
        break;
      case 3:
        System.out.print("Enter new price: ");
        float price = scanner.nextFloat();
        book.setPrice(price);
        break;
      case 4:
        System.out.print("Enter new number of pages: ");
        int numberOfPage = scanner.nextInt();
        book.setNumberOfPage(numberOfPage);
        break;
      case 5:
        System.out.print("Enter new author: ");
        String author = scanner.nextLine();
        book.setAuthor(author);
        break;
      default:
        System.out.println("Invalid choice!");
    }

    System.out.println("Book edited successfully!");
  }

  public void deleteBookById() {
    System.out.print("Enter book ID to delete: ");
    String id = scanner.nextLine();
    Book book = findBookById(id);
    if (book == null) {
      System.out.println("Book not found!");
      return;
    }

    books.remove(book);
    System.out.println("Book deleted successfully!");
  }

  public void sortBooksByName() {
    Comparator<Book> nameComparator = Comparator.comparing(Book::getName);
    Collections.sort(books, nameComparator);
    System.out.println("Books sorted by name (ascending) successfully!");
  }

  public void sortBooksByPrice() {
    Comparator<Book> priceComparator = Comparator.comparing(Book::getPrice).reversed();
    Collections.sort(books, priceComparator);
    System.out.println("Books sorted by price (descending) successfully!");
  }

  public void showAllBooks() {
    if (books.size() == 0) {
      System.out.println("No books found!");
      return;
    }

    System.out.println("List of books:");
    for (Book book : books) {
      System.out.println("ID: " + book.getId());
      System.out.println("Name: " + book.getName());
      System.out.println("Publisher: " + book.getPublisher());
      System.out.println("Price: " + book.getPrice());
      System.out.println("Number of pages: " + book.getNumberOfPage());
      System.out.println("Author: " + book.getAuthor());
      System.out.println("---------------------------");
    }
  }

  private Book findBookById(String id) {
    for (Book book : books) {
      if (book.getId().equals(id)) {
        return book;
      }
    }
    return null;
  }

  public void start() {
    int choice;
    do {
      System.out.println("Menu:");
      System.out.println("1. Add book");
      System.out.println("2. Edit book by ID");
      System.out.println("3. Delete book by ID");
      System.out.println("4. Sort books by name (ascending)");
      System.out.println("5. Sort books by price (descending)");
      System.out.println("6. Show all books");
      System.out.println("7. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();
      scanner.nextLine(); // consume the newline character

      switch (choice) {
        case 1:
          addBook();
          break;
        case 2:
          editBookById();
          break;
        case 3:
          deleteBookById();
          break;
        case 4:
          sortBooksByName();
          break;
        case 5:
          sortBooksByPrice();
          break;
        case 6:
          showAllBooks();
          break;
        case 7:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice!");
      }

      System.out.println();
    } while (choice != 7);
  }

  public static void main(String[] args) {
    LibraryManagement libraryManagement = new LibraryManagement();
    libraryManagement.start();
  }
}