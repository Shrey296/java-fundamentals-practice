// WAP to calculate sum of elements in an array using command line arguments

public class P6_ArrayCL_Sum {
    public static void main(String[] args) {
        
        int sum = 0;
        for(int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
