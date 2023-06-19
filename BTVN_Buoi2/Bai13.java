package BTVN_Buoi2;

import java.util.Scanner;

public class Bai13 {
  public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập số nguyên n cần kiểm tra: ");
    n = scanner.nextInt();

    int sum = 0, i;
    for (i = 1; i <= n/2; i++) {
      if (n % i == 0) ;
      sum += i;
    }

    if (sum == n) {
      System.out.println(+n + " là số hoàn hảo! ");
    } else {
      System.out.println(+n+ " không là số hoàn hảo! ");

    }
  }
}
