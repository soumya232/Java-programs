public class StaticDemo {

    static int count = 0;

    StaticDemo() {
        count++;
    }

    public static void main(String[] args) {

        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();
        StaticDemo s3 = new StaticDemo();

        System.out.println("Number of objects created: " + count);
    }
}