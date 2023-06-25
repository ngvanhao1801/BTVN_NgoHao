package BTVN_NgoHao.BtvnBuoi2;

import java.util.Scanner;

public class Bai3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Nhập chuỗi: ");
    String str = input.nextLine();
    boolean containsNumber = false;
    int sum = 0, count = 0;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (Character.isDigit(c)) {
        containsNumber = true;
        sum += Character.getNumericValue(c);
        count++;
      }
    }
    System.out.println(containsNumber);
    if (count > 0) {
      System.out.println("Trung bình cộng các số trong chuỗi: " + (sum * 1.0 / count));
    }
  }
}
