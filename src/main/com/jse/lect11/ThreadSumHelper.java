package main.com.jse.lect11;

import java.util.concurrent.Callable;

public class ThreadSumHelper implements Callable {
  private final int[] nums;
  private final int low;
  private final int high;

  public ThreadSumHelper(int[] nums, int low, int high) {
    this.nums = nums;
    this.low = low;
    this.high = high;
  }

  @Override
  public Integer call() {
    int partialSum = 0;
    for (int i = low; i <= high; i++) {
      partialSum += nums[i];
    }
    System.out.println("Thread details:"+Thread.currentThread().getName()+" Individual thread sum: "+partialSum);
    return partialSum;
  }
}
