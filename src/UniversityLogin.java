
import java.util.Scanner;

public class UniversityLogin {

    void login(String username) {
        if (username == null) {
            throw new NullPointerException(
                    "Username cannot be null"
            );
        }

        System.out.println("Login successful: " + username);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (username.equalsIgnoreCase("null")) {
            username = null;
        }

        UniversityLogin u = new UniversityLogin();

        try {
            u.login(username);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
