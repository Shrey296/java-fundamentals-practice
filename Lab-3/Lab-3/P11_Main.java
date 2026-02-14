// WAP to print a value by using keyword Static and without using static

public class P11_Main {
    static int a = 10;
    int b = 20;

    public static void main(String[] args) {

        System.out.println("Static value: " + a);

        P11_Main obj = new P11_Main();
        System.out.println("Non-static value: " + obj.b);
    }
}
