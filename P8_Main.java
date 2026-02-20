import java.util.Scanner;
import java.util.InputMismatchException;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidNameException extends Exception {
    InvalidNameException(String message) {
        super(message);
    }
}

class InvalidSalaryException extends Exception {
    InvalidSalaryException(String message) {
        super(message);
    }
}

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
        String name = "";
        int age = 0;
        float salary = 0;

        try {
            System.out.print("Enter Name (20 characters max): ");
            name = sc.nextLine();

            if (name.length() > 20) {
                throw new InvalidNameException("Name can't exceed 20 characters");
            }

            System.out.print("Enter Age (must be more than 5): ");
            age = sc.nextInt();

            if (age <= 5) {
                throw new InvalidAgeException("Age must be greater than 5");
            }

            System.out.print("Enter Salary (must be positive): ");
            salary = sc.nextFloat();

            if (salary < 0) {
                throw new InvalidSalaryException("Salary cannot be negative");
            }

            Employee e1 = new Employee(name, age, salary);
            e1.display();
            System.out.println("\nData is added successfully");

        } 
        catch (InputMismatchException e) {
            System.out.println("\nInvalid datatype entered");
        } 
        catch (InvalidNameException | InvalidAgeException | InvalidSalaryException e) {
            System.out.println("\nError: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("\nUnexpected Error occurred");
        } 
        finally {
            sc.close();
        }
    }
}