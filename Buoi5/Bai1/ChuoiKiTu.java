package Buoi5.Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuoiKiTu {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào một chuỗi ký tự: ");
    String input = scanner.nextLine();

    int kiTuSo = 0;
    int tichCacChuSo = 1;
    int tongCacChuSo = 0;

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (Character.isDigit(c)) {
        kiTuSo++;
        int digit = Character.getNumericValue(c);
        tichCacChuSo *= digit;
        tongCacChuSo += digit;
      }
    }

    System.out.println("Số lượng ký tự số: " + kiTuSo);
    System.out.println("Tích các chữ số: " + tichCacChuSo);
    System.out.println("Tổng các chữ số: " + tongCacChuSo);
  }
}
