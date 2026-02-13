class A {
    int sum(int a, int b) {
        return a + b;
    }
}

class B extends A {
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class P6_MethodOverloading {
    public static void main(String[] args) {

        A sumA = new A();
        System.out.println("Subject Sum: " + sumA.sum(4, 5));

        B sumB = new B();
        System.out.println("Maths Sum: " + sumB.sum(4, 5, 9));
    }
}
