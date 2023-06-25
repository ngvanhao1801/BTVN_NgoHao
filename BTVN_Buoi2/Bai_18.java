package BTVN_Buoi2;

public class Bai_18 {
  public static void main(String[] args) {

    int  n = 123;
    boolean flag = true;
    while (n >0) {
      if (n%10%2==0) {
        n++;
        flag = false;
      }
    }
    if (flag = true) {
      System.out.println("Toan bo so le");
    } else {
      System.out.println("Ton tai " +n  + " so chan");

    }
  }
}
