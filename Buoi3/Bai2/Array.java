package Buoi3.Bai2;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
  private int[] arr;
  private int n;

  public Array() {
  }

  public Array(int n) {
    this.n = n;
    this.arr = new int[n];
  }

  public void inputData() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập số phần tử của mảng: ");
    this.n = scanner.nextInt();
    this.arr = new int[n];
    System.out.println("Nhập các phần tử của mảng: ");
    for (int i = 0; i < n; i++) {
      System.out.print("arr[" + i + "] = ");
      arr[i] = scanner.nextInt();
    }
  }

  public void show() {
    System.out.print("Các phần tử trong mảng: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public int sum() {
    int s = 0;
    for (int i = 0; i < n; i++) {
      s += arr[i];
    }
    return s;
  }

  public void filter(boolean flag) {
    if (flag) {
      System.out.print("Các số chẵn trong mảng: ");
      for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) {
          System.out.print(arr[i] + " ");
        }
      }
      System.out.println();
    } else {
      System.out.print("Các số lẻ trong mảng: ");
      for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 1) {
          System.out.print(arr[i] + " ");
        }
      }
      System.out.println();
    }
  }

  public int[] getArr() {
    return arr;
  }

  public void setArr(int[] arr) {
    this.arr = arr;
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
    this.arr = new int[n];
  }

  @Override
  public String toString() {
    return "Array{" +
        "arr=" + Arrays.toString(arr) +
        ", n=" + n +
        '}';
  }
}
