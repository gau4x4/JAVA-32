package main.com.jse.lect12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CapitalizeSort {
  public static void main(String[] args) {
    String[] strings = {"apple", "banana", "cherry", "date"};

    String[] capitalizedStrings =
        Arrays.stream(strings)
            .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1)).sorted()
            .toArray(String[]::new);

    Arrays.stream(capitalizedStrings).forEach(System.out::println);
  }
}
