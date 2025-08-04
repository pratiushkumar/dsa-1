import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Kelements {
    public static void klarsma(int k, int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }

        // Find k largest elements
        // For simplicity, we'll sort the array in descending order and print first k elements
        // First, create a copy of the array to avoid modifying the original
        Integer[] sortedArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }

        // Sort in descending order
        Arrays.sort(sortedArr, Collections.reverseOrder());

        // Print k largest elements
        System.out.println("The " + k + " largest elements are:");
        for (int i = 0; i < Math.min(k, arr.length); i++) {
            System.out.println(sortedArr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get array size
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        // Validate size
        if (size <= 0) {
            System.out.println("Invalid array size");
            return;
        }

        // Initialize array and get elements
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Get number of elements to print
        System.out.println("Enter the number of largest elements you want to print:");
        int elements = sc.nextInt();

        // Validate k
        if (elements <= 0) {
            System.out.println("Invalid number of elements");
            return;
        }

        klarsma(elements, arr);
        System.out.println("Done");

        sc.close();
    }
}