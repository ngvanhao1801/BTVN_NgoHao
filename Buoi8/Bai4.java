package Buoi8;

import java.util.Scanner;

public class Bai4 {
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
    // Chuyển tất cả các số chẵn thành số lẻ bằng phép toán chia cho 2 (0 giữ nguyên)
    convertEvenNumbers(arr);
    System.out.println("Mảng sau khi chuyển các số chẵn thành số lẻ:");
    printArray(arr);
    // Chuyển các phần tử không là số nguyên tố thành số nguyên tố gần nhất
    convertNonPrimeNumbers(arr);
    System.out.println("Mảng sau khi chuyển các phần tử không là số nguyên tố thành số nguyên tố gần nhất:");
    printArray(arr);
  }

  // Chuyển tất cả các số chẵn thành số lẻ bằng phép toán chia cho 2 (0 giữ nguyên)
  public static void convertEvenNumbers(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0 && arr[i] % 2 == 0) {
        arr[i]--;
      }
    }
  }

  // Kiểm tra xem một số có phải là số nguyên tố hay không
  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
  // Chuyển các phần tử không là số nguyên tố thành số nguyên tố gần nhất
  public static void convertNonPrimeNumbers(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (!isPrime(arr[i])) {
        int smallerPrime = arr[i] - 1;
        int largerPrime = arr[i] + 1;

        while (!isPrime(smallerPrime) && !isPrime(largerPrime)) {
          smallerPrime--;
          largerPrime++;
        }

        if (isPrime(smallerPrime)) {
          arr[i] = smallerPrime;
        } else {
          arr[i] = largerPrime;
        }
      }
    }
  }
  // In ra một mảng
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i != arr.length - 1) {
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}
