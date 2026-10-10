public class Person {

    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {

        Employee e = new Employee("Alice", 30, "E123", 50000);
        e.display();
    }
}

class Employee extends Person {

    String empId;
    double salary;

    Employee(String n, int a, String id, double s) {
        super(n, a);
        empId = id;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}