package Buoi3.Bai1;

public class MainPerson {
//  Khai báo lớp Person gồm các thuộc tính: name, age, gender, hobby.
//  Yêu cầu:
//      + Dùng constructor để khởi tạo 1 đối tượng với đầy đủ thuộc tính và toString() để hiển thị thông tin đối tượng
//	+ Sử dụng setter, getter nhập xuất thông tin cho 1 person
//-> xuất thông tin 2 person trên.

  public static void main(String[] args) {
    Person person1 = new Person("Nobita", 35, "Male", "Playing baseall");
    Person person2 = new Person("Shisuka", 30, "Female", "Reading books");

    System.out.println(person1);
    System.out.println(person2);

    person1.setName("Doremon");
    person1.setAge(35);
    person1.setGender("Male");
    person1.setHobby("Eating donuts");

    System.out.println(person1);
  }
}
