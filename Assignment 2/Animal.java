public class Animal {

    String type = "Mammal";

    public static void main(String[] args) {

        Dog d = new Dog();
        d.display();
    }
}

class Mammal extends Animal {

    String breed = "Labrador";
}

class Dog extends Mammal {

    String name = "Buddy";

    void display() {
        System.out.println("Dog Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Animal Type: " + type);
    }
}