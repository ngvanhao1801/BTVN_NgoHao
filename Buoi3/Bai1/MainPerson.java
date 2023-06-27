package Buoi3.Bai1;

public class MainPerson {
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
