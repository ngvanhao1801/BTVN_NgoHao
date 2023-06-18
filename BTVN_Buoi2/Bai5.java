package BTVN_Buoi2;

import java.util.Scanner;

public class Bai5 {
  public static void main(String[] args) {
    int x;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập giá trị x: ");
    x = sc.nextInt();

    double ketQua = (Math.pow(x,2) + (Math.exp(Math.abs(x)) + Math.pow(Math.sin(x), 2)) / Math.pow(x,3));

    System.out.println("Giá trị biểu thức F(x) = "+ketQua);
  }
}
