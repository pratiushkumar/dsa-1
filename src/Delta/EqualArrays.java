package Delta;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
public static boolean Equal (int[] arr1, int[] arr2) {
    if(arr1 == null && arr2 ==null) {
        return true;
    }
     if(arr1.length ==0 && arr2.length ==0)
     {
     return true ;
     }
    if (arr1 == null || arr2 == null) {
        return false;
    }
    if (arr1.length != arr2.length) {
        return false;
    }

     Arrays.sort(arr1);
     Arrays.sort(arr2);
     System.out.println("after sorting the array is ");
       for(int i=0; i <arr1.length; i++) {
           System.out.println("[" + arr1[i] + "]");
       }
//       for(int i=0; i<arr2.length; i++) {
//           System.out.println("[" + arr2 + "]");
//       }
    return Arrays.equals(arr1, arr2);
}
    public static void main(String[] args ) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the size of the first array ");
        int size1 =  sc.nextInt() ;
        System.out.println("enter the size of second element ");
        int size2 =  sc.nextInt();
        if(size1 != size2) {
            System.out.println("array sizes are different can't be matched ");
            sc.close();
        }
        System.out.println("entwr the " + size1 + "elements ");
        int[] sizarr =  new int[size1];
        for(int i=0;i <sizarr.length; i++) {
               sizarr[i]  = sc.nextInt();
        }

        System.out.println("entwr the " + size1 + "elements ");
        int[] sizarr2 =  new int[size2];
        for(int i=0;i <sizarr.length; i++) {
            sizarr2[i]  = sc.nextInt();
        }
        System.out.println("working in correct way ");
        boolean result = Equal(sizarr, sizarr2);
        if (result) {
            System.out.println("Both arrays have the same elements.");
        } else {
            System.out.println("Arrays are not equal.");
        }

        sc.close();

    }
}
