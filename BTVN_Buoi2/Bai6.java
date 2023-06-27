package BTVN_NgoHao.BTVN_Buoi2;

import java.util.Scanner;

public class Bai6 {
  public static void main(String[] args) {
    double a;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập số tiền phải trả của khách hàng: ");
    a = scanner.nextDouble();

    double giaKhuyenMai = 0;
    if (a >=200 && a <300) {
      giaKhuyenMai = a * 0.2;
    } else if (a >= 300) {
      giaKhuyenMai = a *0.3;
    }
    System.out.println("Số tiền khuyến mại của khách hàng là: " + giaKhuyenMai);
    }
  }

