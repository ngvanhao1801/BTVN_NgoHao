package BTVN_NgoHao.BTVN_Buoi1;

import java.util.Scanner;

public class Bai6 {
  public static void main(String[] args) {
    int a;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập a là số điện của hộ gia đình: ");
    a = scanner.nextInt();

    int giaDien;
    if (a < 50) {
    giaDien = 1500;
    } else if (a < 100)
    {
      giaDien = 2000;
    } else if (a < 150)
    {
      giaDien = 3500;
    } else if (a < 200)
    {
      giaDien = 4000;
    } else
    {
      giaDien = 5000;
    }

    int tiendien = a * giaDien;
    System.out.println("Tiền điện của hộ gia đình là: "+tiendien+" đồng.");
  }
}
