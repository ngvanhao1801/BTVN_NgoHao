package Buoi3.Bai2;

import java.util.Scanner;

public class RunMain {
//  Tạo một lớp Array gồm:
//  Thuộc tính: 1 mảng số nguyên, 1 số nguyên n là số phần tử của mảng.
//  Phương thức: inputData(): nhập số phần tử và 1 mảng số nguyên, Show(): hiển thị các phần tử của mảng trên một dòng.
//  Sum(): tổng các phần tử trong dãy mảng số nguyên.
//      Filter(Boolean flag): flag = true thì lọc ra các số chẵn, ngược lại lọc ra các số lẻ
//  Các constructor và getter + setter
//  Tạo class RunMain có phương thức main:
//  Tạo 2 đối tượng arr1 và arr2 là thể hiện của lớp Array. Sau đó nhập dữ liệu cho 2 đối tượng đó.
//  So sánh TBC các phần tử của 2 đối tượng đó, nếu của đối tượng nào lớn hơn thì thông báo ra màn hình. Nếu bằng nhau thì in ra “Bye”.

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
