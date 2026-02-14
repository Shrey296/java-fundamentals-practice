// WAP to check whether Array contain duplicate or not

import java.util.Scanner;

public class P8_ArrayDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean duplicate = false;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
        }
        if(duplicate) {
            System.out.println("Array has duplicate elements");
        }
        else {
            System.out.println("Array doesn't have duplicate elements");
        }
        sc.close();
    }
}
