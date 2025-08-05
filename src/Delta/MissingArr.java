package Delta;

import java.util.Scanner;

public class MissingArr {
public static int missingfunc(int n,int[] arr) {
    int expectedsum = n * (n + 1) / 2;
    int actualsum = 0;
    for (int i = 0; i < arr.length; i++) {
        actualsum = actualsum + i;
    }
    return expectedsum - actualsum;
}
        public static void main(String[] args) {
            Scanner sc  = new Scanner(System.in);
            System.out.println("enter the number of elements you want ");
            int elements = sc.nextInt();
            System.out.print("eneter the elemnts : ");
            int[] arr =  new int[elements];
            for(int i=0;i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the total number of elements ");
            int missing = sc.nextInt();
            System.out.println("Missing number: "+ missingfunc(elements,arr));

        }
    }
