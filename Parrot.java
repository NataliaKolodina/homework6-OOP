// package homework.homework6;

public class Parrot extends Animal implements Flyable {
  public Parrot(String name, int age) {
    super(name, age);
  }

  @Override
  public void fly() {
    System.out.println(getName() + " прекрасно летает.");
  }

  @Override
  public void eat() {
    System.out.println(getName() + " ест семечки.");
  }

}
