public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum (int,int): " + c.add(3, 4));

        System.out.println("Sum (double,double): " + c.add(2.5, 3.2));

        System.out.println("Sum (int,int,int): " + c.add(4, 5, 6));
    }
}