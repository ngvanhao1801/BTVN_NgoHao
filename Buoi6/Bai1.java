package Buoi6;

import java.util.Scanner;
  public class Bai1 {
//    Nhập mảng gồm n phần tử nguyên (n>=3 && n < 1000)
//    Tìm những số siêu nguyên tố và in chúng ra màn hình
//        (số siêu nguyên tố được định nghĩa như sau: tất cả số các chữ số của số đó đều là số nguyên tố)
//    Tính tổng tất cả các số siêu siêu nguyên tố
//        (số siêu siêu nguyên tố được định nghĩa như sau: tất cả các chữ số của số đó là số nguyên tố, chính nó cũng là số nguyên tố và mỗi khi bỏ đi phần đơn vị của 1 số cho tới hết thì các số đó vẫn là số nguyên tố)

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n;
      do {
        System.out.print("Nhập số phần tử của mảng (n>=3 && n < 1000): ");
        n = scanner.nextInt();
      } while (n < 3 || n >= 1000);
      int[] arr = new int[n];
      System.out.println("Nhập các phần tử của mảng:");
      for (int i = 0; i < n; i++) {
        System.out.print("arr[" + i + "] = ");
        arr[i] = scanner.nextInt();
      }
      System.out.println("Các số nguyên tố trong mảng là:");
      int sum = 0;
      for (int i = 0; i < n; i++) {
        if (isPrime(arr[i])) {
          System.out.print(arr[i] + " ");
          sum += arr[i];
        }
      }
      System.out.println("\nTổng các số nguyên tố trong mảng là: " + sum);
    }

    public static boolean isPrime(int number) {
      if (number < 2) {
        return false;
      }
      for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
          return false;
        }
      }
      return true;
    }
  }
