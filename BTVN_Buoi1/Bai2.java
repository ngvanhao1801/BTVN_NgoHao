package BTVN_NgoHao.BTVN_Buoi1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai2 {
  public static void main(String[] args) {
    int a, b;
    Scanner scanner = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    System.out.println("Nhập giá trị a: ");
    a = scanner.nextInt();

    System.out.println("Nhập giá trị b: ");
    b = scanner.nextInt();

    int tong = a + b;
    System.out.println("Tổng của " + a + " + " + b + " = " + tong);

    int hieu = a - b;
    System.out.println("Hiệu của " + a + " - " + b + " = " + hieu);

    int tich = a * b;
    System.out.println("Tích của " + a + " * " + b + " = " + tich);

    int du = a % b;
    System.out.println("Phần dư của " + a + " % " + b + " = " + du);

    float thuong = (float) a / b;
    System.out.println("Thương của "+ a + " / " + b + " = " +
        decimalFormat.format(thuong));  // làm tròn đến 2 chữ số thập phân
  }
}
