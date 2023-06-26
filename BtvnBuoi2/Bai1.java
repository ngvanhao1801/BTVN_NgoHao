package BtvnBuoi2;

import java.util.Scanner;

public class Bai1 {
  public static void main(String[] args) {
    int a, b, c;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập hệ số a: ");
    a = scanner.nextInt();
    System.out.println("Nhập hệ số b: ");
    b = scanner.nextInt();
    System.out.println("Nhập hệ số c: ");
    c = scanner.nextInt();
    System.out.println("Số lớn nhất trong 3 số là: ");
    if (a >= b && a >= c) {
      System.out.println(a);
    } else if (b >= c) {
      System.out.println(b);
    } else {
      System.out.println(c);
    }
  }
}
