import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySarch {
    public int binary() {
        // Take the length of the array
        System.out.println("Enter the length of the array:");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        // Input the array
        int[] arr = new int[length];
        System.out.println("Enter the array elements (in sorted order):");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the target
        System.out.println("Enter the target value to search:");
        int target = sc.nextInt();

        // Close Scanner to prevent resource leak
        sc.close();

        // Sort the array (if not guaranteed to be sorted)
        Arrays.sort(arr); // Comment this out if the input is guaranteed sorted

        // Handle edge cases
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return arr[0] == target ? 0 : -1;
        }

        // Initialize low and high correctly
        int low = 0;
        int high = arr.length - 1; // Last index, not arr[0]

        while (low <= high) {
            int mid = low + (high - low) / 2; // Correct mid calculation
            if (arr[mid] == target) {
                System.out.println("Target found at index: " + mid);
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1; // Search right half
            }
        }
        System.out.println("Target not found");
        return -1;
    }

    public static void main(String[] args) {
        BinarySarch bs = new BinarySarch();
        int result = bs.binary();
        // Optionally print result in main
        if (result != -1) {
            System.out.println("Returned index: " + result);
        } else {
            System.out.println("Returned: -1 (Target not found)");
        }
    }
}