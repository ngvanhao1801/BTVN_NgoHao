package Buoi7;

import java.util.Scanner;

public class Bai2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n;
    do {
      System.out.print("Nhập số phần tử của mảng (n>2 && n <= 50): ");
      n = scanner.nextInt();
    } while (n < 2 || n >= 50);
    double[] arr = new double[n];
    System.out.println("Nhập các phần tử của mảng:");
    for (int i = 0; i < n; i++) {
      System.out.print("arr[" + i + "] = ");
      arr[i] = scanner.nextInt();
    }

//    System.out.print("Nhập vào số nguyên n: ");
//    int n = scanner.nextInt();
//
//    double[] arr = new double[n];
//    System.out.println("Nhập các phần tử của mảng:");
//    for (int i = 0; i < n; i++) {
//      arr[i] = scanner.nextDouble();
//    }

    double sum = calculateSumOfPrimeIntegers(arr);
    System.out.println("Tổng các phần tử có phần nguyên là số nguyên tố là: " + sum);

    arr = removeDecimalGreaterThanHalf(arr);
    System.out.println("Mảng sau khi xóa các phần tử có phần thập phân >= 0.5:");
    for (double num : arr) {
      System.out.println(num);
    }
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

  public static double calculateSumOfPrimeIntegers(double[] arr) {
    double sum = 0;

    for (double num : arr) {
      int integerPart = (int) num;
      if (isPrime(integerPart)) {
        sum += num;
      }
    }

    return sum;
  }

  public static double[] removeDecimalGreaterThanHalf(double[] arr) {
    int count = 0;
    for (double num : arr) {
      if (num % 1 >= 0.5) {
        count++;
      }
    }

    double[] newArr = new double[arr.length - count];
    int index = 0;
    for (double num : arr) {
      if (num % 1 < 0.5) {
        newArr[index] = num;
        index++;
      }
    }

    return newArr;
  }
}