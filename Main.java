import java.util.Scanner;

class Count{
}

public class Main{
    int n;
    int sum = 0;
    public static void main(String[] args) {
        Main m = new Main();
        Scanner s = new Scanner(System.in);
        m.n = s.nextInt();
        System.out.println(m.n);
        s.close();
    }
}
