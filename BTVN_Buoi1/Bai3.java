package BTVN_NgoHao.BTVN_Buoi1;

import java.util.Scanner;

public class Bai3 {
  public static void main(String[] args) {
    int n,m;
    float x,y;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập giá trị n: ");
    n = scanner.nextInt();

    System.out.println("Nhập giá trị m: ");
    m = scanner.nextInt();

    System.out.println("Nhập giá trị x: ");
    x = scanner.nextFloat();

    System.out.println("Nhập giá trị y: ");
    y = scanner.nextFloat();

    if (n > m) {
      System.out.println("Có n con chó");
    } else {
      System.out.println("Có m con mèo");
    }

    if (x > y) {
      System.out.println("Gấu gấu x lần");
    } else {
      System.out.println("Meo meo y lần");
    }
  }
}
