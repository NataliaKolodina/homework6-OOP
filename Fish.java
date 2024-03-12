// package homework.homework6;

public class Fish extends Animal implements Swimable {
  public Fish(String name, int age) {
    super(name, age);
  }

  @Override
  public void swim() {
    System.out.println(getName() + " отлично плавает.");
  }

  @Override
  public void eat() {
    System.out.println(getName() + " кушает червей.");
  }

}