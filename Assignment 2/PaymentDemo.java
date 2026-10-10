abstract class Payment {

    abstract void processPayment(double amount);
}

class CreditCardPayment extends Payment {

    void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment: " + amount);
        System.out.println("Credit Card Payment Successful");
    }
}

class UPIPayment extends Payment {

    void processPayment(double amount) {
        System.out.println("Processing UPI Payment: " + amount);
        System.out.println("UPI Payment Successful");
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        CreditCardPayment c = new CreditCardPayment();
        UPIPayment u = new UPIPayment();

        c.processPayment(500);
        u.processPayment(300);
    }
}