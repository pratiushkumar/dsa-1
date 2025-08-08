import java.util.concurrent.ForkJoinPool;

public class JavaForkExmple {
    public static void main(String[] args) throws InterruptedException{
        int proc = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of available core in the processor is: "
                + proc);

        ForkJoinPool pooling  =  ForkJoinPool.commonPool();
        //getting no of active threads
        System.out.println("the number of active threads "+ pooling.getActiveThreadCount());
    }
}
