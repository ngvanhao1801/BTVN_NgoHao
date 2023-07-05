package Buoi8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
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
    // Kiểm tra mảng có 2 số chẵn gần nhau hay không
    boolean hasAdjacentEvenNumbers = checkAdjacentEvenNumbers(arr);
    System.out.println("Mảng có 2 số chẵn gần nhau? " + (hasAdjacentEvenNumbers ? "YES" : "NO"));
    // Tách mảng thành mảng lẻ và mảng chẵn
    ArrayList<Integer> oddArray = new ArrayList<>();
    ArrayList<Integer> evenArray = new ArrayList<>();
    separateOddAndEven(arr, oddArray, evenArray);
    // In ra mảng lẻ và mảng chẵn
    if (oddArray.size() == 0 || evenArray.size() == 0) {
      System.out.println("-1");
    } else {
      printArray(oddArray);
      System.out.print(" - ");
      printArray(evenArray);
      System.out.println();
    }
    // Sắp xếp mảng giảm dần và in ra màn hình
    Arrays.sort(arr);
    reverseArray(arr);
    System.out.println("Mảng sau khi sắp xếp giảm dần:");
    printArray(arr);
  }
  // Kiểm tra mảng có 2 số chẵn gần nhau hay không
  public static boolean checkAdjacentEvenNumbers(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {
        return true;
      }
    }
    return false;
  }
  // Tách mảng thành mảng lẻ và mảng chẵn
  public static void separateOddAndEven(int[] arr, ArrayList<Integer> oddArray, ArrayList<Integer> evenArray) {
    for (int num : arr) {
      if (num != 0) {
        if (num % 2 == 0) {
          evenArray.add(num);
        } else {
          oddArray.add(num);
        }
      }
    }
  }
  // In ra một mảng
  public static void printArray(ArrayList<Integer> arr) {
    for (int i = 0; i < arr.size(); i++) {
      System.out.print(arr.get(i));
      if (i != arr.size() - 1) {
        System.out.print(" ");
      }
    }
  }
  // In ra một mảng nguyên
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i != arr.length - 1) {
        System.out.print(" ");
      }
    }
    System.out.println();
  }
  // Sắp xếp mảng giảm dần
  public static void reverseArray(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }
}
