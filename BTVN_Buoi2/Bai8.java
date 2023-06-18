package BTVN_Buoi2;
import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Nhập số nguyên n: ");
      int n = scanner.nextInt();
      int f1 = sumOfN(n);
      int f2 = sumOfExponent(n);
      double f3 = harmonicSum(n);
      double T = f1 + f2 + f3;
      System.out.println("F1 = " + f1);
      System.out.println("F2 = " + f2);
      System.out.println("F3 = " + f3);
      System.out.println("T = " + T);
    }

    // Hàm tính tổng từ 1 đến n
    public static int sumOfN(int n) {
      int sum = 0;
      for (int i = 1; i <= n; i++) {
        sum += i;
      }
      return sum;
    }

    // Hàm tính tổng từ 1^1 đến n^n
    public static int sumOfExponent(int n) {
      int sum = 0;
      for (int i = 1; i <= n; i++) {
        sum += Math.pow(i, i);
      }
      return sum;
    }

    // Hàm tính tổng dãy số học trừu tượng 1/3 + 1/5 + ... + 1/(2n+1)
    public static double harmonicSum(int n) {
      double sum = 0;
      for (int i = 0; i <= n; i++) {
        sum += 1.0 / (2*i + 3);
      }
      return sum;
    }
  }
