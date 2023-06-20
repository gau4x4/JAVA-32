package main.com.jse.lect13;

import java.util.ArrayList;
import java.util.List;

public class ListLastObjectRemoval {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);

    list.remove(list.size() - 1);

    for (Integer i : list) System.out.println(i);
  }
}
