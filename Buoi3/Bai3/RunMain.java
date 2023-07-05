package Buoi3.Bai3;

import java.util.Random;

public class RunMain {
//  Tạo một lớp Guns gồm các thuộc tính: weaponName, ammoNumber.
//  Các phương thức:
//  Load(int x): Khi gọi đến thì ammoNumber sẽ tăng lên x đơn vị.
//      Shoot(int x): Khi gọi đến phương thức này ammoNumber sẽ giảm đi x đơn vị (điều kiện ammoNumber – x >= 0), nếu ammoNumber = 0 thì thông báo hết đạn.
//  x truyền vào đều được random x thuộc [1,10], khởi tạo đối tượng với ammoNumber = 100
//  Các constructor, getter và setter.
//  Tại class RunMain: tạo 2 đối tượng(DiepBeDe, DoanXinhGai) và cho bắn nhau. Đối tượng nào hết đạn trước thì sẽ thua. Thông báo ra màn hình

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
