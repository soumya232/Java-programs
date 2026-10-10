public class GarbageDemo {

    protected void finalize() {
        System.out.println("Object destroyed");
    }

    public static void main(String[] args) {

        GarbageDemo g1 = new GarbageDemo();
        GarbageDemo g2 = new GarbageDemo();

        g1 = null;
        g2 = null;

        System.gc();
    }
}