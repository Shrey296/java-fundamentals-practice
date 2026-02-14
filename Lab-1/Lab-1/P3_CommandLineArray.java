// WAP that takes array input from command-line arguments, stores the values in a String array, and prints the array.
public class P3_CommandLineArray {
    public static void main(String[] args) {
        String[] arr = args;
        System.out.println("Array elements are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// put values after java filename