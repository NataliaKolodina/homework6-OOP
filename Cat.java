// package homework.homework6;

public class Cat extends Animal implements Scratchable {
  // добавила имплементацию наслеванного интерфейса
  // Scratchable и убрала Animal из имплементации, так
  // как интерфейс Scratchable наследует методы
  // базового интерфейса
  public Cat(String name, int age) {
    super(name, age);
  }

  @Override
  public void scratch() {
    System.out.println(getName() + " царапается.");
  }

  @Override
  public void eat() {
    System.out.println(getName() + " кушает рыбу.");
  }

}