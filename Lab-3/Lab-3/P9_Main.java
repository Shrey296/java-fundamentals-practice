// Write a Java program where a constructor is defined in one class and invoked from the main class

class Student {
    Student() {
        System.out.println("Constructor is called");
    }
}
public class P9_Main {
    public static void main(String[] args) {
        new Student();
    }
}
