package BTVN_NgoHao.BTVN_Buoi1;

import java.util.Scanner;

public class Bai4 {
  public static void main(String[] args) {
    int month;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập tháng trong năm: ");
    month = scanner.nextInt();

    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("Tháng " + month + " có 31 ngày.");
        break;

      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println("Tháng " + month + " có 30 ngày.");
        break;

      case 2:
        int year;
        System.out.println("Mời bạn nhập năm: ");
        year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
          System.out.println("Tháng " + month + " năm " + year + " có 29 ngày.");
        } else {
          System.out.println("Tháng " + month + " năm " + year + " có 28 ngày.");
        }
        break;
      default:
        System.out.println("Con số này không phải là một tháng trong năm! ");
    }
  }
}
