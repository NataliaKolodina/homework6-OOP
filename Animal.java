// package homework.homework6;

abstract class Animal implements Doable { // Базовый абстрактный класс, который переопределяет один метод showAge,
                                          // реализующийся у абсолютно всех животных (будущих классов программы)
  private String name;
  private int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public void showAge() {
    System.out.println(getName() + " возрастом " + getAge() + " года/лет.");
  }

}