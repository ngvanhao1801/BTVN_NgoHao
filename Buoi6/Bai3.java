package Buoi6;

import java.util.Scanner;

public class Bai3 {
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
      // Kiểm tra tất cả các phần tử có phải là số hoàn hảo hay không
      boolean isPerfectNumbers = true;

      for (int num : arr) {
        if (!isPerfectNumber(num)) {
          isPerfectNumbers = false;
          break;
        }
      }

      // Trường hợp tất cả phần tử là số hoàn hảo
      if (isPerfectNumbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Tìm phần tử lớn nhất và nhỏ nhất trong mảng
        for (int num : arr) {
          if (num > max) {
            max = num;
          }
          if (num < min) {
            min = num;
          }
        }

        int distance = Math.abs(max - min);
        System.out.println("Khoảng cách xa nhất giữa các phần tử trong mảng: " + distance);
      }
      // Trường hợp có phần tử không phải là số hoàn hảo
      else {
        int[] newArr = removeOddNumbers(arr);

        System.out.println("Mảng sau khi loại bỏ các phần tử lẻ:");
        for (int num : newArr) {
          System.out.print(num + " ");
        }
      }
    }

    // Kiểm tra một số có phải là số hoàn hảo hay không
    public static boolean isPerfectNumber(int number) {
      int sum = 0;

      for (int i = 1; i <= number / 2; i++) {
        if (number % i == 0) {
          sum += i;
        }
      }

      return (sum == number);
    }

    // Loại bỏ các số lẻ khỏi mảng
    public static int[] removeOddNumbers(int[] arr) {
      int count = 0;

      for (int num : arr) {
        if (num % 2 != 0) {
          count++;
        }
      }

      int[] newArr = new int[arr.length - count];

      int index = 0;
      for (int num : arr) {
        if (num % 2 == 0) {
          newArr[index++] = num;
        }
      }

      return newArr;
    }
  }
