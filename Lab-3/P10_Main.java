// WAP to print a value by using keywords super and this

class Parent {
    int num = 10;
}

class Child extends Parent {
    int num = 20;
    void show() {
        System.out.println("Using this keyword: " + this.num);
        System.out.println("Using super keyword: " + super.num);
    }
}

public class P10_Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
