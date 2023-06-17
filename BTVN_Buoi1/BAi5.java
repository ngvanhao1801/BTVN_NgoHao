package BTVN_Buoi1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BAi5 {
  public static void main(String[] args) {

    int n, m, a;
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập n là chiều dài sân chơi: ");
    n = scanner.nextInt();

    System.out.println("Nhập m là chiều rộng sân chơi: ");
    m = scanner.nextInt();

    System.out.println("Nhập a là độ dài viên gạch: ");
    a = scanner.nextInt();

    int dienTichSan = n * m;
    int dienTichGach = a * a;
    float gachCanMua = (float) dienTichSan / dienTichGach;
    System.out.println("Số gạch cần mua là: ");
    System.out.println( dienTichSan + " / " + dienTichGach + " = " +
        decimalFormat.format(gachCanMua));
  }
}
