package main.com.jse.lect13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Mango");
    list.add("Owl");
    list.add("Apple");
    list.add("Lotus");
    list.add("Java");
    list.add("Ironman");

    String[] strings = list.toArray(new String[0]);

    for (String str : strings) System.out.println(str);
  }
}
