class Cat extends Animal {
  private int age; // 나이

  // 생성자
  public Cat(String name, int age) {
    super(name); this.age = age;
  }

  public void bark() { 
    System.out.println("야옹");
  }
}
