package BTVN_Buoi2;

import java.util.Scanner;

public class Bai14 {
  public static void main(String[] args) {
    int n, soDu;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập vào số nguyên dương bất kỳ: ");
    n = scanner.nextInt();

    int tich = 1;
    while (n > 0) {
      soDu = n % 10;
      n = n / 10;
      tich *= soDu;
      n /=10;
    }

    System.out.println("Tích các chữ số = " + tich);
  }
}


