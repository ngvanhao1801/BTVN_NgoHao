package Buoi8;

import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n;
      do {
        System.out.print("Nhập số phần tử của mảng (n>=3 && n < 1000): ");
        n = scanner.nextInt();
      } while (n <= 3 || n >= 50);
      int[] arr = new int[n];
      System.out.println("Nhập các phần tử của mảng:");
      for (int i = 0; i < n; i++) {
        System.out.print("arr[" + i + "] = ");
        arr[i] = scanner.nextInt();
      }

      // Nhập số nguyên x
      System.out.print("Nhập số nguyên x: ");
      int x = scanner.nextInt();

      // Đếm số phần tử nhỏ hơn x trong mảng
      int count = countElementsLessThanX(arr, x);
      System.out.println("Số phần tử nhỏ hơn " + x + " trong mảng: " + count);

      // Tính trung bình cộng các số chia hết cho 3 nhưng không chia hết cho 5 trong mảng
      double average = calculateAverageDivisibleBy3NotBy5(arr);
      System.out.println("Trung bình cộng các số chia hết cho 3 nhưng không chia hết cho 5 trong mảng: " + average);

      // Kiểm tra trật tự mảng
      boolean isSorted = checkArrayOrder(arr);
      System.out.println("Mảng đã được sắp xếp tăng dần hoặc giảm dần? " + (isSorted ? "YES" : "NO"));
    }

    // Đếm số phần tử nhỏ hơn x trong mảng
    public static int countElementsLessThanX(int[] arr, int x) {
      int count = 0;
      for (int num : arr) {
        if (num < x) {
          count++;
        }
      }
      return count;
    }

    // Tính trung bình cộng các số chia hết cho 3 nhưng không chia hết cho 5 trong mảng
    public static double calculateAverageDivisibleBy3NotBy5(int[] arr) {
      int sum = 0;
      int count = 0;
      for (int num : arr) {
        if (num % 3 == 0 && num % 5 != 0) {
          sum += num;
          count++;
        }
      }
      if (count > 0) {
        return (double) sum / count;
      } else {
        return 0;
      }
    }

    // Kiểm tra trật tự mảng
    public static boolean checkArrayOrder(int[] arr) {
      boolean isAscending = true;
      boolean isDescending = true;

      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          isAscending = false;
        }
        if (arr[i] < arr[i + 1]) {
          isDescending = false;
        }
      }

      return isAscending || isDescending;
    }
  }
