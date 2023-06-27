package BTVN_Buoi2;
import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Nhập số nguyên dương n: ");
      int n = scanner.nextInt();
      int sum = 0;
      for (int i = 2; i <= n; i += 2) {
        if (n % i == 0) {
          sum += i;
        }
      }
      System.out.println("Tổng các ước số chẵn của " + n + " là " + sum);
    }
  }
