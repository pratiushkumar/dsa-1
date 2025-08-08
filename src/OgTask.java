import java.util.concurrent.ForkJoinPool;

public class OgTask {
     public static void main(String[] args){
      long[] arr =  new long[100];
         for(int i = 0; i<arr.length;i++)  {
             arr[i] = i;
         }
         ForkJoinPool instance  =  new ForkJoinPool();
         SumTask insta  =  new SumTask(arr,0,arr.length);
         Long obj =  instance.invoke(insta);
         
         System.out.println(obj);
     }
}
