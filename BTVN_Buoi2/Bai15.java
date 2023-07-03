package BTVN_Buoi2;

import java.util.Scanner;

public class Bai15 {
  public static void main(String[] args) {

    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập số nguyên dương n: ");
    n = scanner.nextInt();

    int tich = 1;
    int soDu;
    while (n > 0) {
      soDu = n % 10;
      n /= 10;

      if (soDu % 2 == 1) {
        tich *= soDu;
      }
    }
    System.out.println("Tích các chữ số lẻ của số nguyên n: " + tich);
  }
}
