package BTVN_Buoi2;

import java.util.Scanner;

public class Bai7 {
  public static void main(String[] args) {
    double x;
    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập số thực x: ");
    x = scanner.nextDouble();
    System.out.println("Nhập số nguyên n: ");
    n = scanner.nextInt();

    double S = 0;
    if (n % 2 == 0) { // n chẵn
      double temp = x;
      for (int i = 1; i <= n; i++) {
        S += temp;
        temp *= (x/3);
      }
      S += 2020*x;
    } else { // n lẻ
      S = 0;
    }
    System.out.println("Giá trị biểu thức S: " + S);
  }
}
