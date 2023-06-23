package main.com.jse.lect15;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
  public static void removeDupHandler(String str) {
    if (str.length() == 0) System.out.println("Empty String");

    Set<Character> set = new LinkedHashSet<>();

    for (Character character : str.toCharArray()) set.add(character);

    System.out.println("String without duplicates:" + set);
  }

  public static void main(String[] args) {
    removeDupHandler("Rebecca");
  }
}
