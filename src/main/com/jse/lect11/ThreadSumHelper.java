package main.com.jse.lect11;

import java.util.concurrent.Callable;

public class ThreadSumHelper implements Callable {
  private final int[] array;
  private final int low;
  private final int high;

  public ThreadSumHelper(int[] array, int low, int high) {
    this.array = array;
    this.low = low;
    this.high = high;
  }

  @Override
  public Integer call() {
    int partialSum = 0;
    for (int i = low; i <= high; i++) {
      partialSum += array[i];
    }
    return partialSum;
  }
}
