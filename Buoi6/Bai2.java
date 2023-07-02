package Buoi6;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
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
    // Kiểm tra số chính phương
    boolean isSquareNumbers = true;
    for (int num : arr) {
      if (!isSquareNumber(num)) {
        isSquareNumbers = false;
        break;
      }
    }
    // Trường hợp tất cả phần tử là số chính phương
    if (isSquareNumbers) {
      Arrays.sort(arr);
      System.out.println("Các phần tử mảng sau khi sắp xếp tăng dần:");
      for (int num : arr) {
        System.out.print(num + " ");
      }
    }
    // Trường hợp có phần tử không phải là số chính phương
    else {
      int[] newArr = removeNonSquareNumbers(arr);

      System.out.println("Mảng sau khi loại bỏ các số không phải là số chính phương:");
      for (int num : newArr) {
        System.out.print(num + " ");
      }
    }
  }
  // Kiểm tra một số có phải là số chính phương hay không
  public static boolean isSquareNumber(int number) {
    double sqrt = Math.sqrt(number);
    return (sqrt == Math.floor(sqrt));
  }
  // Loại bỏ các số không phải là số chính phương
  public static int[] removeNonSquareNumbers(int[] arr) {
    int count = 0;

    for (int num : arr) {
      if (!isSquareNumber(num)) {
        count++;
      }
    }
    int[] newArr = new int[arr.length - count];

    int index = 0;
    for (int num : arr) {
      if (isSquareNumber(num)) {
        newArr[index++] = num;
      }
    }
    return newArr;
  }
}