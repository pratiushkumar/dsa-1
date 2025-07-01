import java.util.*;

public class Sentence {
    public static void main(String[] args) {
        System.out.println("enter thje string with last char as numeric");
        Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("this is the input String ;"+ input);
        String[] Parts =  input.split(" ");
        HashMap<String,Integer> store = new HashMap<>();
        for(String part : Parts) {
            //remove numbers
            String word = part.replaceAll("[0,9]"," ");
            Integer num = Integer.parseInt(part.replaceAll("[^0-9]", ""));
            store.put(word,num);
        }
        System.out.println("hash map is"+store);
//
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(store.entrySet());

        // Sort list by value (ascending)
        Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue));

        // Print sorted map

            for (Map.Entry<String, Integer> entry : entryList) {
                System.out.print(entry.getKey() + " ");
        }
    }
}
