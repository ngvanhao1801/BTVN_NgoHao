package Buoi8;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int n;
      do {
        System.out.print("Nhập số phần tử của mảng (n>=3 && n < 1000): ");
        n = scanner.nextInt();
      } while (n <= 3 || n >= 50);
      double[] arr = new double[n];
      System.out.println("Nhập các phần tử của mảng:");
      for (int i = 0; i < n; i++) {
        System.out.print("arr[" + i + "] = ");
        arr[i] = scanner.nextDouble();
      }

      // Tính tổng trung bình cộng của các phần tử có phần nguyên chẵn
      double average = calculateAverageOfEvenIntegers(arr);
      if (Double.isNaN(average)) {
        System.out.println("Không có phần tử có phần nguyên chẵn trong mảng: -1");
      } else {
        System.out.println("Tổng trung bình cộng của các phần tử có phần nguyên chẵn trong mảng: " + average);
      }

      // Sắp xếp mảng tăng dần và in ra màn hình
      Arrays.sort(arr);
      System.out.println("Mảng sau khi sắp xếp tăng dần:");
      printArray(arr);

      // Chuyển tất cả các phần tử có phần nguyên lẻ thành số 1.23
      convertOddIntegers(arr);
      System.out.println("Mảng sau khi chuyển các phần tử có phần nguyên lẻ thành số 1.23:");
      printArray(arr);
    }

    // Tính tổng trung bình cộng của các phần tử có phần nguyên chẵn trong mảng
    public static double calculateAverageOfEvenIntegers(double[] arr) {
      int count = 0;
      double sum = 0;

      for (double num : arr) {
        if (num == (int) num && (int) num % 2 == 0) {
          sum += num;
          count++;
        }
      }
      if (count > 0) {
        return sum / count;
      } else {
        return Double.NaN;
      }
    }
    // Chuyển tất cả các phần tử có phần nguyên lẻ thành số 1.23
    public static void convertOddIntegers(double[] arr) {
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == (int) arr[i] && (int) arr[i] % 2 != 0) {
          arr[i] = 1.23;
        }
      }
    }
    // In ra một mảng
    public static void printArray(double[] arr) {
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i != arr.length - 1) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
