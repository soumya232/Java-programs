interface MyInterface {

    default void display() {
        System.out.println("This is a default method.");
    }

    static void message() {
        System.out.println("This is a static method.");
    }
}

class MyClass implements MyInterface {
}

public class InterfaceMethods {

    public static void main(String[] args) {

        MyClass obj = new MyClass();

        obj.display();

        MyInterface.message();
    }
}