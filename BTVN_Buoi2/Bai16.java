package BTVN_Buoi2;

import java.util.Scanner;

public class Bai16 {
  public static void main(String[] args) {
    int n = 123;
    int soDu = 0;
    int x = 0;

    while (n > 0) {
      soDu = n % 10;
      n /= 10;

      x = (x * 10) + soDu;
    }
    System.out.println("Số đảo ngược của số nguyên dương n: " +x);
  }
}
