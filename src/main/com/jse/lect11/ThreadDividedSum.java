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
    int[] nums = new int[115];
    Random rand = new Random();
//    int sum3 = 0;
    for (int i = 0; i < nums.length; i++) {
      nums[i] = rand.nextInt(100);
//      sum3 += nums[i];
    }
//    System.out.println(sum3);
    int threadCount = 4;
    int elemsPerThread = nums.length / threadCount;

    ExecutorService es = Executors.newFixedThreadPool(threadCount);
    List<Future<Integer>> list = new ArrayList<>();
    for (int i = 0; i < threadCount; i++) {
      int low = i * elemsPerThread;
      int high = (i == threadCount - 1) ? nums.length - 1 : low + elemsPerThread - 1;
      Future<Integer> ret = es.submit(new ThreadSumHelper(nums, low, high));
      list.add(ret);
    }

    es.shutdown();
    int finamSum = 0;
    for (Future<Integer> i : list) {
      try {
        finamSum += i.get();
      } catch (InterruptedException | ExecutionException e) {
        throw new RuntimeException(e);
      }
    }
    System.out.println("Final sum: " + finamSum);
  }
}
