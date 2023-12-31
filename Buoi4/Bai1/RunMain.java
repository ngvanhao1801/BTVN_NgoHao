package Buoi4.Bai1;

import java.util.*;

public class RunMain {
//  Bài tập: Xây dựng lớp Person gồm các thuộc tính: id, name, address.
//  Yêu cầu: Sắp xếp sử dụng một trong 2 interface đã học, làm cả 2 cách càng tốt
//  Tại class RunMain khai báo 1 danh sách person và nhập dữ liệu cho danh sách person đó.
//  Sử dụng try catch để bắt các lỗi nhập dữ liệu từ bàn phím
//  Sắp xếp danh sách theo chiều tăng dần của id và xuất ra màn hình
//  Sắp xếp theo name theo thứ tự trong bảng chữ cái, nếu tên trùng nhau thì sẽ sắp xếp theo address giảm dần trong bảng chữ cái và xuất ra màn hình

  public static void main(String[] args) {
    List<Person> personList = new ArrayList<>();

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Nhập số phần tử của mảng: ");
      int n = scanner.nextInt();
      scanner.nextLine();

      for (int i = 0; i < n; i++) {
        System.out.println("Nhập các phần tử của mảng: " + (i + 1) + ":");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();

        Person person = new Person(id, name, address);
        personList.add(person);
      }
      scanner.close();

      Collections.sort(personList, new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
          return Integer.compare(p1.getId(), p2.getId());
        }
      });
      System.out.println("Sắp xếp ID theo thứ tư tăng dần:");
      for (Person person : personList) {
        System.out.println(person.getId() + "\t" + person.getName() + "\t" + person.getAddress());
      }
      Collections.sort(personList, new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
          if (p1.getName().equals(p2.getName())) {
            return p2.getAddress().compareTo(p1.getAddress());
          } else {
            return p1.getName().compareTo(p2.getName());
          }
        }
      });
      System.out.println("\nSắp xếp theo Name theo thứ tự trong bảng chữ cái, nếu tên trùng nhau thì sẽ sắp xếp theo " +
          "address giảm dần trong bảng chữ cái:");
      for (Person person : personList) {
        System.out.println(person.getId() + "\t" + person.getName() + "\t" + person.getAddress());
      }

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

  }
}
