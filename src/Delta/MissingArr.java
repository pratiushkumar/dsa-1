package Delta;

public class MissingArr {

    public class MissingElement {
        public static int findMissing(int[] arr, int n) {
            // Calculate expected sum of first n numbers
            int expectedSum = n * (n + 1) / 2;

            // Calculate actual sum of array elements
            int actualSum = 0;
            for (int i = 0; i < arr.length; i++) {
                actualSum += arr[i];
            }

            // Missing number is the difference
            return expectedSum - actualSum;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 5}; // Example, n = 5, missing = 3
            int n = 5;
            System.out.println("Missing number: " + findMissing(arr, n));
        }
    }
