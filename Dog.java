// package homework.homework6;

public class Dog extends Animal implements WagTailable, Swimable {
  public Dog(String name, int age) {
    super(name, age);
  }

  public void wagTail() {
    System.out.println(getName() + " виляет хвостом.");
  }

  @Override
  public void eat() {
    System.out.println(getName() + " кушает собачий корм.");
  }

  @Override
  public void swim() {
    System.out.println(getName() + " отлично плавает");
  }

}
