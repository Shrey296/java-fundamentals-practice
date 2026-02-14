// WAP to tell frequency of a particular element in an array
import java.util.Scanner;

public class P7_FreqElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to find frequency: ");
        int key = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency of " + key + " is: " + count);
        sc.close();
    }
}
