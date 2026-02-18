import java.util.Scanner;

class Employee {
    String name;
    int age;
    float salary;

    Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println("\nEntered Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class P8_Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name (20 characters max): ");
        String name = sc.nextLine();

        System.out.print("Enter Age (must be more than 5): ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        float salary = sc.nextFloat();

        if (name.length() <= 20 && age > 5) {

            Employee e1 = new Employee(name, age, salary);
            e1.display();

            System.out.println("\nData is added successfully");

        }
        else {
            System.out.println("\nInvalid input. Follow the conditions");
        }

        sc.close();
    }
}
