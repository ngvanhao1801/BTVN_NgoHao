package Buoi7;

import java.util.Scanner;

public class Bai3 {
//   Viết hàm thực hiện các yêu cầu sau
//Nhập vào một số nguyên n bất kì
//Hàm nhập mảng gồm n phần tử nguyên
//Chèn số k(k không là số hoàn hảo) bất kì vào trước tất cả các phần tử là số hoàn hảo trong mảng
//Xuất mảng ra màn hình
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào số nguyên n: ");
    int n = scanner.nextInt();
    do {
      System.out.print("Nhập số phần tử của mảng: ");
      n = scanner.nextInt();
    } while (n < 0);
    int[] arr = new int[n];
    System.out.println("Nhập các phần tử của mảng:");
    for (int i = 0; i < n; i++) {
      System.out.print("arr[" + i + "] = ");
      arr[i] = scanner.nextInt();
    }
    System.out.print("Nhập số k: ");
    int k = scanner.nextInt();

    chenSo(arr, k);

    System.out.println("Mảng sau khi chèn số k vào trước các phần tử là số hoàn hảo:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
  public static boolean soHoanHao(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum == number;
  }
  public static void chenSo(int[] arr, int k) {
    for (int i = 0; i < arr.length; i++) {
      if (soHoanHao(arr[i])) {
        shiftElementsRight(arr, i);
        arr[i] = k;
        i++;
      }
    }
  }
  public static void shiftElementsRight(int[] arr, int index) {
    for (int i = arr.length - 1; i > index; i--) {
      arr[i] = arr[i - 1];
    }
  }
}