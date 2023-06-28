package Buoi3.Bai3;

import java.util.Random;

public class RunMain {
  public static void main(String[] args) {
    Guns DiepBeDe = new Guns("Diệp Bế Đẹp");
    Guns DoanXinhGai = new Guns("Doãn Xinh Gái");
    Random rand = new Random();

    while (DiepBeDe.getAmmoNumber() > 0 && DoanXinhGai.getAmmoNumber() > 0) {
      int x = rand.nextInt(10) + 1;
      DiepBeDe.Shoot(x);
      x = rand.nextInt(10) + 1;
      DoanXinhGai.Shoot(x);
    }

    if (DiepBeDe.getAmmoNumber() == 0 && DoanXinhGai.getAmmoNumber() == 0) {
      System.out.println("Cả hai đã hết đạn. Trận đấu kết thúc hòa!");
    } else if (DiepBeDe.getAmmoNumber() == 0) {
      System.out.println("Điệp Bế Đẹp đã hết đạn. Doãn Xinh Gái chiến thắng!");
    } else {
      System.out.println("Doãn Xinh Gái đã hết đạn. Điệp Bế Đẹp chiến thắng!");
    }
  }
}
