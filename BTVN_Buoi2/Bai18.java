package BTVN_Buoi2;

import java.util.List;

public class Bai18 {
  public static void main(String[] args) {
//    int n = 1356;
//    int soDu;
//
//    while (n > 0) {
//      soDu = n % 10;
//      if (n % 10 % 2 != 0) {
//      }
//      n = n / 10;
//    }


//    int a = 123;
//    StringBuilder builder = new StringBuilder();
//    builder.append(a);
//    System.out.println(builder.reverse());

    int cnt = 0;
    boolean flag = true;
    List<Integer> lst = List.of(1,2,3,3,5);
    for (int i=0; i<lst.size(); i++) {
      if (lst.get(i) % 2 == 0) {
        cnt++;
        flag = false;
      }
    }

    if (flag == true) {
      System.out.println("Toan bo so le");
    } else {
      System.out.println("Ton tai " + cnt + " so chan");
    }

  }
}
