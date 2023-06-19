package main.com.jse.lect12;

import java.util.Arrays;
import java.util.List;

public class VowelsInString {
  public static void main(String[] args) {
    String[] strings = {"apple", "banana", "cherry", "date"};

    List<String> stringList = Arrays.asList(strings);

    stringList.stream()
        .filter(s -> containsVowels(s))
        .forEach(
            s -> {
              int vowelCount = countVowels(s);
              System.out.println("String: " + s + " | Vowel Count: " + vowelCount);
            });
  }

  private static boolean containsVowels(String s) {
    return s.toLowerCase().matches(".*[aeiou].*");
  }

  private static int countVowels(String s) {
    return (int) s.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
  }
}
