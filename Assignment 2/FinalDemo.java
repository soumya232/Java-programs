final class FinalClass {

    void display() {
        System.out.println("This is a final class.");
    }
}

class FinalParent {

    final int value = 100;

    final void show() {
        System.out.println("This is a final method.");
    }
}

public class FinalDemo {

    public static void main(String[] args) {

        FinalParent p = new FinalParent();

        System.out.println("Final variable: " + p.value);

        p.show();

        FinalClass f = new FinalClass();
        f.display();

        System.out.println("Final class cannot be inherited.");
    }
}