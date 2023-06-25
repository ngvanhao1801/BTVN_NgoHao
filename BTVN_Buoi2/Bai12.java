package BTVN_Buoi2;

import java.util.Scanner;

public class Bai12 {
  public static void main(String[] args) {

    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số nguyên dương n: ");
    n = scanner.nextInt();
    int sum = 0;
    int i;
    for ( i = 1; i < n; i ++) {
      if ((n % i) == 0) {
        sum += i;
      }
    }
    System.out.println("Tổng các ước số " + n + " là " + sum);
  }
}
