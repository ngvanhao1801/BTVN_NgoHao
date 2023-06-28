package Buoi3.Bai3;

public class Guns {
  private String weaponName;
  private int ammoNumber;

  public Guns(String weaponName) {
  }

  public Guns(String weaponName, int ammoNumber) {
    this.weaponName = weaponName;
    this.ammoNumber = 100;
  }

  public String getWeaponName() {

    return weaponName;
  }

  public void setWeaponName(String weaponName) {

    this.weaponName = weaponName;
  }

  public int getAmmoNumber() {

    return ammoNumber;
  }

  public void setAmmoNumber(int ammoNumber) {

    this.ammoNumber = ammoNumber;
  }

  // Load method
  public void Load(int x) {

    this.ammoNumber += x;
  }

  // Shoot method
  public void Shoot(int x) {
    if (this.ammoNumber >= x) {
      this.ammoNumber -= x;
      System.out.println(this.weaponName + " Đã bắn " + x + " viên đạn.");
      if (this.ammoNumber == 0) {
        System.out.println("Hết đạn!");
      }
    } else {
      System.out.println("Không đủ đạn để bắn.");
    }
  }
}
