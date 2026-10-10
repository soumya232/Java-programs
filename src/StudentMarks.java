
import java.util.Scanner;

public class StudentMarks {

    void enterMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException(
                    "Marks must be between 0 and 100"
            );
        }

        System.out.println("Marks entered successfully");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        StudentMarks s = new StudentMarks();

        try {
            s.enterMarks(marks);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the system");
        }

        sc.close();
    }
}
