package BTVN_Buoi2;

import java.util.Scanner;

public class Bai4 {
  public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập n là số điện tiêu thụ của một hộ gia đình: ");
    n = scanner.nextInt();

    int giaDien;
    if (n <= 100) {
      giaDien = 750;
    } else if (n <= 200) {
      giaDien = 1250;
    } else if (n <= 300) {
      giaDien = 1750;
    } else {
      giaDien = 3000;
    }
    int tienDien = n * giaDien;
    System.out.println("Số tiền điện phải trả của hộ gia đình trong một tháng là: "+tienDien+" đồng.");
  }
}
