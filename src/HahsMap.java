import java.util.HashMap;
import java.util.Scanner;


import java.util.HashMap;
import java.util.Scanner;

public class HahsMap {
    public static void main(String[] args) {
        HashMap<String, Integer> store = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of entries you want in the HashMap:");
        int length = sc.nextInt();

        System.out.println("Enter the keys (String) and values (Integer) separated by space:");

        for (int i = 0; i < length; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            store.put(key, value);

            System.out.println("Entry added: Key = "+"|" + key + ", Value = "+"|" + value);
        }

        System.out.println("\nFinal HashMap:");
        for (String key : store.keySet()) {
            System.out.println("Key: " + key + ", Value: " + store.get(key));
        }

        sc.close();
    }
}
