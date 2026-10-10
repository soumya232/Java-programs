
public class BankTransaction extends Thread {
    int amount;

    BankTransaction(int amount, String name, int priority) {
        this.amount = amount;
        setName(name);
        setPriority(priority);
    }

    public void run() {
        if (amount >= 50000) {
            System.out.println(
                    "High-value transaction processed first"
            );
        } else {
            System.out.println(
                    "Low-value transaction processed later"
            );
        }
    }

    public static void main(String[] args)
            throws InterruptedException {

        BankTransaction t1 = new BankTransaction(
                5000, "Transaction1", Thread.MIN_PRIORITY
        );

        BankTransaction t2 = new BankTransaction(
                50000, "Transaction2", Thread.MAX_PRIORITY
        );

        t2.start();
        t2.join();

        t1.start();
        t1.join();
    }
}
