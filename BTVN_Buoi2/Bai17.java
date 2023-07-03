package BTVN_Buoi2;

public class Bai17 {
  public static void main(String[] args) {
    int n = 102;
    int max = 0;
    int soDu;

    while (n > 0) {
      soDu = n % 10;
      if (max < soDu)
        max = soDu;
      n /= 10;
    }
    System.out.println("Chữ số lớn nhất của số nguyên dương n: "+max);
  }
}
