import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {
        int arr[] = {12, 15, 20, 65, 48, 10, 11, 17, 13};
        Predicate<Integer> pop = i-> i%3 ==0;
        System.out.println("the numbers which are divided by 3 are  ");
        m1(pop,arr);

    }
    public static void m1(Predicate<Integer> po ,int[] arr) {
    for(int ele : arr)
        if(po.test(ele))
        System.out.println(ele);
    }
    }

