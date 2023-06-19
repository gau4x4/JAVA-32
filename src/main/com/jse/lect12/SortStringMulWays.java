package main.com.jse.lect12;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringMulWays {
  public static void main(String[] args) {
    String[] strings = {"cat", "animal", "someone", "program"};

    Arrays.sort(
        strings,
        Comparator.comparingInt(String::length)
            .thenComparing(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed()));
//    Arrays.stream(strings).sorted(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed());
    Arrays.stream(strings).forEach(s-> System.out.println(s));

  }
}
