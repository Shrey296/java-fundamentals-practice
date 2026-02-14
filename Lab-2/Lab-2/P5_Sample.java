// Declare the variable above the main method and access it inside main by creating an object of the class

public class P5_Sample {
    int number;
    public static void main(String[] args) {
        P5_Sample obj = new P5_Sample();
        obj.number = 10;
        System.out.println(obj.number);
    }
}
