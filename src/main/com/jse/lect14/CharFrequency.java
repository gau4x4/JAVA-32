package main.com.jse.lect14;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
  public static void frequencyHelper(String str) {
    if (str.length() == 0) return;
    Map<Character, Integer> map = new HashMap<>();

    for (Character c : str.toCharArray()) {
      if (!c.equals(' ')) map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (Map.Entry<Character, Integer> m : map.entrySet())
      System.out.println("Char: " + m.getKey() + " has a freqeuncy of: " + m.getValue());
  }

  public static void main(String[] args) {
    frequencyHelper("test string");
  }
}
