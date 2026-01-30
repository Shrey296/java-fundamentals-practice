import java.util.Scanner;

public class P4_WithoutStatic1 {
        int n;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        P4_WithoutStatic1 m = new P4_WithoutStatic1();
        m.n = s.nextInt();
        System.out.println(m.n);
        s.close();
    }
}
