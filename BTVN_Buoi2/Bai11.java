package BTVN_Buoi2;

import java.util.Scanner;

public class Bai11 {
  public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);


    do {
      System.out.println("Nhập số nguyên dương n: ");
      n = scanner.nextInt();
    } while (n <= 0);

    int count = 0;
    for(int i = 1; i <= n; i++) {
      if(n % i == 0) {
        count++;
      }
    }
    System.out.println("Số lượng ước số lẻ của số nguyên dương n là: "+n+" : " +count);
  }
}
