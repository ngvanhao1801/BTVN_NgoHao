package BTVN_Buoi2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    int a, b;
    double x;

    System.out.println("Nhập hệ số a: ");
    a = scanner.nextInt();
    System.out.println("Nhập hệ số b: ");
    b = scanner.nextInt();

    System.out.println("Phương trình bạn vừa nhập là: " + a + "x + " + b +" = 0");

    if (a == 0) {
      if (b == 0) {
        System.out.println("Phương trình đã cho có vô số nghiệm! ");
      } else {
        System.out.println("Phương trình đã cho vô nghiệm! ");
      }

    } else {
      x = (double) -b/a;
      System.out.println("Phương trình đã cho có nghiệm x = "+decimalFormat.format(x)+"");
    }
  }
}
