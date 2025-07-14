import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {
         int[] arr = {10,11,9,20,25,65,54,10,4,20};
        Predicate<Integer> pop = i-> i>10;
        m1(pop,arr);
    }
    public static void m1(Predicate<Integer>p,int[] x){
        for(int ele : x)
            if(p.test(ele))//ele -> ele>10
                System.out.println(ele);//ele ->ele>10
    }
}
