import java.util.function.Predicate;

public class Test3 {

     public static void main(String[] args) {
         Predicate<Integer> po = age -> age>18;
         System.out.println(po.test(12));
         System.out.println(po.test(19));

     }

}
