interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

class Animal {
    void breathe() {
        System.out.println("Animal is breathing");
    }
}

class Mammal extends Animal {
    void feedMilk() {
        System.out.println("Mammal is feeding milk");
    }
}

class Dog extends Mammal implements Walkable, Swimmable {
    public void walk() {
        System.out.println("Dog is walking");
    }

    public void swim() {
        System.out.println("Dog is swimming");
    }
}

class Cat extends Mammal implements Walkable {
    public void walk() {
        System.out.println("Cat is walking");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breathe();
        dog.feedMilk();
        dog.walk();
        dog.swim();

        Cat cat = new Cat();
        cat.breathe();
        cat.feedMilk();
        cat.walk();
    }
}
