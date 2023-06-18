package BTVN_Buoi2;

import java.util.Scanner;

public class Bai3 {
  public static void main(String[] args) {
    double a, b, c, delta, x, x1,x2;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nhập các hệ số của phương trình bậc 2: ");
    System.out.println("Nhập hệ số a: ");
    a = scanner.nextDouble();
    System.out.println("Nhập hệ số b: ");
    b = scanner.nextDouble();
    System.out.println("Nhập hệ số c: ");
    c = scanner.nextDouble();

    System.out.println("Phương trình bậc 2 vừa nhập có dạng: "+a+"x^2 + "+b+"x + "+c+" = 0");

    delta = b * b - 4 * a *c;
    if (delta > 0) {
      x1 = (-b + Math.sqrt(delta))/(2*a);
      x2 = (-b - Math.sqrt(delta))/(2*a);
      System.out.println("Phương trình có 2 nghiệm phân biệt: ");
      System.out.println("x1 = "+x1);
      System.out.println("x2 = "+x2);
    } else if (delta == 0) {
      x = ((-b) / (2 * a));
      System.out.println("Phương trình có nghiệm kép: ");
      System.out.println("x = " + x);
    } else {
      System.out.println("Phương trình vô nghiệm! ");
    }
  }
}
