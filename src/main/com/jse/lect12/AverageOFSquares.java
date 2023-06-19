package main.com.jse.lect12;

import java.util.Arrays;
public class AverageOFSquares {
  public static void main(String[] args) {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    if(numbers.length>0){
      double average =
              Arrays.stream(numbers)
                      .filter(n -> n % 2 != 0)
                      .mapToDouble(n -> n * n)
                      .average()
                      .orElse(0);

      System.out.println("Average of squares of odd numbers: " + average);
    }

  }
}
