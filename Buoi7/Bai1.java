package Buoi7;

import java.util.Scanner;

public class Bai1 {
//  Viết hàm thực hiện các yêu cầu sau
//  Nhập vào một số nguyên n bất kì với n > 3
//  Nhập vào một số thực x bất kì với x != 0
//  Viết hàm tính S(x, n)
//  Hàm main hoàn thiện các yêu cầu bằng các lời gọi hàm S

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập vào số nguyên n: ");
    int n = scanner.nextInt();

    System.out.print("Nhập vào số thực x: ");
    double x = scanner.nextDouble();

    double result = calculateS(x, n);
    System.out.println("Giá trị của biểu thức S(x, n) là: " + result);
  }

  public static double calculateS(double x, int n) {
    double result = 1;
    double power = x;
    double factorial = 1;
    boolean isNegative = true;

    for (int i = 1; i <= n; i++) {
      power *= x * x;
      factorial *= (2 * i) * (2 * i + 1);
      if (isNegative) {
        result -= (power / factorial);
      } else {
        result += (power / factorial);
      }
      isNegative = !isNegative;
    }

    return result;
  }
}

//  `result` là biến để lưu giá trị của biểu thức S(x,n).
//      `power` là biến để lưu giá trị x^k,với k là mũ của x trong biểu thức.
//      `factorial` là biến để lưu giá trị của giai thừa(2n+1)!trong biểu thức.
//      `isNegative` là một biến boolean dùng để kiểm tra xem giá trị của biểu thức là âm hay dương.
//      Nếu `isNegative` là true,tức là biểu thức được cộng vào `result`.Ngược lại,nếu `isNegative` là false,
//      tức là biểu thức được trừ từ `result`.