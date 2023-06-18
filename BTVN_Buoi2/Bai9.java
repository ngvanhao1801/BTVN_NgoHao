package BTVN_Buoi2;

import java.util.Scanner;

public class Bai9 {
  public static void main(String[] args) {
    double n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập vào thu nhập của bạn: ");
    n = scanner.nextDouble();

    double tienThue;
    if (n < 3000000) {
      tienThue = n * 0.05;
    } else if (n >= 3000000 && n < 6000000) {
      tienThue = n * 0.1;
    } else if (n >= 6000000 && n <10000000) {
      tienThue = n * 0.15;
    } else {
      tienThue = n * 0.25;
    }
    System.out.println("Tiền thuế bạn phải trả là: "+tienThue);

    double tienDuocLinh = n - tienThue;
    System.out.println("Số tiền bạn được lĩnh sau khi trừ thuế: "+n+" - "+tienThue+" = "+tienDuocLinh+"");
  }
}
