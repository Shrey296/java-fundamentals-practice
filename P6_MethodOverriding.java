class A{
    int sum(int a, int b){
        return a+b;
    }
    
}
class B extends A{
    int sum(int a, int b){
        return a+b;
    }
    int supersum(int a, int b){
        return super.sum(a, b);
    }
}

public class P6_MethodOverriding {
    public static void main(String[] args) {
        B sumB = new B();
        System.out.println("Class A Output: " + sumB.sum(2,3));
        System.out.println("Class B Output: " + sumB.supersum(2, 3));
    }
}
