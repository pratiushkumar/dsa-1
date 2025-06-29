import java.util.HashMap;
import java.util.Scanner;

public class hashmap {

    public static void main(String[] args) {
        HashMap<String, Integer> store = new HashMap<>();
        int maxlen=0;
        System.out.println("enter the String you want ");
        Scanner sc = new Scanner(System.in);
        String make = sc.next();
        System.out.println("the string is  :" + make);
        for(int i=0;i<make.length();i++) {
            String c = String.valueOf(make.charAt(i));
            if(store.containsKey(c)) {
                store.put(String.valueOf(c),store.get(c)+ 1);
            }
            else{
                store.put(String.valueOf(c),1);
            }
            if
        }
System.out.println(store);


    }
        //A SUSBSTRING THAT OCCURS THRICE
    //aaab


}
