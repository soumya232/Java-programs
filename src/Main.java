import java.util.Scanner;

class ATM {
    double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance");
        }

        balance = balance - amount;
        System.out.println("Remaining Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        ATM atm = new ATM(balance);

        try {
            atm.withdraw(amount);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction Completed");
        }

        sc.close();
    }
}