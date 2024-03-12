// package homework.homework6;

public class Main {
  public static void main(String[] args) {

    // Создаем объекты различных животных
    Dog dog = new Dog("Бобик", 3);
    Cat cat = new Cat("Мурзик", 5);
    Fish fish = new Fish("Голди", 2);
    Parrot parrot = new Parrot("Кеша", 1);

    // Общие методы
    dog.showAge();
    cat.showAge();
    fish.showAge();
    parrot.showAge();

    System.out.println("///////////////////////////////////////////////");

    dog.eat();
    cat.eat();
    fish.eat();
    parrot.eat();

    System.out.println("///////////////////////////////////////////////");

    // локальные методы
    dog.wagTail();
    cat.scratch();
    fish.swim();
    parrot.fly();

  }
}
