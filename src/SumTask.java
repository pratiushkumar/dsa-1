//first we need to create the Recursive task class that will extends the recusrsoive task class provided by the java

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {
    private final long[] arr;
    private final int high;
    private final int low;

    public SumTask(long[] arr,int high,int low ) {
        this.arr = arr;
        this.high = high;
        this.low=low;
    }
    @Override
    public Long compute() {
        //if the taskk is smaller no ned to steal it from any other task we canimplement it with a logic
        if (high - low < 10) {
            long sum = 0;
            for (int i = low; i < high; i++) {
                sum = sum + arr[i];
            }
            return sum;
        } else {
            //if th stask is too big we can divide it into smaller subtasks
            int mid = (low + high) / 2;
            SumTask left = new SumTask(arr, low, mid);
            SumTask right = new SumTask(arr, high, mid);
            left.fork();
            Long rightResult = right.compute();
            Long leftResult = left.join();
            return leftResult + rightResult;
        }
    }
}
