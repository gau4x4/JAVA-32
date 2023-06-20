package main.com.jse.lect13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTraversal {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Someone");
    list.add("Someone");
    list.add("Someone");
    list.add("Someone");
    list.add("Someone");
    list.add("Someone");
    System.out.println("Traversal using for Loop:");
    for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));

    System.out.println("Traversal using enhanced for Loop:");
    for (String str : list) {
      System.out.println(str);
    }
    System.out.println("Traversal using Iterator:");
    Iterator<String> iterator = list.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("Traversal using forEach:");

    list.forEach((str) -> System.out.println(str));
    System.out.println("Traversal using Parallel Stream:");

    list.stream().parallel().forEach(str -> System.out.println(str));
  }
}
