package main.com.jse.lect11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDividedSum {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    int[] nums = new int[100];
    Random rand = new Random();
    for (int i = 0; i < nums.length; i++) {
      nums[i] = rand.nextInt(100);
    }

    int threadCount = 5;
    int elemsPerThread = nums.length / threadCount;

    ExecutorService es = Executors.newFixedThreadPool(5);
    List<Future<Integer>> list = new ArrayList<>();
    for (int i = 0; i < threadCount; i++) {
      int low = i * elemsPerThread;
      int high = (i == threadCount - 1) ? nums.length - 1 : low + elemsPerThread - 1;
      Future<Integer> ret = (Future<Integer>) es.submit(new ThreadSumHelper(nums, low, high));
      list.add(ret);
    }

    es.shutdown();
    int finamSum = 0;
    for (Future<Integer> i : list) {
      try {
        finamSum += i.get();
        System.out.println("Individual thread sum: "+i.get());
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      } catch (ExecutionException e) {
        throw new RuntimeException(e);
      }
    }
    System.out.println("Final sum: " + finamSum);
  }
}
