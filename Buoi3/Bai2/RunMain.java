package Buoi3.Bai2;

import java.util.Scanner;

public class RunMain {
  public static void main(String[] args) {
    Array arr1 = new Array();
    arr1.inputData();
    arr1.show();
    System.out.println("Tổng các phần tử trong mảng: " + arr1.sum());
    arr1.filter(true);

    Array arr2 = new Array();
    arr2.inputData();
    arr2.show();
    System.out.println("Tổng các phần tử trong mảng: " + arr2.sum());
    arr2.filter(false);

    double tbc1 = (double) arr1.sum() / arr1.getN();
    double tbc2 = (double) arr2.sum() / arr2.getN();
    if (tbc1 > tbc2) {
      System.out.println("Trung bình cộng phần tử của arr1 lớn hơn arr2");
    } else if (tbc1 < tbc2) {
      System.out.println("Trung bình cộng phần tử của arr2 lớn hơn arr1");
    } else {
      System.out.println("Bye");
    }
  }
}
