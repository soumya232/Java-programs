public class Student {

    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.print("Default Constructor: ");
        s1.display();

        Student s2 = new Student("John", 20);
        System.out.print("Parameterized Constructor: ");
        s2.display();

        Student s3 = new Student(s2);
        System.out.print("Copy Constructor: ");
        s3.display();
    }
}