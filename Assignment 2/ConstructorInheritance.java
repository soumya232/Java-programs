class Base {

    Base() {
        System.out.println("Base Constructor Called");
    }
}

class Derived extends Base {

    Derived() {
        System.out.println("Derived Constructor Called");
    }
}

public class ConstructorInheritance {

    public static void main(String[] args) {

        Derived d = new Derived();
    }
}