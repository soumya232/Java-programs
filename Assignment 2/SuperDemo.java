class Parent {

    int value = 50;

    Parent() {
        System.out.println("Parent constructor called");
    }

    void display() {
        System.out.println("Parent method called");
    }
}

class Child extends Parent {

    Child() {
        super();
    }

    void show() {
        super.display();
        System.out.println("Parent variable value: " + super.value);
    }
}

public class SuperDemo {

    public static void main(String[] args) {

        Child c = new Child();
        c.show();
    }
}