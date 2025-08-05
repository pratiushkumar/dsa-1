package Delta;

import java.util.Scanner;

public class Iversion {
    public static int invcount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        System.out.print("total count is this " + count);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number of elements ");
        int elements  =  sc.nextInt();
        int[] arr = new int[elements];
        System.out.println("enter the array elements ");
        for(int i =0; i<arr.length; i ++  ) {
           arr[i] = sc.nextInt();
            }

        invcount(arr);
    }
}
