package BTVN_NgoHao.BtvnBuoi2;

import java.util.Scanner;

public class Bai4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào chuỗi cần chuẩn hóa: ");
    String input = scanner.nextLine();
    String result = normalizeString(input);
    System.out.println("Chuỗi sau khi chuẩn hóa: " + result);
  }

  public static String normalizeString(String input) {
    // Xóa khoảng trắng thừa 2 đầu
    input = input.trim();
    // Thay thế các khoảng trắng liên tiếp bằng 1 khoảng trắng duy nhất
    input = input.replaceAll("\\s+", " ");
    // Kiểm tra và loại bỏ các ký tự số
    input = input.replaceAll("\\d", "");
    String[] words = input.split(" ");
    StringBuilder result = new StringBuilder();
    for (String word : words) {
      // Viết hoa ký tự đầu của từ
      String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
      result.append(capitalized).append(" ");
    }
    return result.toString().trim();
  }
}
