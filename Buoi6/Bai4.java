package Buoi6;

import java.util.Scanner;

public class Bai4 {
//  Nhập chuỗi ký tự và chuẩn hóa chuỗi tên riêng
//+Không còn dấu cách ở hai đầu.
//+ Giữa hai từ chỉ cách nhau đúng 1 dấu cách.
//+ Sau dấu cách viết Hoa chữ cái đầu , còn lại viết thường.
//  In chuỗi ra màn hình sau khi chuẩn hóa

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập vào chuỗi ký tự: ");
    String input = scanner.nextLine();

    String normalizedString = normalizeName(input);

    System.out.println("Chuỗi sau khi được chuẩn hóa: " + normalizedString);
  }

  public static String normalizeName(String input) {
    // Chuyển tất cả ký tự thành chữ thường
    String lowercaseString = input.toLowerCase();

    // Tách các từ trong chuỗi
    String[] words = lowercaseString.split(" ");

    // Chuẩn hóa các từ
    StringBuilder normalizedString = new StringBuilder();
    for (String word : words) {
      if (!word.isEmpty()) {
        // Chuyển chữ cái đầu tiên của từ thành chữ hoa
        String normalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
        normalizedString.append(normalizedWord).append(" ");
      }
    }
    return normalizedString.toString().trim();
  }
}
